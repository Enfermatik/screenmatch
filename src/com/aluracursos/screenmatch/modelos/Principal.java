package com.aluracursos.screenmatch.modelos;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTIempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());



        Serie casadDragon= new Serie();
        casadDragon.setNombre("La casa del Dragon");
        casadDragon.setFechaDeLanzamiento(2022);
        casadDragon.setTemporadas(1);
        casadDragon.setMinutosPorEpisodio(50);
        casadDragon.setEpisodiosPorTemporada(10);
        casadDragon.muestraFichaTecnica();
        System.out.println(casadDragon.getDuracionEnMinutos() + "minutos");

        Pelicula otraPelicula= new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTIempo calculadora = new CalculadoraDeTIempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casadDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio= new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de Targaryen");
        episodio.setSerie(casadDragon);
        episodio.setVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno= new Pelicula();
        peliculaDeBruno.setNombre("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2011);

        ArrayList<Pelicula> listaDePeliculas= new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: "+ listaDePeliculas.get(0).toString());

    }
}
