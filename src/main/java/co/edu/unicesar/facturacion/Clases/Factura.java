package co.edu.unicesar.facturacion.Clases;

import java.util.Date;
import java.util.List;

public class Factura {
    private int numero;
    private Date fecha;
    private String cliente;
    private List<LineaFactura> lineas;

    public Factura(int numero, Date fecha, String cliente, List<LineaFactura> lineas) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.lineas = lineas;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public double calcularTotal() {
        double total = 0;
        if (lineas != null) {
            for (LineaFactura linea : lineas) {
                total += linea.getSubtotal();
            }
        }
        return total;
    }
}