package days08;
//복습 1,2
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		try (Scanner scanner=new Scanner(System.in)){
			int kor= getscore(scanner,"국어");
			
			char grade = getGrade(kor);
			System.out.printf(">kor=%d, grade=%c\n", kor, grade);
			
			//int eng=getscore(scanner,"영어");//문제[1]
			//int mat=getscore(scanner,"수학");//문제[1]
			//System.out.printf(">kor=%d, eng=%d, mat=%d\n", kor, eng, mat);//문제[1]
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		
	}//main

	
	private static char getGrade(int score) {//문제[2]
		                                           //식별자. 자유롭게 선언 가능
		char grade ='가';
		switch (score/10) {
		case 10: case 9: grade ='수'; break;
		case 8: grade ='우'; break;
		case 7: grade ='미'; break;
		case 6: grade ='양'; break;

		}//switch
		return grade;
	}


	public static int getscore(Scanner scanner, String subject) {//문제[1]
		                                    //매개변수 scanner, 과목명
		int score=0;
		boolean flag=false;//유효성검사
		String inputData;
		String
		regex="100|[1-9]?\\d";
		
			do {
				if (flag) {
					System.out.println(">점수 입력 잘못(1~100)다시 입력");					
					
				}//if
				System.out.printf(">점수입력", subject);
				//NoSuchElementException
				//존재하지 않는 것을 가져오려고 할 때 발생
				//Scanner에서 이 에러가 발생하는 경우는 더 이상 입력받을 수 있는 값이 없을 때
				//NoSuchElementException은 더이상 Element가 없는데도 불러오려고 할 때 발생한다. 
				//즉, Scanner가 읽어올 스트림이 없는데 읽으려고 해서 발생한 익셉션.
				//소스 상 어디에선가 Stream을 닫아주는 곳이 있다고 판단.
				//어디선가 scan.close();를 한 것입니다.
				//scan.close()을 통해 System.in이 종료되었으므로 해당 부분을 없애줍니다. 
				//**scanner는 프로세스 하나에 하나만 생성. 하나가 닫히면 System.in도 닫여서 입력불가.
				//scanner 메인함수로

			
				inputData= scanner.next();
				flag=true;
			}while(!inputData.matches(regex));
			score = Integer.parseInt(inputData);
			//입력받은 스트링데이터 다시 int로 변환
			
		
		return score;
	}//getscore
}//class
