package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarInfo() {
        System.out.println("Investigador: " + nombre + " | Especialidad: " + especialidad);
    }

    public String getNombre() {
        return nombre;
    }
}
