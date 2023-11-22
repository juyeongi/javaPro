package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	
//		 로또 게임 횟수를 입력받아서 게임 횟수 만큼 로또 번호를 출력하는 전체 코딩을 하세요.
//	  ( 조건 : 컬렉션 클래스 선택 후 사용 )
//	  ( 조건 : 각 로또번호가 오름차순 정렬 후 출력 )
	
	
	//Set : 순서유지가 안되는 계열	
	//지정된 위치가 없기 때문에 .get(위치값) 호출 불가능
	//<제네릭> 요소타입 선언 (기본형x 클래스타입 입력)
	public static void main(String[] args) {
		int gameNumber =1;
		Scanner scanner=new Scanner(System.in);
		System.out.println(">게임 횟수 입력");
		gameNumber= scanner.nextInt();
		
		//ArrayList : 게임횟수만큼의 발생한 LinkedHashSet객체를 담을 공간
		ArrayList<LinkedHashSet> lottos=new ArrayList<>(); 
		//LinkedHashSet : 6개의 로또번호를 가지는 객체
		LinkedHashSet<Integer> lotto = null; //반복횟수에 따라서 new연산자 생성
		int lottoNumber=-1;
		for (int i = 0; i < gameNumber; i++) {
			lotto = new LinkedHashSet<>();
			while (lotto.size()<6) {
				lottoNumber=(int) (Math.random()*45+1);
				lotto.add(lottoNumber);
			}//while
			lottos.add(lotto);
		} //	for

		
		//정렬
//		LinkedHashSet>정렬불가(순서유지x) > List계열로 변환 후 출력
		
		ArrayList<Integer> sList = null;
		//출력
		Iterator<LinkedHashSet> ir = lottos.iterator();
		int no =1;
		while (ir.hasNext()) {
		//	LinkedHashSet lotto = (LinkedHashSet) ir.next();
											//다운캐스팅
			lotto=ir.next();	//제네릭 선언되었기때문에 다운캐스팅 필요없음
			
			sList = new ArrayList<Integer>(lotto);
			Collections.sort(sList);
			Iterator<Integer>ir2=sList.iterator();
			System.out.printf("%d게임: ",no++);
			while (ir2.hasNext()) {
				//Integer -> int 오토언박싱
				lottoNumber =ir2.next();
				System.out.printf("[%02d]",lottoNumber);
			}
			System.out.println();
		}

	}

	private static void dispLottos(ArrayList lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			LinkedHashSet lottos = (LinkedHashSet)ir.next();
			days22.Ex15.dispLotto(lottos);
		}
		System.out.println();
		
	}	
}

 