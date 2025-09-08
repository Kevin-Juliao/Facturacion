package co.edu.unicesar.facturacion.Clases;

import javax.swing.*;

public class LineaFactura {
    private String Producto;
    private int cantidad;
    private double Subtotal;

    public LineaFactura(String producto, int cantidad, double subtotal) {
        Producto = producto;
        this.cantidad = cantidad;
        Subtotal = subtotal;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        if(cantidad<0){
            JOptionPane.showMessageDialog(null, "No tiene una cantidad de productos");
        }
        this.cantidad = cantidad;
    }
    public double getSubtotal() {
        return Subtotal;
    }
    public void setSubtotal(double subtotal) {
        Subtotal = subtotal;
    }

}
