package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
    private String plataforma;
    private ArrayList<Temporada> temporadas;

    public SerieDeTV(String titulo, String genero, int duracion, String plataforma) {
        super(titulo, genero, duracion);
        this.plataforma = plataforma;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public void mostrarDetalles() {
        System.out.println("Serie de TV: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Duración promedio: " + duracion + " min por episodio");
        System.out.println("Temporadas:");
        for (Temporada t : temporadas) {
            t.mostrarInfo();
        }
    }
}
