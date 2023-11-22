package days06;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

//람다식과 스트림
public class Ex01_03 {
	public static void main(String[] args) {
	//10개 정수 배열 -> 가장큰값 (람다식과 스트림)
		//int[]m=new Random(). ints(5,16.).limit(10).toArray();
		//System.out.println(Arrays.toString(m));
		
		int max= new Random().ints(5,16).limit(10).max().getAsInt();
		System.out.println(max);
		
		
	//------------------------------------------------------------------
		int a=5, b=7,c=1;
		//[1]
		//System.out.println(IntStream.of(a,b,c).max());
		//값:OptionalInt[7]
		
		//[2]
		//OptionalInt[7]에서 값 7만 출력 : getAsInt();
		/*int max =IntStream.of(a,b,c).max(). getAsInt();
		System.out.println(max);
		*/
		
		// [2] System.out::println  => 메서드 참조
		IntStream.of(a,b,c).max().ifPresent(System.out::println);
		
	
		
	}

}
