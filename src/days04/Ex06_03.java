package days04;

public class Ex06_03 {
	
	public static void main (String[] args){
	    int sum= 0;
	    //1+2+3+4+5+6+7+8+9+10
	    for(int i=1; i <=10; i++){
	    	System.out.printf("%d+",i);
	    	sum +=i;			

			}
	    
	        //\b :backspace
	     System.out.printf("\b=%d\n", sum);
	}  //main 

}// class
