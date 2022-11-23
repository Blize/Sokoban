package view.base;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Tile;
import util.Types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ViewModern extends ViewBase {
    public ViewModern(Stage stage) { super(stage); }


    public String charToImage(char character) {
        switch (character) {
            case Types.PLAYER:
                return "player";
            case Types.BOX:
                return "box";
            case Types.VOID:
                return "floor";
            case Types.GOAL_SQUARE:
                return "boxongoalsquare";
            case Types.WALL:
            default:
                return "wall";
        }

    }
    @Override
    public void showGamerGrid() throws FileNotFoundException {
         this.ShowControllerGrid();

        gameGrid = new GridPane();
        gameGrid.setAlignment(Pos.CENTER);

        int y = 0;

        for (Tile[] line: controller.getModel().getTile()) {
            int x = 0;

            for (Tile tile: line) {
                Label label = new Label();
                String path = "src of your pictures(without the picture name)" + this.charToImage(tile.getType()) + ".png";

                FileInputStream fileInputStream = new FileInputStream(path);
                Image image = new Image(fileInputStream, 50, 50, false, true);
                ImageView imageView = new ImageView(image);
                imageView.setPreserveRatio(true);

                label.setGraphic(imageView);
                gameGrid.add(label, x, y+2);
                x++;
            }
            y++;
        }
        GridPane gridPane = new GridPane();
        gridPane.add(gameGrid, 0, 1);
        gridPane.add(controllerGrid, 0, 2);

        Scene scene = new Scene(gridPane, 1080, 850);
        stage.setScene(scene);
        stage.show();
    }

}

