package days08;

public class Ex11 {
	public static void main(String[] args) {
		
		int money =125760;
		int count =0; // 단위별 화폐수량
		//화폐단위 : 5만, 1만, 5천, 1천, 5백, 1백, 5십, 1십, 5, 1
		//125,760원 50,000, 10,000,5,000,1,000,500,100,50,10,5,1

		//5만:2
		count=money/50000;
		System.out.printf("5만원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=50000; //25760
		//1만:2
		count=money/10000;
		System.out.printf("1만원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=10000;
		//5천:1
		count=money/5000;
		System.out.printf("5천원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=5000; 
		//1천:0
		count=money/1000;
		System.out.printf("1천원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=1000; 
		//5백:1
		count=money/500;
		System.out.printf("5백원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=500; 
		//1백:2
		count=money/100;
		System.out.printf("1백원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=100;
		//5십:1
		count=money/50;
		System.out.printf("5십원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=50; 
		//1십:1
		count=money/10;
		System.out.printf("1십원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=10; 
		//5  :
		count=money/5;
		System.out.printf("5원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=5; 
		//1  :
		count=money/1;
		System.out.printf("1원:%d개\n", count); //나눈 몫이 값이 됨.
		money %=1;
		
	}//main

}//class
