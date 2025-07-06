Los objetivos y propósito del proyecto

El objetivo de este proyecto es desarrollar un sistema orientado a objetos en 
Java para modelar distintos tipos de contenido audiovisual, aplicando conceptos 
avanzados de Programación Orientada a Objetos (POO) como herencia, asociación, 
agregación y composición. Se busca representar entidades como películas, series, 
documentales y sus componentes, para practicar la estructuración de clases 
y relaciones reales.

Las clases y funcionalidades nuevas que has añadido

Trailer: Clase que representa trailers asociados a películas
Pelicula: Clase que extiende de una clase base de contenido audiovisual, contiene atributos específicos y asociación con trailers y actores
Noticiero: Representa un tipo de contenido audiovisual orientado a noticias, con relación hacia Documental
Documental: Contenido audiovisual documental, asociado a la clase Investigador
Actor: Modela actores que participan en películas
SerieDeTV: Representa series de televisión, con asociación a múltiples temporadas
Temporada: Parte de una serie, contiene información de episodios
Investigador: Relacionado con documentales, representa investigadores involucrados en ellos

Funcionalidades principales
Creación y gestión de objetos representando diferentes tipos de contenido audiovisual
Establecimiento de relaciones (asociación, agregación y composición) entre las clases
Métodos para mostrar detalles de cada entidad, aprovechando polimorfismo
Implementación de un programa principal (`main`) que crea instancias y muestra su interacción

Instrucciones para clonar y ejecutar el proyecto
Clona este repositorio:
bash
git clone https://github.com/Menestra1700/Prueba-
Abre el proyecto en tu IDE Java como eclipse
Como recomendación debe de tener instalado Java JDK 11
Ejecuta la clase principal que contiene el método main
