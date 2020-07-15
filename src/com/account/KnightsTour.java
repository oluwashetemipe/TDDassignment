package com.account;

public class KnightsTour {
    private int[][] boardArray = new int[8][8];
    private int currentRow, currentCol, counter = 2;

    public KnightsTour(){
        boardArray[0][0] =1;
    }

    public void boardArray(){
        for(int row = 0; row<boardArray.length; row++){
            for (int col = 0; col<boardArray[row].length; col++){
                System.out.print(boardArray[row][col]+ "  ");
            }
            System.out.println();
        }
    }

    public boolean moveKnight(int[] horizontal, int[] vertical){
        for(int moveNum = 0; moveNum<8; moveNum++){

            currentCol = currentCol + horizontal[moveNum];
            currentRow = currentRow + vertical[moveNum];
            if(validation() && ifNull()){
                boardArray[currentRow][currentCol] = counter;
                counter++;
            }
            else{
                return false;
            }

//            System.out.println(currentCol+ " " +currentRow);
        }
        return false;
    }

    public boolean validation(){
        if((currentCol >=0 && currentCol<= 7)&& (currentRow >= 0 && currentRow <=7)){
            return true;
        }
        return false;
    }

    public boolean ifNull(){
        if(boardArray[currentRow][currentCol] == 0){
            return true;
        }
        return false;
    }
}


