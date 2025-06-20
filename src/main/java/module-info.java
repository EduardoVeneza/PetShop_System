module com.lp2_uneb.petshop_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.lp2_uneb.petshop_system to javafx.fxml;
    exports com.lp2_uneb.petshop_system;
}