package com.fproject.patterns;

import com.fproject.board.Board;

public class Game {
	
	private final Board board;
	public final Player[] players;
	public int turn = 0;
	
	
	public Game(Board b, Player p1, Player p2) {
		this.board = b;
		this.players = new Player[] {p1,p2};
	}

	public void play() {
		while (!board.hasRow() && !board.isFull()) {
			nextPlayer().makeMove();
		}
	}
	
	private Player nextPlayer() {
		return players[(turn++) % players.length];
	}
	
}
