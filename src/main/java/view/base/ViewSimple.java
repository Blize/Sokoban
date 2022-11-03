package view.base;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewSimple extends ViewBase {
    public ViewSimple(Stage stage) {
        super(stage);
    }

    @Override
    public void showGamerGrid() {
        this.ShowControllerGrid();

        Text text = new Text();
        text.setText(controller.getModel().toString());
        text.setFont(Font.font("monospace", FontWeight.BOLD, 42));

        gameGrid = new GridPane();
        gameGrid.setAlignment(Pos.CENTER);

        gameGrid.add(text, 0 , 1);

        //Buttons
        GridPane gridPane1 = new GridPane();
        gridPane1.add(gameGrid, 0, 1);
        gridPane1.add(controllerGrid, 0, 2); //From ViewBase.java

        Scene scene = new Scene(gridPane1, 600, 600);
        stage.setScene(scene);
        stage.show();
    }
}
