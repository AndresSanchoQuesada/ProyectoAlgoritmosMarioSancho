/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.ListaGenero;
import Domain.Pelicula;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andres
 */
public class PeliculaData {

    private String dataset;
    private String[] genders;
    
    /*listas*/
    public ListaGenero Drama;
    public ListaGenero Comedy;
    public ListaGenero Childish;
    public ListaGenero Action;
    public ListaGenero Romance;
    public ListaGenero Fiction;

    public PeliculaData() {
        this.dataset = "datos.csv";

    }

    /*cargar listas*/
    public ListaGenero[] loadCL() {

        /*se crean las listas*/
        Drama = new ListaGenero("Drama");
        Comedy = new ListaGenero("Comedy");
        Childish = new ListaGenero("Childish");
        Action = new ListaGenero("Action");
        Romance = new ListaGenero("Romance");
        Fiction = new ListaGenero("Fiction");

        BufferedReader br = null;
        String line = "";
        

        try {

            br = new BufferedReader(new FileReader(dataset));
            while ((line = br.readLine()) != null) {

                /*Se separa cada línea por comas*/
                String[] movie = line.split(",");
                
                switch (movie[2].trim()) {
                    case "1000":
                        Drama.insertMovie(new Pelicula(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5]));
                        break;
                    case "2000":
                        Comedy.insertMovie(new Pelicula(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5]));
                        break;
                    case "3000":
                        Childish.insertMovie(new Pelicula(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5]));
                        break;
                    case "4000":
                        Action.insertMovie(new Pelicula(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5]));
                        break;
                    case "5000":
                        Romance.insertMovie(new Pelicula(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5]));
                        break;
                    case "6000":
                        Fiction.insertMovie(new Pelicula(movie[0], movie[1], movie[2], movie[3], movie[4], movie[5]));
                        break;
                }

                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*retorna arreglo de listas*/
        ListaGenero []lista = {Drama,Comedy, Childish,Action, Romance, Fiction};
        System.out.println(Drama.headMovie.toString());
        return lista;

    }

    public String getGenders() {
        return "";
    }

}
