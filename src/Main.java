

public class Main {
    public static void main(String[] args) {



        // Crear algunas mascotas
        Perro perro1 = new Perro("Rex", 5, "Saludable", "2018-03-15", "Pastor Alemán", true);
        Gato gato1 = new Gato("Whiskers", 3, "Saludable", "2020-06-10", "Negro", true);
        Loro loro1 = new Loro("Polly", 2, "Saludable", "2022-07-25", "Curvo", true, "Amazonas", true);

        // Crear inventario de mascotas
        Inventario inventario = new Inventario();

        // Insertar animales
        inventario.insertarAnimal(perro1);
        inventario.insertarAnimal(gato1);
        inventario.insertarAnimal(loro1);

        // Mostrar lista de animales
        System.out.println("Lista de animales:");
        inventario.mostrarListaAnimales();

        // Mostrar todos los datos de un animal específico
        System.out.println("\nDatos de 'Rex':");
        inventario.mostrarAnimal("Rex");

        // Mostrar todos los datos de todos los animales
        System.out.println("\nDatos de todos los animales:");
        inventario.mostrarTodosLosDatos();

        // Eliminar un animal
        System.out.println("\nEliminando 'Whiskers'...");
        inventario.eliminarAnimal("Whiskers");

        // Mostrar lista de animales después de la eliminación
        System.out.println("\nLista de animales después de eliminación:");
        inventario.mostrarListaAnimales();

        // Vaciar el inventario
        System.out.println("\nVaciando el inventario...");
        inventario.vaciarInventario();

        // Mostrar lista vacía
        System.out.println("\nLista de animales después de vaciar el inventario:");
        inventario.mostrarListaAnimales();

    }
}
