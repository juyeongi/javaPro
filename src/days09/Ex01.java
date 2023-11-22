package days09;
//복습 ex11_02 sw변수 사용
public class Ex01 {
	public static void main(String[] args) {
		int money=125760;
		int unit = 50000;//  5만/5 1만/2 5천/5 1천/2.... /5, /2반복
		boolean sw= false; //스위치변수
		int count =0; //화폐 갯수
		while (unit>=1) {
			      //가장 작은 화폐단위까지 반복
			count=money/unit;
			System.out.printf("%d원 :%d개\n", unit, count);
			money%=unit;//나머지값
			//if (sw==false) unit = unit/5;
			//else unit= unit/2;
			unit/=!sw? 5: 2;	
		
		}//while

	}//main
}//class

