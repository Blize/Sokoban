package controller;

import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import model.BoardSokoban;
import view.base.*;

import java.io.FileNotFoundException;

public class Controller implements javafx.event.EventHandler<ActionEvent> {
    protected ViewBase view;
    protected BoardSokoban model;

    public Controller(BoardSokoban boardSokoban, ViewBase view) {
        this.view = view;
        this.model = boardSokoban;
    }


    /* Set and Get View */
    public void setView(ViewBase view) {
        this.view = view;
    }
    public ViewBase getView() {
        return view;
    }

    /* Set and Get Model */
    public void setModel(BoardSokoban model) {
        this.model = model;
    }
    public BoardSokoban getModel() {
        return model;
    }

    public void start() throws FileNotFoundException {
        this.view.showGamerGrid();
    }
    @Override
    public void handle(ActionEvent event) {
        Button source = (Button) event.getSource();
        switch (source.getText()) {
            case "W":
                System.out.println("UP");
                break;
            case "D":
                System.out.println("Right");
                break;
            case "S":
                System.out.println("Down");
                break;
            case "A":
                System.out.println("Left");
                break;

        }
    }
}
