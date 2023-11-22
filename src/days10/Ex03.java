package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//배열 단점 ->컬렉션 클래스사용
//1)배열 크기가 자동으로 증가/감소가 되지않음
//2)

public class Ex03 {
	//함수 밖에 선언. 전역변수 (모든 함수에 적용됨)
	static int index=0; //배열m을 채워넣을 위치값(공간) 
	static Scanner scanner =new Scanner(System.in);
	static char con='y';
	
	public static void main(String[] args) throws IOException {
		//Scanner scanner =new Scanner(System.in);
				
		int [] m = new int [3];
		//int index=0; //배열m을 채워넣을 위치값(공간) 
		String [] menus = {"추가","수정","삭제","검색","조회","종료"};
		int selectedNumber;
		
		while (true) {
			dispMenus(menus);
			selectedNumber=selectMenus(scanner);
			processMenus(selectedNumber,m);
		}//while
	}//main
	
	private static void processMenus(int selectedNumber, int [] m) throws IOException {
		
		switch (selectedNumber) {
		case 1: // main.m 배열에 값을 입력받아서 요소 추가
			add(m);
			break;
		case 2: 
			System.out.println("배열에 요소 수정");
			break;
		case 5: //모든 요소 조회 
			list(m);
			break;
		case 6:
			exit();
			break;
		} // switch
		 일시정지();
	}//processMenus




	public static void 일시정지() {
		
		//예외처리 2가지 . try~catch, throws
		System.out.print(">아무 키나 누르면 계속");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}//catch
	}//일시정지

	private static void list(int[] m) {
		System.out.println("[5. 조회]");
		if (index==0) {
			System.out.println("\t 추가된 요소가 없습니다.");
			return;//함수 빠져나감
		}//if
		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d", i, m[i]);
		} //for
		System.out.println();
	}//list

	//m 배열에 요소를 추가하는 함수(메서드)
	private static void add(int[] m) throws IOException {
		System.out.println("[1. 추가]");
		do {
			if (index == m.length) {
				int [] temp =new int [m.length+3];
				for (int i = 0; i < temp.length; i++) {
					temp[i]=m[i];
				} //for
				m=temp;
			}//if
			//if(index ==3) break;
			System.out.printf(">정수 입력 ");
			int n = scanner.nextInt();
			m[index++]=n;

			System.out.println("\t 요소 추가 계속 ?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		}while(Character.toUpperCase(con)=='Y');
		//while(Character.toUpperCase(con)=='Y' && index <3);
		System.out.println(Arrays.toString(m));
	}//add
	
		
	private static void exit() {
		System.out.println("\n\n프로그램을 종료합니다.~");
		System.exit(-1);
		
	}//exit

	private static int selectMenus(Scanner scanner) {
		System.out.print(">메뉴 선택");
		return scanner.nextInt();
	}//selectMenus

	private static void dispMenus(String[] menus) {
		System.out.println("[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d,%s\t", i+1, menus[i]);
		} //for
		System.out.println();
		
	}//dispMenus
}//class
