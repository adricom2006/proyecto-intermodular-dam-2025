

public class Loro extends Ave{

    protected String origen;
    protected boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico,
                boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void habla() {
        System.out.println("¡¡¡¡¡grrrrrr!");
    }

    @Override
    public void muestra() {
        System.out.println("<Loro>");
        super.muestra();
        System.out.println("Origen: " + origen + "\nHabla?: " + habla);
    }

    public void volar() {
        System.out.println("Na Na Na gente, volando...");
    }
}
