package org.learning.arrays;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> columnSet[] = new HashSet[9];
        HashSet<Character> lineSet[] = new HashSet[9];
        HashSet<Character> blocksSet[][] = new HashSet[3][3];

        for(int c = 0; c < board.length; c++) {
            for (int l = 0; l < board[c].length; l++) {
                if(board[c][l] == '.') continue;
                if(lineSet[c] == null) lineSet[c] = new HashSet<>();
                if(columnSet[l] == null) columnSet[l] = new HashSet<>();

                if (blocksSet[(c/3)][(l/3)] == null) blocksSet[(c/3)][(l/3)] = new HashSet<>();


                if (!lineSet[c].add(board[c][l])) return false;
                if (!columnSet[l].add(board[c][l])) return false;
                if (!blocksSet[(c/3)][(l/3)].add(board[c][l])) return false;
            }
        }

        return true;
    }
}
