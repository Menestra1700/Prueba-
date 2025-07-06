package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private String narrador;

    public Documental(String titulo, String genero, int duracion, String tema, String narrador) {
        super(titulo, genero, duracion);
        this.tema = tema;
        this.narrador = narrador;
    }

    public void mostrarDetalles() {
        System.out.println("Documental: " + titulo);
        System.out.println("Tema: " + tema);
        System.out.println("Narrador: " + narrador);
        System.out.println("Duración: " + duracion + " min");
    }
}
