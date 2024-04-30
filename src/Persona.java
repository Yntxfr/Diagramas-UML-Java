// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java


public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int id;
    private String correo;
    private String contrasena;
    private String rol;
    private String direccion;

    // Constructor público para la clase Persona
    public Persona(String nombre, String apellido, int id, String correo, String contrasena, String rol, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.direccion = direccion;
    }

    // Métodos
    public boolean iniciarSesion(String correoIngresado, String contrasenaIngresada) {
        if (this.correo == correoIngresado && this.contrasena == contrasenaIngresada) {
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRol() {
        return rol;
    }

}

