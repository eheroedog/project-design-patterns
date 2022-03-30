package com.fproject.main;

//import com.fproject.board.SBoard.SquareCell;

public class Main {

	public static void main(String[] args) {
		//new Builder().build().play();
		
		int size= 3;
		
		for (int y=0; y<size; y++) {
            for (int x=0; x<size; x++) {
            	System.out.println("x: " + x + " y: "+ y +" size: "+size);
            	int index = x+y*size;
               System.out.println(index);
            }
		}
	}

}
