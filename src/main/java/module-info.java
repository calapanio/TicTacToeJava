module com.example.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens com.example.tictactoe to javafx.fxml;
    exports com.example.tictactoe;
}