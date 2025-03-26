
public class Perro extends Mascota{

    protected String raza;
    protected boolean tienePulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean tienePulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.tienePulgas = tienePulgas;
    }

    @Override
    public void muestra() {
        System.out.println("<Perro>");
        super.muestra();
        System.out.println("Raza: " + raza + "\nTiene pulgas?: " + tienePulgas);
    }

    @Override
    public void habla() {
        System.out.println("Guau");
    }
}
