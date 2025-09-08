package co.edu.unicesar.facturacion.Clases;

import javax.swing.*;

public class Producto {
    private String id;
    private String Descripcion;
    private double precio;
    private  int stock;
    private double impuesto;
    private boolean exento;

    public Producto(String id, String descripcion, double precio, int stock, double impuesto, boolean exento) {
        this.id = id;
        Descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.impuesto = impuesto;
        this.exento = exento;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio <= 0) {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor que 0.");
        }
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            JOptionPane.showMessageDialog(null, "El stock no puede ser negativo.");
        }
        this.stock = stock;
    }
    public double getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    public boolean isExento() {
        return exento;
    }
    public void setExento(boolean exento) {
        this.exento = exento;
    }

    public void Exento(){
        if(precio>20000){
            exento=true;
        }else{
            exento=false;
        }
    }
    public void calcularImpuesto(){
        if(!exento){
            impuesto=precio*0.19;
        }else{
            impuesto=0;

        }
    }


}
