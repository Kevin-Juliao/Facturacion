module co.edu.unicesar.facturacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    exports co.edu.unicesar.facturacion;
    exports co.edu.unicesar.facturacion.Controllers;
    opens co.edu.unicesar.facturacion to javafx.fxml;
    opens co.edu.unicesar.facturacion.Controllers to javafx.fxml;
}