package view.base;

import controller.Controller;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.FileNotFoundException;

public abstract class ViewBase {
    protected GridPane controllerGrid;
    protected GridPane gameGrid;
    protected Controller controller;
    protected Stage stage;


    public ViewBase(Stage stage) {
        this.stage = stage;

    }
    public void ShowControllerGrid() {
    controllerGrid = new GridPane();
    controllerGrid.setAlignment(Pos.CENTER);

    Button btnUp = new Button("W");
    btnUp.setOnAction(controller);
    controllerGrid.add(btnUp,1,0);

    Button btnRight = new Button("D");
    btnRight.setOnAction(controller);
    controllerGrid.add(btnRight,2,1);

    Button btnDown = new Button("S");
    btnDown.setOnAction(controller);
    controllerGrid.add(btnDown,1,2);

    Button btnLeft = new Button("A");
    btnLeft.setOnAction(controller);
    controllerGrid.add(btnLeft,0,1);

    }

    public abstract void showGamerGrid() throws FileNotFoundException;

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
