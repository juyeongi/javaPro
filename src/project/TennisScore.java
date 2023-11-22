package project;

import java.io.Serializable;

public class TennisScore implements Serializable{

	private static final long serialVersionUID = 1L;
	private int tPoint;
	private int tGame;
	private int tSet;
	
	
	public TennisScore() {
		super();
	}

	public int gettPoint() {
		return tPoint;
	}

	public void settPoint(int tPoint) {
		this.tPoint = tPoint;
	}
	
	public void plustPoint() {
		tPoint++;
	}

	public int gettGame() {
		return tGame;
	}

	public void settGame(int tGame) {
		this.tGame = tGame;
	}
	
	public void plustGame() {
		tGame++;
	}

	public int gettSet() {
		return tSet;
	}

	public void settSet(int tSet) {
		this.tSet = tSet;
	}
	
	public void plustSet() {
		tSet++;
	}
	
}