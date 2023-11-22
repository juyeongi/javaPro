package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringJoiner;

public class Ex01 {
	public static void main(String[] args) {
		//"1. Java 팀 구성.txt"  파일을 읽어서 본인의 팀원들만의 이름을 teamMember 배열에 저장한 후 팀장명을 제외한 나머지 팀원들의 이름을  내림차순으로 정렬해서 아래와 같이 출력하는 코딩을 하세요.
		//[실행결과]  예 : [ 2조 ]
		
		//1. 경로 불러오기
		//E:\Class\Workspace\JavaClass\javaPro
		String key ="user.dir";
		String userDir = System.getProperty(key);
		//System.out.println(userDir);
		
		String fileName = "1. Java 팀 구성.txt";
		String path = String.format("%s\\src\\days19\\%s", userDir, fileName);
		//System.out.println(path);
		String line = null;
		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);
				) {
			while ((line =br.readLine())!=null) {//파일 끝을 만날 때까지
				//System.out.println(line); //라인값 출력 > 파일 모든 내용 출력 확인
				if (line.equals("3조")) { //3조찾기
					line = br.readLine(); //다음라인읽기
					System.out.println(line);
					break;//3조 읽고 if문 빠져나오기
				}//if
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//[3조] 박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
		//리더찾기
		String regex = "\\s*,\\s*"; //, 사이 공백 지우기
		String []teamMembers = line.split(regex);
		String teamLeader=null;
		//팀원 배열에 담기
		String [] teamMembers2 = new String [teamMembers.length-1];
		for (int i = 0, index=0; i< teamMembers.length; i++) {
			if( teamMembers[i].contains("(팀장)")){
				teamLeader = teamMembers[i].replace("(팀장)", "");
			//	break; 
			continue;
			}
			//팀원
			teamMembers2[index++] = teamMembers[i];
		} //	for
		System.out.println(">temaLeader :" + teamLeader);
		System.out.println(Arrays.toString(teamMembers2));
		//팀장제외 내림차순 정렬
		Arrays.sort(teamMembers2,(n1,n2)->n2.compareTo(n1));
		
		/*
		String output ="</ul>";
		output += String.format("\r\n\t<li class=\"leader\">&s</li>",teamLeader);
		output += "\r\n\t<li>"+String.join("</li>\r\n<li>", teamMembers2)+"</li>";
		output +="\r\n</ul>";
		*/
		StringBuilder sb = new StringBuilder();
		sb.append("</ul>");
		sb.append(String.format("\r\n\t<li class=\"leader\">&s</li>",teamLeader));
		sb.append("\r\n\t<li>"+String.join("</li>\r\n<li>", teamMembers2)+"</li>");
		sb.append("\r\n</ul>");
		
		System.out.println(sb.toString());
		
		
		
		/* [char 시퀀스 사용]
		StringJoiner sj = new StringJoiner("</li>\r\n<li>", "\t<li>", "</li>");
		sj.add()
		*/
	}
}


