package com.fproject.main;

import com.fproject.board.Board;
import com.fproject.board.SBoard;
import com.fproject.patterns.Game;
import com.fproject.patterns.PlayerOb;
import com.fproject.ui.Console;

public class Builder {
	public Game build() {
		Board board = new SBoard(4);
		return new Game(board,
				new PlayerOb(board.getPlayer1State(),new Console('X','O')),
				new PlayerOb(board.getPlayer2State(),new Console('O','X')));
	}
}
