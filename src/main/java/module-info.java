module app.sokobanwithfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.sokobanwithfx to javafx.fxml;
    exports app.sokobanwithfx;
}