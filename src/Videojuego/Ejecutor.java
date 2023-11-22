package Videojuego;

import Videojuego.Logica.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor {
    public static void main(String[] args){
        List<Videojuego> videojuegos = new ArrayList<Videojuego>();

//      Crear videojuegos
        Videojuego video1 = new Videojuego(123, " kazooie","nintendo",4,"plataforma");
        Videojuego video2 = new Videojuego(698, "banjo ","pc",3,"plataforma");
        Videojuego video3 = new Videojuego(563, "la gata","Playstation",1,"plataforma");
        Videojuego video4 = new Videojuego(393, "aladino","Xbox",2,"plataforma");
        Videojuego video5 = new Videojuego(35, "tarzan","nintendo",2,"plataforma");

//      Cargar videojuegos en la lista
        videojuegos.add(video1);
        videojuegos.add(video2);
        videojuegos.add(video3);
        videojuegos.add(video4);
        videojuegos.add(video5);

//      Cambiar de nombre a dos videojuegos en la lista
        videojuegos.get(3).setTitulo("contreras");
        videojuegos.get(3).setCantJugadores(23);

        videojuegos.get(2).setTitulo("caled");
        videojuegos.get(2).setCantJugadores(245);

//        Leer Videojuegos en lista
        for (Videojuego videojuego : videojuegos){
            System.out.println(videojuego.toString());
        }

        System.out.println("-----------------------------------------------");
//        Leer Videojuegos que pertenescan a la plataforma de "nintendo"
        for (Videojuego videojuego : videojuegos){
            if (videojuego.getConsola().equals("nintendo")){
                System.out.println(videojuego.toString());

            }

        }

    }
}
