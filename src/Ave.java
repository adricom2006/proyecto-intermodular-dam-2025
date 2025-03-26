

public abstract class Ave extends Mascota {

    protected String pico;
    protected boolean vuela;

    public Ave(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    @Override
    public void muestra() {
        super.muestra();
        System.out.println("Tiene pico?: " + pico
        + "\nVuela?: " + vuela);
    }

    public abstract void volar();
}

