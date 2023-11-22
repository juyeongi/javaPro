package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import days24.MemberVO;

public class Ex01 {
	public static void main(String[] args) {
		String fileName = ".\\src\\days24\\1. Java 팀 구성.txt";
		
		ArrayList<MemberVO> teamList = null;
		HashMap<TeamVO, ArrayList<MemberVO>> teamMap =new LinkedHashMap<>();
		
		String line =null;
		String teamName=null;
		int teamtotalNumber = 0;
		String teamLeaderName = null;
		
		TeamVO teamVO =null;
		MemberVO memberVO = null;
		
		try(FileReader reader =new FileReader(fileName); BufferedReader br = new BufferedReader(reader);){
			while ((line = br.readLine()) !=null && ! line.equals("") ) {
				teamName = line;
				line = br.readLine() ;
				String [] tNames = line.split("\\s*,\\s");
				teamList =new ArrayList<MemberVO>();
				for (String tName : tNames) {
					if( tName.contains("(팀장)")) {
						teamLeaderName=tName = tName.replace("(팀장)", "");
						memberVO= new MemberVO(tName, "팀장");
					}else {
						memberVO= new MemberVO(tName, "팀원");
				
					}//ifelse
					teamList.add(memberVO);
				}//for
				teamtotalNumber = teamList.size();
				teamVO = new TeamVO(teamName ,teamtotalNumber ,teamLeaderName);
				teamMap.put(teamVO, teamList);	
			}//while
			
			//==================
			//key가 중복이된다면,, 팀명이 같으면 key중복 처리
			teamVO =new TeamVO("1조",1,"홍길동"	);
			if 	(! teamMap.containsKey(teamVO)) {
				teamList = null;
				teamMap.put(teamVO, teamList);
			}else {
				System.out.println(">>1조는 teamMap에 사용중");
			}

			
			
			dispTeamMember(teamMap);
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
	}//m

	private static void dispTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
		Set<Entry<TeamVO, ArrayList<MemberVO>>>eset =teamMap.entrySet(); 
		
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir =eset.iterator();
		

		ArrayList<MemberVO> teamList = null;
		TeamVO teamVO =null;
			
		while (ir.hasNext()) {
			Entry<TeamVO,ArrayList<MemberVO>> entry =ir.next();

			//팀장출력
			teamVO = entry.getKey();
			teamList = entry.getValue();
			System.out.printf("%s\n", teamVO	);
			
			//팀원 출력
			//[1]
			/*
			if (teamList !=null) {
				Iterator<MemberVO> ir2=teamList.iterator();
				int seq=1;
			
				if(ir2.hasNext() ) ir2.next();
				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
				
					System.out.printf("[%d]%s\n",seq++, memberVO.getName());
				}
			}else {
				System.out.println("팀원x");
			}
			*/
			//[2]
			try {
				Iterator<MemberVO> ir2=teamList.iterator();
				int seq=1;
				if(ir2.hasNext() ) ir2.next();
				while (ir2.hasNext()) {
					MemberVO memberVO = ir2.next();
					System.out.printf("[%d]%s\n",seq++, memberVO.getName());
				}	
			} catch (NullPointerException e) {
				System.out.println("팀원x");
			}catch (Exception e) {
				e.printStackTrace();
			}//catch
			
		}//w
	}//disp
}//c

