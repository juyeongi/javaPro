package days26;

import java.io.File;

public class Ex06_06 {
	public static void main(String[] args) {
		// days26
		//		ㄴ[ temp	]
		//			ㄴtdmp_a
		//				ㄴx
		//				ㄴy
		//			ㄴtemp_b
		
		String pathname =".\\src\\days26\\temp";
		File dir = new File(pathname);
		if (dir.exists()) {
		
			//	.delete() : 하위디렉토리가 없어야 삭제가능
//			System.out.println(dir.delete()); 
//			deleteFolders(dir);	//[1]
//			deleteAll(file);		//[2]
			directoryDelete(dir);
			
			
		}
	
	}//main
	// days26\\temp
	//[1]
	/*
	private static void deleteFolders(File dir) {

		File[] childList = dir.listFiles();
		if (childList != null) {
			for (int i = 0; i < childList.length; i++) {
				File child = childList[i];
				deleteFolders(child);         
				System.out.printf("> %s 를 삭제했습니다.\n", child);
			}
		}
		dir.delete();
		System.out.printf("> %s 를 삭제했습니다.\n", dir);
	}
	*/
	//[2]
	/*
	private static void deleteAll(File file) {
	      File[] files = file.listFiles();
	      for (int i = 0; i < files.length; i++) {
	         if(files[i].isDirectory()) {
	            deleteAll(files[i]);         
	         }
	         files[i].delete();
	      } // for
	   }
		*/

	private static void directoryDelete(File f) {
		//f 삭제되지 않았을 때 while문 반복
		while (! f.delete()) { // 삭제되면 true, 삭제안되면 false
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if (list[i].delete()) {
					System.out.printf("%s 삭제 완료 \n",list[i]);
				}
			} //	for
		}
		
	}
}//class
