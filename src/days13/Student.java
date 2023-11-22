package days13;
		//멤버 = 멤버변수 (필드) + 멤버함수 (매서드)
public class Student {
	//필드
	public int no;
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public double avg;
	public int rank;
	public int wrank;
	
	//매서드 (학생정보 출력)
	public void printStudentInfo() {
		
			System.out.printf("%d번 \t%s \t%d \t%d \t%d \t%d  \t%.2f  \t%d등\n"
					, no, name, kor, eng,mat, tot, avg, rank);
	}		
}//class
