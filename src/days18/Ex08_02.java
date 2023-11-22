package days18;

public class Ex08_02 {
	public static void main(String[] args) {
		//암기
		//문자열 구분하는 구분자 
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		String sep = System.getProperty("file.separator"); // "\\"
		
		String directory="C:\\temp\\days09"; 
		String fileName= "Ex01.java";
		
	    	
		
		
		//String path= directory+"\\"+ fileName; //전체경로
		//C:\\temp\\days09\\체크 
		//char directory.charAt(directory.length()-1)=='\\' 
		//String directory.substring(directory.length()-1).equals("\\");
		String path;
		if(directory.endsWith(sep)) {
			path =directory+fileName;
		}else {
			path = directory+sep+fileName;
		}
	
		
		System.out.println(path);
		//  "C:\\temp\\days09\\Ex01.java"
	}
}
