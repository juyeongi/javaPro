package days03;


//**연산자를 사용해서 수식으로 표현
public class Ex10 {
	public static void main(String[] args) {
		
		// 1) x는 10보다 크다
		//     x > 10
		
		//2) x는 10보다 크고 20보다 작다
		//    x > 10   $$    x < 20    //*&&연산자 둘 다 참이여야 하는 연산
		
		//3) x는 2의 배수이다.
		//    x % 2 ==0   //x를 나누었을 때 0으로 떨어지는 수
		
		//4) x는 2의 배수 또는 3의 배수이다.
		//    x % 2 == 0 ||  x %3 == 0    //or연산자
		
		//5) x는 2의 배수이지만 6의 배수는 아니다.
		//    x % 2 == 0  &&   x % 6 !== 0
		//    x % 2 == 0  &&   ! ( x % 6 == 0 )
		
		//6) 한 문자(ch)가 숫자이다.
		// '0'~'9'
		//     char ch = '1';
		//     ch  == '0'  ||  ch  == '0'  || ~ ch  == '9'  
		//     '0'                   '9'
		//     48 <- && ch<- 57
		//'0' <-ch && ch<-'9' *** 숫자로 변환하지 않고 ch 사용
		
		//7) 한 문자가 소문자이다.
		//97(a) 98(b)~120(z)
		//97 <- && <-120
		//'a' <-ch && ch<-'z' ***
		
		//8) 한 문자가 알파벳이다. (대문자이거나 또는 소문자이다.)
		// 'a' <- ch && ch <- 'z' || 'A' <- ch && ch <- 'Z'
		// ('a' <- ch && ch <- 'z') || ('A' <- ch && ch <- 'Z')
		
		
	}//main

}//class
