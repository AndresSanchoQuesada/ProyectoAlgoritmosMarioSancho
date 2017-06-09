/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.Node;

/**
 *
 * @author andres
 */
public class ListaGenero {

    public Pelicula headMovie, tail;
    public String gender;
    
    public ListaGenero() {
        this.headMovie = headMovie;
        this.tail = tail;
    }

    public ListaGenero(String gender) {
        this.headMovie = headMovie;
        this.tail = tail;
        this.gender = gender;
    }

    public void insertMovie(Pelicula movie) {

        Pelicula newMovie = movie;
        //newMovie.dato = x;
        if (headMovie == null) {
            headMovie = newMovie;
            headMovie.nextMovie = headMovie;
            newMovie.prevMovie = tail;
            tail = newMovie;
        } else {
            tail.nextMovie = newMovie;
            newMovie.nextMovie = headMovie;
            newMovie.prevMovie = tail;
            tail = newMovie;
            headMovie.prevMovie = tail;
        }

    }

//    public void printList() {
//        Node node = new Node();
//        node = headNodo;
//        do {
//            System.out.println(node.dato);
//            node = node.next;
//        } while (node != headNodo);
//
//    }

}
