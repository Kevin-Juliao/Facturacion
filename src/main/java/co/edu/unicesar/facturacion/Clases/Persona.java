package co.edu.unicesar.facturacion.Clases;




public class Persona {
    private String nombre;
    private String id;
    private String email;
    private String direccion;

    public Persona(String nombre, String id, String email, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
