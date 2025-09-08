package co.edu.unicesar.facturacion.Clases;

public class Cliente extends Persona {
    private String TipoDeCliente;

    public Cliente(String nombre,String id,String email,String direccion, String TipoDeCliente) {
        super(nombre, id, email, direccion);
        this.TipoDeCliente = TipoDeCliente;
    }
    public String getTipoDeCliente() {
        return TipoDeCliente;
    }

    public void setTipoDeCliente(String TipoDeCliente) {
        this.TipoDeCliente = TipoDeCliente;
    }
}
