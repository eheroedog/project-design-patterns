package com.fproject.board;

public interface Board {
	
	BoardState getPlayer1State();
	
	BoardState getPlayer2State();
	
	boolean hasRow();
	
	boolean isFull();
}
