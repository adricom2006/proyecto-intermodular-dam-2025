
public class Gato extends Mascota{

    protected String color;
    protected boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println("<Gato>");
        super.muestra();
        System.out.println("Color: " + color + "\nTiene pelo largo?: " + peloLargo);
    }

    @Override
    public void habla() {
        System.out.println("Miau");
    }
}
