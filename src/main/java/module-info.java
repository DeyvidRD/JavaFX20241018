module br.com.etec.javafx20241018 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens br.com.etec.javafx20241018 to javafx.fxml;
    exports br.com.etec.javafx20241018.model;
    opens br.com.etec.javafx20241018.model to javafx.fxml;
}