// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java



import java.util.*;  //Para importar todas las librerias de java.util

public class Admin extends Persona {
    // Atributos
    private static List<Admin> listaAdmins = new ArrayList<>();

    // Constructor
    public Admin(String nombre, String apellido, int id, String correo, String contrasena, String rol, String direccion) {
        super(nombre, apellido, id, correo, contrasena, rol, direccion);
        listaAdmins.add(this);
    }

    // Métodos
    public static List<Admin> getAdmin() {
        return listaAdmins;
    }

    public String getNombre() {
        return super.getNombre();
    }

    public String getApellido() {
        return super.getApellido();
    }

    public String getRol() {
        return super.getRol();
    }

}
