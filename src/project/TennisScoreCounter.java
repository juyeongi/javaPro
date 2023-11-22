package project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class TennisScoreCounter implements Serializable{

	private static final long serialVersionUID = 1L;
	private int gameFormat; // 단식 1 복식 2
	private int gameMode; // 세트 수 3 or 5
	private ArrayList<Player> team1 = new ArrayList<>();
	private ArrayList<Player> team2 = new ArrayList<>();
	private TennisScore ts1 = new TennisScore();
	private TennisScore ts2 = new TennisScore();
	private transient String[] scores = {"0", "15", "30", "40","AD", "Win"};
	private transient Scanner sc = new Scanner(System.in);
	private ArrayList<Player> winner = null;

	public TennisScoreCounter() {
		System.out.println("\t\t[테니스 게임 설정]");
		String valid;
		while(true) {
			System.out.print("gameFormat	(1:단식 2:복식) > ");
			valid = sc.nextLine();
			if(valid.matches("[12]")) {
				gameFormat = Integer.parseInt(valid);
				break;
			} else {
				System.out.println("유효한 값을 입력해주세요.");
			}
		}

		while(true) {
			System.out.print("gameMode		(3 or 5) > ");
			valid = sc.nextLine();
			if(valid.matches("[35]")) {
				gameMode = Integer.parseInt(valid);
				break;
			} else {
				System.out.println("유효한 값을 입력해주세요.");				
			}
		}

		File f = new File(FileUtils.pathName+"\\member");
		System.out.print("\t대기자 이름 명단\n");
		String[] names = f.list();
		for(int i=0; i<names.length; i++) {
			names[i] = FileUtils.getFileName(names[i]);
			System.out.printf("%d. %s\n", i+1, names[i]);
		}

		if (gameFormat == 1) {
			System.out.printf("단식 1팀 선택 > ");
			selectTeam(names, team1);
			System.out.printf("단식 2팀 선택 > ");
			selectTeam(names, team2);
		} else {
			System.out.printf("복식 1팀(1) 선택 > ");
			selectTeam(names, team1);
			System.out.printf("복식 1팀(2) 선택 > ");
			selectTeam(names, team1);
			System.out.printf("복식 2팀(1) 선택 > ");
			selectTeam(names, team2);
			System.out.printf("복식 2팀(2) 선택 > ");
			selectTeam(names, team2);
		}
	}

	public void selectTeam(String[] names, ArrayList<Player> team) {
		String name;
		boolean flag = false;
		while(true) {
			name = sc.next();
			for(int i=0; i<names.length; i++) {
				if(names[i].equals(name)) {
					team.add(new Player(names[i]));
					names[i] = "-----";
					flag  = true;
					break;
				}
			}
			if(flag) {
				break;
			} else {
				System.out.println("현재 명단에 이름이 없습니다. 다시 입력해주세요.");
				for(int i=0; i<names.length; i++) {
					System.out.printf("%d. %s\n", i+1, names[i]);
				}
				System.out.print("팀원 선택 > ");
			}
		}
	}

	public void pointWinner(int p) {
		if(p==1) {
			ts1.plustPoint();
		} else {
			ts2.plustPoint();
		}
	}

	public void dispScoreBoard() {
		if(gameFormat == 1) {
			System.out.printf("\t    name\t\t\tset\t      game\t      score\n");
			System.out.println("─".repeat(80)+"┐");
			System.out.printf("\t[team1]%s\t\t\t%d\t│\t%d\t│\t%s\t│\n"
					, team1.get(0).getName(), ts1.gettSet(),ts1.gettGame(), scores[ts1.gettPoint()]);
			System.out.println("─".repeat(80)+"┤");
			System.out.printf("\t[team2]%s\t\t\t%d\t│\t%d\t│\t%s\t│\n"
					,  team2.get(0).getName(), ts2.gettSet(),ts2.gettGame(), scores[ts2.gettPoint()]);
			System.out.println("─".repeat(80)+"┘");
		} else {
			System.out.printf("\t    name\t\t\tset\t      game\t      score\n");
			System.out.println("─".repeat(80)+"┐");
			System.out.printf("\t[team1]%s,%s\t\t%d\t│\t%d\t│\t%s\t│\n"
					, team1.get(0).getName(), team1.get(1).getName(), ts1.gettSet(), ts1.gettGame(), scores[ts1.gettPoint()]);
			System.out.println("─".repeat(80)+"┤");
			System.out.printf("\t[team1]%s,%s\t\t%d\t│\t%d\t│\t%s\t│\n"
					, team2.get(0).getName(), team2.get(1).getName(), ts2.gettSet(), ts2.gettGame(), scores[ts2.gettPoint()]);
			System.out.println("─".repeat(80)+"┘");
		}
		//		try {
		//			Thread.sleep(1000);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
	}

	public void gameStart() {
		System.out.print("\n\n\t\t\t*** Tennis Start ***\n\n");
		dispScoreBoard();
		int setCnt = gameMode/2+1;
		while(ts1.gettSet() < setCnt && ts2.gettSet() < setCnt) {

			while(ts1.gettGame() < 6 && ts2.gettGame() < 6) {
				while(ts1.gettPoint() < 5 && ts2.gettPoint() < 5) {
					pointWinner((int)(Math.random()*2)+1); 

					if(ts1.gettPoint() == 4 && Math.abs(ts1.gettPoint()-ts2.gettPoint())>1) {
						ts1.plustPoint();
						ts1.plustGame();
						dispScoreBoard();
						if(ts1.gettGame() == 6) {
							ts1.plustSet();
							if(ts1.gettSet() == setCnt) winner = team1;
						}
					} else if(ts2.gettPoint() == 4 && Math.abs(ts1.gettPoint()-ts2.gettPoint())>1) {
						ts2.plustPoint();
						ts2.plustGame();
						dispScoreBoard();
						if(ts2.gettGame() == 6) {
							ts2.plustSet();
							if(ts2.gettSet() == setCnt) winner = team2;
						}
					}

					dispScoreBoard();
					if(ts1.gettPoint()==3 && ts2.gettPoint() == 3) {
						while(Math.abs(ts1.gettPoint()-ts2.gettPoint()) < 2) {
							pointWinner((int)(Math.random()*2)+1); 
							if(ts1.gettPoint() == 4 && ts2.gettPoint() == 4) {
								ts1.settPoint(3);
								ts2.settPoint(3);
							}
							dispScoreBoard();
						} // while
						dispScoreBoard();
						if(ts1.gettPoint()==5) {
							ts1.plustGame();
							dispScoreBoard();
							if(ts1.gettGame() == 6) {
								ts1.plustSet();
								if(ts1.gettSet() == setCnt) winner = team1;
								dispScoreBoard();
							}
						} else if(ts2.gettPoint() == 5) {
							ts2.plustGame();
							dispScoreBoard();
							if(ts2.gettGame() == 6) {
								ts2.plustSet();
								if(ts2.gettSet() == setCnt) winner = team2;
								dispScoreBoard();
							}
						}
					}


					// 게임 듀스
					if(ts1.gettGame() == 5 && ts2.gettGame() == 5) {
						System.out.println("호출");
						ts1.settPoint(0);
						ts2.settPoint(0);
						dispScoreBoard();
						while(Math.abs(ts1.gettGame()-ts2.gettGame()) < 2) {
							while(ts1.gettPoint() < 5 && ts2.gettPoint() < 5) {
								pointWinner((int)(Math.random()*2)+1); 
								if(ts1.gettPoint() == 4 && Math.abs(ts1.gettPoint()-ts2.gettPoint())>1) {
									ts1.plustPoint();
									ts1.plustGame();
									dispScoreBoard();
								} else if(ts2.gettPoint() == 4 && Math.abs(ts1.gettPoint()-ts2.gettPoint())>1) {
									ts2.plustPoint();
									ts2.plustGame();
									dispScoreBoard();
								}

								dispScoreBoard();
								if(ts1.gettPoint()==3 && ts2.gettPoint() == 3) {
									while(Math.abs(ts1.gettPoint()-ts2.gettPoint()) < 2) {
										pointWinner((int)(Math.random()*2)+1); 
										dispScoreBoard();
										if(ts1.gettPoint() == 4 && ts2.gettPoint() == 4) {
											ts1.settPoint(3);
											ts2.settPoint(3);
										}
										dispScoreBoard();
									}
									dispScoreBoard();
									if(ts1.gettPoint()==5) {
										ts1.plustGame();
										dispScoreBoard();
									} else if(ts2.gettPoint() == 5) {
										ts2.plustGame();
										dispScoreBoard();
									}

								}
							}

							if(ts1.gettGame() - ts2.gettGame() == 2) {
								ts1.plustSet();
								if(ts1.gettSet() == setCnt) winner = team2;
								dispScoreBoard();
								break;
							} else if(ts2.gettGame() - ts1.gettGame() == 2) {
								ts2.plustSet();
								if(ts2.gettSet() == setCnt) winner = team2;
								dispScoreBoard();
								break;
							}
							ts1.settPoint(0);
							ts2.settPoint(0);
						} // while
					}// 게임 듀스

				}
				ts1.settPoint(0);
				ts2.settPoint(0);
				dispScoreBoard();
			}
			ts1.settGame(0);
			ts2.settGame(0);
			dispScoreBoard();
		}
		dispScoreBoard();
		FileUtils.updateMember(winner, gameFormat);
		dispWinner();
	}
	//파일출력
	public void sboard() {
		
		String pathname = ".\\src\\project\\project.txt";
		try (FileOutputStream out = new FileOutputStream(pathname);
				ObjectOutputStream oos = new ObjectOutputStream(out)){
			oos.writeObject(this);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void dispWinner() {
		if(gameFormat == 1) {
			if(winner == team1) {
				winnerPrint(winner.get(0), "team1");
			} else {
				winnerPrint(winner.get(0), "team2");
			}
		} else {
			if(winner == team1) {
				//System.out.printf("[team1]%s,%s", winner.get(0), winner.get(1));
				winnerPrint(winner.get(0), "team1");
			} else {
				//System.out.printf("[team2]%s,%s", winner.get(0), winner.get(1));
				winnerPrint(winner.get(0), "team2");
			}
		}
	}
	public void winnerPrint(Player winner, String team) {
		System.out.println("\r\n"
				+ "\t██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ \r\n"
				+ "\t██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗\r\n"
				+ "\t██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝\r\n"
				+ "\t██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗\r\n"
				+ "\t╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║\r\n"
				+ "\t ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝\r\n"
				+ "\t                                                 \r\n"
				+ "");
		System.out.println("\t\t\t ┌  TEAM  ┐");
		System.out.printf("\t\t\t │  %s │\n" ,team);
		System.out.println("\t\t\t └────────┘");
		System.out.println();
		System.out.println("\t\t   ┌─[team1]─┐ ┌─[team2]─┐");
		System.out.printf("\t\t   │ %s  │ │  %s │\n", team1.get(0).getName(), team2.get(0).getName() );
		if (gameFormat == 2) {
			System.out.printf("\t\t   │ %s  │ │  %s │\n", team1.get(1).getName(), team2.get(1).getName() );
		} 
		System.out.println("\t\t   │   Set   │ │   Set   │");
		System.out.printf("\t\t   │    %d    │ │    %d    │\n", ts1.gettSet(), ts2.gettSet());
		System.out.println("\t\t   └─────────┘ └─────────┘");
	}
	public int getGameFormat() {
		return gameFormat;
	}

	public int getGameMode() {
		return gameMode;
	}

}