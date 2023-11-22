package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Ex01_02 {
	
//	 Map 컬렉션 클래스 사용
//    key : 1조, 2조, 3조
//    value :		직위(급)과 이름을 저장하는 클래스를 선언		//MemberVO 
//         	    	그 클래스 객체를 저장하는 컬렉션 클래스 사용   
//         	    	저장하고 출력하는 코딩
	
	public static void main(String[] args) { 
		String fileName = ".\\src\\days24\\1. Java 팀 구성.txt";
		
		ArrayList<MemberVO> teamList = null;	//value
		HashMap<String, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();

		String line = null; //한 line
		String teamName = null; //key
		MemberVO memberVO= null;
		
		try(FileReader reader= new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);){
			while ((line = br.readLine()) !=null && ! line.equals(""))  {
				//if (line.equals("")) break; //공백만나면 제어문 멈춤
				
				teamName = line;	//key
				line = br.readLine();	//팀원 이름라인
				String[] tNames =line.split("\\s*,\\s*");
				teamList =new ArrayList<MemberVO>();
				for (String tName : tNames) {
					if (tName.contains("(팀장)")) { // or lastindexof
						tName = tName.replace("(팀장)", "");
						memberVO = new MemberVO(tName, "팀장");
					}else {
						memberVO = new MemberVO(tName, "팀원");
					}
					teamList.add(memberVO);	//value	
				}//foreach
				teamMap.put(teamName, teamList);		
			}//w
			
			//출력
			dispTeamMember(teamMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}//c
		
		
	}

	private static void dispTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>>eset =teamMap.entrySet(); 
		//entrySet = hashMap 의 key, value값 다갖고있음
		
		Iterator<Entry<String, ArrayList<MemberVO>>> ir =eset.iterator();
		
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		int teamCount =1;
		MemberVO teamLeaderVO = null;
		String teamLeaderName = null;
			
		while (ir.hasNext()) {
			Entry<String,ArrayList<MemberVO>> entry =ir.next();
//					  팀명
			//팀장출력
			teamName = entry.getKey();
			teamList = entry.getValue();
			teamCount =teamList.size();
			teamLeaderVO = teamList.get(0);
			teamLeaderName = teamLeaderVO.getName();
			System.out.printf("[%s(%d명):%s]\n",teamName,teamCount,teamLeaderName);
			//팀원출력
//			teamList.subList(1, teamCount);
			Iterator<MemberVO> ir2=teamList.iterator();
			int seq=1;
			if(ir2.hasNext() ) ir2.next(); //팀장 읽어와서 제외
			while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf("[%d]%s\n",seq++, memberVO.getName());
			}
			
		}//w
		
	}
}

