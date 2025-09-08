package co.edu.unicesar.facturacion.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController {
    @FXML
    private Button btnCapturarCliente;
    @FXML
    private Button btnCapturarProducto;
    @FXML
    private Button btnHacerFacturacion;
    @FXML
    private Button btnSalir;

    @FXML
    public void onBtnCapturarCliente(ActionEvent event)
    {
        System.out.println( "Opción elegida: CAPTURAR CLIENTE");
    }
}
