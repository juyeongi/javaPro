package days04;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		/*국어점수를 kor변수에 입력받아서
		 * 등급 (grade)을 출력
		 * 0~59 가
		 * 60~69양
		 * 70~79미
		 * 80~89우
		 * 90~100수
		 * if조건문  if~else조건문
		 */
		
		int kor ;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print(">국어:");
			kor = scanner.nextInt();
			//**중첩if문
			
			char grade = '가';
			 if (0<=kor && kor<=100) {
				//(국어점수0~100
				 // 수우미양가 등급
				if (90<=kor) {
					grade='수';
				}//if
				else if (80<=kor) {
					grade='우';
				}//if
				else if (70<=kor) {
					grade='미';
				}//if
				else if (60<=kor ) {
					grade='양';
				}//if
				else {
					grade='가';
				}//if
				System.out.printf("kor: %d(%c)", kor, grade);
				 
			} else {
				System.out.println(">국어점수 입력 잘못!!");

			}//ifelse
			
		} catch (Exception e) {
			e.printStackTrace(); //에러표기
		}//catch
		
		
		
		/*int kor ;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print(">국어:");
			kor = scanner.nextInt();
			//**중첩if문
			 if (0<=kor && kor<=100) {
				//(국어점수0~100
				 // 수우미양가 등급
				if (90<=kor) {
					System.out.println("수");
				}//if
				else if (80<=kor) {
					
					System.out.println("우");
				}//if
				else if (70<=kor) {
			
					System.out.println("미");
				}//if
				else if (60<=kor ) {
					System.out.println("양");
				}//if
				else {
					System.out.println("가");
				}//if
				 
			} else {
				System.out.println(">국어점수 입력 잘못!!");

			}//ifelse
			
		} catch (Exception e) {
			e.printStackTrace(); //에러표기
		}//catch*/
		
	}//main

}//class
