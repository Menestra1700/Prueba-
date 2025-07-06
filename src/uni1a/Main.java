package uni1a;

public class Main {
    public static void main(String[] args) {
       
        Pelicula pelicula = new Pelicula("El Viaje Final", "Aventura", 120, "Ana López", 2024);
        Trailer trailer = new Trailer("Trailer Oficial - El Viaje Final", "Aventura", 120, pelicula, "2025-06-01");

        System.out.println("=== TRAILER ===");
        trailer.mostrarDetalles();
        System.out.println();

        Documental doc1 = new Documental("La Vida en el Desierto", "Naturaleza", 25, "Ecosistemas áridos", "Carlos Rivera");
        Documental doc2 = new Documental("Océanos Profundos", "Ciencia", 30, "Vida marina", "Lucía Torres");

        Noticiero noticiero = new Noticiero("Noticias Naturaleza", "Informativo", 60, "Canal 9");
        noticiero.agregarDocumental(doc1);
        noticiero.agregarDocumental(doc2);

        System.out.println("=== NOTICIERO ===");
        noticiero.mostrarDetalles();
        System.out.println();

       
        SerieDeTV serie = new SerieDeTV("Misterios del Tiempo", "Ciencia ficción", 45, "Netflix");
        serie.agregarTemporada(new Temporada(1, 8));
        serie.agregarTemporada(new Temporada(2, 10));

        System.out.println("=== SERIE DE TV ===");
        serie.mostrarDetalles();
    }
}
