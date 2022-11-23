package app.sokobanwithfx;

import javafx.application.Application;
import javafx.stage.Stage;

import model.BoardSokoban;
import view.base.*;
import controller.Controller;

import java.io.IOException;

public class Sokoban extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        BoardSokoban boardSokoban = new BoardSokoban("src to your lvl");
        try {
            boardSokoban.readFile();
        } catch (IOException e) {
            throw new RuntimeException("Error:" + e);
        }
       System.out.println(boardSokoban.toString());


        //ViewBase view = new ViewSimple(stage);
        ViewBase view = new ViewModern(stage);
        Controller controller = new Controller(boardSokoban, view);


        view.setController(controller);
        controller.start();
    }

    public static void main(String[] args) {
        launch();
    }
}