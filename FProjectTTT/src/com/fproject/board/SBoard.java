package com.fproject.board;

import static java.lang.Math.abs;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public final class SBoard implements Board {
	
	private final int size;
	private final int[] board;
	private final int[] boardScore;
	
	public SBoard(int size) {
		this.size = size;
		this.board = new int[size*size];
		this.boardScore = new int[2*size+2];
	}

	@Override
	public BoardState getPlayer1State() {
		return new SquareBoardState(1);
	}

	@Override
	public BoardState getPlayer2State() {
		return new SquareBoardState(-1);
	}

	@Override
	public boolean hasRow() {
		return IntStream.of(boardScore).anyMatch(sum -> abs(sum) == size);
	}

	@Override
	public boolean isFull() {
		return IntStream.of(board).allMatch(mark -> mark != 0);
	}
	
	private final class SquareBoardState implements BoardState {
	      private final int identity;

	      private SquareBoardState(int identity) {
	         this.identity = identity;
	      }

	      @Override
	      public void show(Consumer<Cell[][]> cellConsumer) {
	          cellConsumer.accept(cells());
	      }

	      private Cell[][] cells() {
	         Cell[][] cells = new Cell[size][size];
	         for (int y=0; y<size; y++) {
	            for (int x=0; x<size; x++) {
	               int index = x+y*size;
	               cells[y][x] = new SquareCell(index, identity);
	            }
	         }
	         return cells;
	      }
	   }

	   private final class SquareCell implements BoardState.Cell {
	      private final int index;
	      private final int identity;
	      private final int x;
	      private final int y;

	      public SquareCell(int index, int identity) {
	         this.index = index;
	         this.identity = identity;
	         this.x = index % size;
	         this.y = index / size;
	      }

	      @Override
	      public boolean isEmpty() {
	         return board[index] == 0;
	      }

	      @Override
	      public boolean isPlayer() {
	         return board[index] == identity;
	      }

	      @Override
	      public String toString() {
	         return "Cell "+board[index]+" at "+x+","+y;
	      }

	      @Override
	      public void markOwned() {
	         if (!isEmpty()) {
	            throw new IllegalStateException("can not mark cell at ("+x+","+y+"), it is already taken");
	         }
	         board[index] = identity;
	         boardScore[x] += identity;
	         boardScore[size + y] += identity;
	         if (x == y) {
	            boardScore[2*size] += identity;
	         }
	         if (x+y == size-1) {
	            boardScore[2*size+1] += identity;
	         }
	      }
	   }

}
