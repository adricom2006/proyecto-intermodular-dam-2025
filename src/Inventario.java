

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    private ArrayList<Mascota> inventario;

    // Constructor
    public Inventario() {
        this.inventario = new ArrayList<>();
    }

    // Insertar animales en el inventario
    public void insertarAnimal(Mascota mascota) {
        inventario.add(mascota);
    }

    // Eliminar animales del inventario por nombre
    public void eliminarAnimal(String nombre) {
        Iterator<Mascota> iterator = inventario.iterator();
        while (iterator.hasNext()) {
            Mascota mascota = iterator.next();
            if (mascota.getNombre().equals(nombre)) {
                iterator.remove();
                System.out.println("Animal " + nombre + " eliminado.");
                return;
            }
        }
        System.out.println("No se encontró el animal con nombre: " + nombre);
    }

    // Vaciar el inventario
    public void vaciarInventario() {
        inventario.clear();
        System.out.println("El inventario ha sido vaciado.");
    }

    // Mostrar la lista de animales (tipo y nombre)
    public void mostrarListaAnimales() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Mascota mascota : inventario) {
                System.out.println(mascota.getClass().getSimpleName() + ": " + mascota.getNombre());
            }
        }
    }

    // Mostrar todos los datos de un animal concreto
    public void mostrarAnimal(String nombre) {
        for (Mascota mascota : inventario) {
            if (mascota.getNombre().equals(nombre)) {
                mascota.muestra();
                return;
            }
        }
        System.out.println("No se encontró el animal con nombre: " + nombre);
    }

    // Mostrar todos los datos de todos los animales
    public void mostrarTodosLosDatos() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Mascota mascota : inventario) {
                mascota.muestra();
                System.out.println("------------------------");
            }
        }
    }



}
