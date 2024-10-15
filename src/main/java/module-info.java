module uz.bunyodbek.tictacfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens uz.bunyodbek.tictacfx to javafx.fxml;
    exports uz.bunyodbek.tictacfx;
}