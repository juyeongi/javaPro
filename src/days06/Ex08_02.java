package days06;

import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;

public class Ex08_02 {
	public static void main(String[] args) {
		//[1]
		/*
		 *       i=1   j=4
		 **     i=2   j=3
		 ***   i=3  j=2
		 ****  i=4
		 *i+j=5
		 */
		
		/*
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
			System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/
		//[2]
		/*
		 *       i=1   j=4
		 **     i=2   j=3
		 ***   i=3   j=2
		 ****  i=4   j=1
		 *i+j=5
		 */
		/*
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5-i; j++) {
			System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/
		
		//[3]
		/*
		for (int i = 1; i <=4; i++) {
			//공백 찍는 
			for (int j = 1; j <=4-i; j++) {
				System.out.print("_");
				} //for
			//별찍는
			for (int j = 1; j <=i; j++) {
			System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/
		
		//[4]
		for (int i = 1; i <=4; i++) {
			//별
			for (int j = 1; j <=5-i; j++) {
			System.out.print("*");
			} //for
		
		//공백
			for (int j = 1; j <=i; i++) {
				System.out.print("_");
			}//for	
			System.out.println();	
		} //for
			
	/*
	//[5]
		for (int i = 1; i <=3; j++) {
			for (int j = 1; j<=3-i; i++) {
				System.out.print("_")
			} //for
			System.out.print("*");
		} //for
		System.out.println();
	}//for
	*/
		
	
	
		
	}//main
}//class
