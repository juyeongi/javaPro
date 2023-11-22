package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class FileUtils {
	public static final String pathName = ".";
	
	private FileUtils() {
		super();
	}
	
	public static String getFileName(String fileName) {
		return fileName.substring(0, fileName.indexOf("."));
	}
	
	public static void storeMemberList() {
		String[] members = {"박정호", "이상문", "이주영", "정하영", "이동현", "주강민"};
		Properties prop = new Properties();
		
		String dir = pathName+"\\member";
		File f = new File(dir);
		if(!f.exists()) {
			f.mkdir();
		}
		for (int i = 0; i < members.length; i++) {
			f = new File(dir, members[i] + ".txt");
			if (!f.exists()) {
				try {
					f.createNewFile();
					prop.setProperty("name", members[i]);
					prop.setProperty("single", "0");
					prop.setProperty("double", "0");
					prop.store(new FileWriter(f), "");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void updateMember(ArrayList<Player> winner, int gameFormat) {
		String fileName = null;
		Properties prop = new Properties();
		Iterator<Player> ir = winner.iterator();
		String event = gameFormat == 1 ? "single" : "double";
		while (ir.hasNext()) {
			Player player = ir.next();
			fileName = FileUtils.pathName+"\\member\\" + player.getName()+".txt";
			try {
				prop.load(new FileReader(fileName));
				prop.setProperty(event, String.valueOf(Integer.parseInt(prop.getProperty(event))+1));
				prop.store(new FileWriter(fileName), "");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	
}