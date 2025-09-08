package co.edu.unicesar.facturacion.Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainViewApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/co/edu/unicesar/facturacion/MenuPrincipal.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Menú Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void LoadView()
    {

    }
}
