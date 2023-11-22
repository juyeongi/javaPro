package days08;

public class Ex10_02 {
	public static void main(String[] args) {
		String rrn="930515-2000001";
				
		String[]rrnArr=rrn.split("-");
		//930515-2******
		System.out.printf("%s-%c******\n",rrnArr[0],rrn.charAt(7));//나누지않은 배열 기준 7번째
		System.out.printf("%s-%c******\n",rrnArr[0],rrnArr[1].charAt(0));//나눈 배열 기준 뒷쪽배열의 첫번째
		
		System.out.println(rrn.substring(0, 8)+"******");//  0~8 앞까지 잘라오기 :내가 원하는 위치에서 원하는만큼 자르기
		//930515-*******
		System.out.printf("%s-*******",rrnArr[0]);
		
	}//main
}//class
