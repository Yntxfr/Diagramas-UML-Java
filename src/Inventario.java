// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java



import java.util.*;  //Para importar todas las librerias de java.util

public class Inventario {
    // Atributos
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Métodos
    public void addProducto(Producto producto1) {
        productos.add(producto1);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void eliminarProducto(Producto producto1) {
        productos.remove(producto1);
    }

}
