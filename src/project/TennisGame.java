package project;

public class TennisGame {

	public static void main(String[] args) {
		FileUtils.storeMemberList();
		new TennisScoreCounter().gameStart();
		
	}

}