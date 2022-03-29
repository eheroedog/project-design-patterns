package com.fproject.board;

import java.util.function.Consumer;

public interface BoardState {
	void show(Consumer<Cell[][]> cellcon);
	
	interface Cell{
		
		boolean isEmpty();
		
		boolean isPlayer();
		
		default boolean isEnemy() {
			return !isPlayer() && !isEmpty();
		}
		
		void markOwned();
	}
	
}
