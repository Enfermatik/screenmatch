package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTIempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

//    public void incluye(Pelicula pelicula){
//    tiempoTotal+= pelicula.getDuracionEnMinutos();
//    }
//    public void incluye(Serie serie){
//        tiempoTotal+= serie.getDuracionEnMinutos();
//    }
    public void incluye(Titulo titulo){
        this.tiempoTotal+=titulo.getDuracionEnMinutos();
    }

}
