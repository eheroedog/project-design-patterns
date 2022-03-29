package com.fproject.patterns;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fproject.board.BoardState;
import com.fproject.board.BoardState.Cell;

public class OpenSpot implements Player {

	private final BoardState bState;
	private final Random rnd;
	
	public OpenSpot(BoardState bState, Random rnd) {
		super();
		this.bState = bState;
		this.rnd = rnd;
	}

	@Override
	public void makeMove() {
		bState.show(this::makeMove);	
	}

	private void makeMove(Cell[][] cells) {
		Stream<Cell> cellStream = asList(cells).stream().flatMap(row -> asList(row).stream());
	    Stream<Cell> emptyCellsStream = cellStream.filter(BoardState.Cell::isEmpty);
	    List<BoardState.Cell> emptyCells = emptyCellsStream.collect(Collectors.toList());
	    emptyCells.get(rnd.nextInt(emptyCells.size())).markOwned();
	}
}
