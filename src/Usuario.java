// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java



import java.util.*;  //Para importar todas las librerias de java.util

public class Usuario extends Persona {
    // Atributos
    private String subcategoriaRol;
    private int telefono;
    private List<Producto> listaCompras;
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    // Constructor
    public Usuario(String nombre, String apellido, int id, String correo, int telefono, String contrasena, String rol, String direccion, String subcategoriaRol) {
        super(nombre, apellido, id, correo, contrasena, rol, direccion); // Cada variable de cada subclase
        this.subcategoriaRol = subcategoriaRol;
        this.telefono = telefono;
        this.listaCompras = new ArrayList<>();
        listaUsuarios.add(this);
    }

    // Métodos
    public static List<Usuario> getUsuario() {
        return listaUsuarios;
    }

    public String getNombre() {
        return super.getNombre();
    }

    public String getApellido() {
        return super.getApellido();
    }

    public String getCorreo() {
        return super.getCorreo();
    }

    public boolean iniciarSesion(String correoIngresado, String contrasenaIngresada) {
        return super.iniciarSesion(correoIngresado, contrasenaIngresada);
    }

    public List<Producto> getProductos() {
        return listaCompras;
    }


}


// Lista de métodos anotados en el diagrama
    /*
    + verProducto(Producto productos): Boolean
    + agregarProductoCarrito(Producto productos): void
    + pagarProducto(Tarjeta tarjetas): Boolean
    + programarEntregaProducto (): void
    + rastrearEntregaProducto(): void
    + verPromocion(Promocion promociones): Boolean
     */