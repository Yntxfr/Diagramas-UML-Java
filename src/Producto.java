// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java



import java.util.*;  //Para importar todas las librerias de java.util

public class Producto {
    // Atributos
    private String nombre;
    private int id;
    private static String categoria;
    private double precio;
    private int cantidad;
    private String fechaCreacion;
    private String fechaCaducidad;

    // Constructor
    public Producto(String nombre, int id, String categoria, double precio, int cantidad, String fechaCreacion, String fechaCaducidad) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
        this.fechaCaducidad = fechaCaducidad;
    }

    // Métodos
    public boolean crearProducto() {
        Scanner newProduct = new Scanner(System.in);
        return true;
    }
    public void despublicarProducto(Producto productos) {
    }
    private Producto administrarProducto(Producto productos) {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }
    public static String getCategoria() {
        return categoria;
    }
    public double getPrecio() {
        return precio;
    }
}
