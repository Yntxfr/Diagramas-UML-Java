// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java



import java.util.*;  //Para importar todas las librerias de java.util

public class Notificacion {
    // Atributos
    private String textoNotificacion;
    private String fechaNotificacion;
    private int id;

    // Constructor público
    public Notificacion(String textoNotificacion, String fechaNotificacion, int id) {
        this.textoNotificacion = textoNotificacion;
        this.fechaNotificacion = fechaNotificacion;
        this.id = id;
    }

    // Métodos
    /*
    public void setFechaNotificacion(String fechaNotificacion) {

        this.fechaNotificacion = fechaNotificacion;
    }

    public void enviarNotificacion(String textoNotificacion) {
    }
     */

    public String getCuerpoNotificacion() {
        return textoNotificacion;
    }

    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    public int getIdNotificacion() {
        return id;
    }

}
