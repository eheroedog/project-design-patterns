package com.fproject.patterns;

import com.fproject.board.BoardState;
import com.fproject.ui.UI;

public class PlayerOb implements Player {
	
	private final BoardState bState;
	private final UI ui;
	
	public PlayerOb(BoardState bState, UI ui) {
		this.bState = bState;
		this.ui = ui;
	}
	
	@Override
	public void makeMove() {
		bState.show(ui::draw);
		bState.show(cells -> ui.askForMove().selectFrom(cells).markOwned());
		
	}

	@Override
	public String toString() {
		return "PlayerOb ["+ui.toString()+"]";
	}

	

}
