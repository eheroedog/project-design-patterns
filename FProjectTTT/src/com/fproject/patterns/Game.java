package com.fproject.patterns;

import com.fproject.board.Board;

public class Game {
	
	private final Board board;
	//private final Player p1,p2;
	public final Player[] players;
	public int turn = 0;
	
	
	public Game(Board b, Player p1, Player p2) {
		this.board = b;
		this.players = new Player[] {p1,p2};
		//this.p1 = new Player;
		//this.p2 = new Player;
	}
	
	/*
	public Game(Board board, Player p1, Player p2, Player[] players, int turn) {
		//super();
		this.board = board;
		this.p1 = p1;
		this.p2 = p2;
		//.players = players;
		this.turn = turn;
	}*/

	public void play() {
		while (!board.hasRow() && !board.isFull()) {
			nextPlayer().makeMove();
		}
	}
	
	private Player nextPlayer() {
		System.out.println((turn++) % players.length);
		return players[(turn++) % players.length];
	}
	
}
