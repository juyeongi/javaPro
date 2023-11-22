package days03;

public class Ex05_06 {
	
	
	//***단항연산자 ++ -- :증감연산자

	public static void main(String[] args) {
		
		//어떤 기억공간의 값을 1 증가시키는 코딩
		//어떤 기억공간의 값을 1 감소시키는 코딩
		int n = 10;
		System.out.println(n); //10
		
		//n = 11;
		//현재 기억공간 (n)의 값을 읽어온 후 +1
		/*
		[n= n+1;]         
		2)n+= 1;  복합대입연산자 += 
		3)n++; 후위형 증감연산자
		4)++n; 전위형 증감연산자
		[n= n-1;] 
		2)n-= 1; 복합대입연산자 -=
		3)n--;
		4)--n;
		*/
		System.out.println(n); //11
		
		
		

	}//main

}//class
