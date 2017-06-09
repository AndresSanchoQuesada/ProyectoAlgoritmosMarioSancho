/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.PeliculaData;
import Domain.ListaGenero;

/**
 *
 * @author andres
 */
public class PeliculaBussiness {
    PeliculaData peliculaData;
    
    public PeliculaBussiness(){
        this.peliculaData = new PeliculaData();
    }
    
    public String getGenders(){
        return peliculaData.getGenders();
    }
    
    public ListaGenero[] loadCL(){
        return this.peliculaData.loadCL();
    }
    
}
