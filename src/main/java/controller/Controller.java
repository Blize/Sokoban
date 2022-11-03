package controller;

import javafx.event.ActionEvent;

import model.BoardSokoban;
import view.base.*;

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

    public void start() {
        this.view.showGamerGrid();
    }
    @Override
    public void handle(ActionEvent event) {

    }
}
