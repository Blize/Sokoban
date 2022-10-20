package app;

import model.BoardSokoban;
import model.Tile;

import java.io.IOException;

public class AppSokoban {
    /**
     * This is our main function we use it to start our app (:
     * @param args
     */
    public static void main(String args[]) {
        //todo
        BoardSokoban boardSokoban = new BoardSokoban("/Users/matthiasmantsch/Downloads/level2.txt");
        try {
            boardSokoban.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(boardSokoban.toString());
    }
}
