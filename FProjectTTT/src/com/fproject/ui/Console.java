package com.fproject.ui;

import java.util.stream.Collectors;

import com.fproject.board.BoardState.Cell;

import static java.util.Arrays.asList;

public class Console implements UI {

	private final Character pMark;
	private final Character eMark;
	
	public Console(Character pMark, Character eMark) {
		this.pMark = pMark;
		this.eMark = eMark;
	}
	
	@Override
	public void draw(Cell[][] cells) {
		asList(cells).forEach(this::drawRow);
	}
	
	private void drawRow(Cell[] row) {
		System.console().printf(asList(row).stream()
				.map(this::markToDisplayMark)
				.collect(Collectors.joining("  ")) + "\n");
	}
	
	private String markToDisplayMark(Cell cell) {
		if (cell.isPlayer()) {
			return ""+ pMark;
		} else if(cell.isEmpty()) {
			return ""+ eMark;
		}else {
			return ".";
		}
	}

	@Override
	public Position askForMove() {
		String positionInput = System.console().readLine("Enter your move '"+pMark+"' (x,y): ");
		int x = Integer.parseInt(positionInput.split(",")[0]);
		int y = Integer.parseInt(positionInput.split(",")[1]);
		return new Position() {
			@Override
			public Cell selectFrom(Cell[][] cells) {
				return cells[y][x];
			}
		};
	}

}
