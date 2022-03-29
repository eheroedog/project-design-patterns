package com.fproject.ui;
import com.fproject.board.BoardState.Cell;

public interface UI {
	void draw(Cell[][] cells);
	
	Position askForMove();
	
	interface Position{
		Cell selectFrom(Cell[][] cells);
	}
}
