// Nombre alumno: Alex Fernandez
// Convertir Diagramas UML a Código Java



/*
5. Array y Bucles:
Este ejercicio tiene como finalidad llevar a la práctica los conceptos de programación orientada a objetos que hemos estudiado, traduciendo los diagramas UML y los requerimientos que analizamos en clase a un programa funcional en Java. Escoge uno de los 5 ejercicios (ejercicios 2-6) que hemos discutido y desarrolla el código que refleje las relaciones y funcionalidades detalladas en esos diagramas.

De los cinco ejercicios que discutimos, selecciona uno que te resulte especialmente interesante o desafiante. Tu tarea es implementar un programa en Java que modele el escenario elegido. El programa debe incluir clases y métodos que representen fielmente las estructuras y relaciones observadas en los diagramas UML. Además, deberás incorporar un método "main" que demuestre cómo se interactuaría con tu sistema, mostrando la funcionalidad de las clases y los métodos que desarrollaste.

En tu implementación, cada clase del UML debe estar claramente definida con sus respectivos atributos y métodos. Es crucial que las interacciones entre clases, como asociaciones, agregaciones y composiciones, se manejen correctamente. Por ejemplo, considera un cliente que realiza un pedido; este acto debería desencadenar una serie de interacciones entre las clases Cliente y Pedido que tú necesitas codificar de manera coherente. Por ejemplo, para ello el Cliente debería tener un atributo que indicase el monto de dinero que tiene y posteriormente a realizar el pedido, dicho monto se debería ver afectado de forma "automática" es decir con un método que al realizar el pedido maneje el monto de dinero del cliente que ha realizado el pedido (esto es solo un ejemplo).

No te limites solo a replicar los diagramas y requerimientos; también tienes la libertad de añadir nuevas clases, variables, métodos o cualquier elemento que creas que puede enriquecer el proyecto. Puedes incluir listas o arrays para gestionar colecciones de objetos y agregar cálculos que enriquezcan la funcionalidad del programa.

Para demostrar que tu aplicación funciona como se espera, implementa en el método "main" una serie de pruebas que simulan situaciones reales donde se crean y manipulan objetos de acuerdo con los requisitos del sistema. Estas pruebas no solo ayudarán a verificar la correcta funcionalidad de tu aplicación, sino que también mostrarán cómo interactúan los componentes de tu modelo.

Comienza definiendo y construyendo las clases que formarán la base de tu aplicación, asegurándote de que cada una se adhiere a lo que fue especificado en el diagrama UML. Introduce gradualmente métodos que permitan manipular estas clases y avanza hacia la implementación de interacciones más complejas entre ellas. Durante todo el proceso, recuerda mantener tu código bien organizado y comentado, especialmente en aquellas secciones que manejen lógicas más complejas o menos intuitivas.

Recuerda ir realizando pruebas a medida que implementas nuevas funcionalidades.

Si terminas el proyecto referente al ejercicio elegido, puedes elegir otro de los ejercicios de UML hechos en clase y hacer lo mismo. Puedes hacerlo hasta 5 veces! Practica tanto cómo puedas!
 */


import java.util.*;  //Para importar todas las librerias de java.util

public class Main {
    /* public static void main(String[] args) {
        // Creación de nuevo usuario
        Usuario usuario = new Usuario();
    } */


    public static void main(String[] args) {
        // Usuarios
        Usuario usuario1 = new Usuario("Yenot", "Mandylorian", 121221, "yenot@yenot.com", 676867696, "LesYenotsRolling11", "Master User", "Planet Yenot avenue 111", "aaa");

        Usuario usuario2 = new Usuario("Yenotina", "Osgradskaya", 131331, "yenotina@yenot.com", 877865864, "LaYenotinaDancin22", "Commander User", "Planet Yenot plaza 222", "bbb");

        System.out.println("Lista de usuarios registrados: ");
        for (Usuario usuario : Usuario.getUsuario()) {
            System.out.println(usuario.getNombre() + " " + usuario.getApellido() + ", " + usuario.getCorreo());
        }

        // Admins
        Admin admin1 = new Admin("MrAdmin", "Administrator", 1111, "admin1@leyenots.com", "AdminYenotRolling12", "Logistics Admin", "Planet Yenot avenue 333");

        System.out.println("\n" + "Lista de administradores registrados: ");
        for (Admin admin : Admin.getAdmin()) {
            System.out.print(admin.getNombre() + " " + admin.getApellido() + ", " + admin.getRol() + "\n");
        }

        // Productos
        Inventario inventario = new Inventario();

        System.out.println("\n" + "Lista de productos registrados: ");

        inventario.addProducto(new Producto("Manzana", 121314, "Frutas", 0.99, 5, "26/04/2024", "06/07/2024"));

        inventario.addProducto(new Producto("Peras", 131416, "Frutas", 0.75, 5, "26/04/2024", "06/07/2024"));

        inventario.addProducto(new Producto("Brocoli", 141618, "Verduras", 1.80, 10, "29/04/2024", "05/06/2024"));

        for (Producto producto : inventario.getProductos()) {
            System.out.println(producto.getNombre() + ", " + producto.getCategoria() + ", " + producto.getPrecio());
        }

        // Notificacion
        Notificacion notificacion1 = new Notificacion("Has seleccionado este producto!", "29/04/2024", 125689);

        Notificacion notificacion2 = new Notificacion("Este producto es muy bueno!", "29/04/2024", 125689);

        String categoria = Producto.getCategoria();

        System.out.println("\n" + "Tienes una nueva notificación: ");
        switch (categoria) {
            case "Frutas":
                System.out.println(notificacion1.getCuerpoNotificacion());
                break;
            case "Verduras":
                System.out.println(notificacion2.getCuerpoNotificacion());
                break;
            default:
                System.out.println("No hay productos seleccionados!");
        }



        // Iniciar sesion

    }


}