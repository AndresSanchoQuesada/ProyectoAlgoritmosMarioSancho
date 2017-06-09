
import Bussiness.PeliculaBussiness;
import Data.PeliculaData;
import Domain.ListaGenero;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n
 */
public class MovieTest {
    public static void main(String[] args) {
        PeliculaBussiness pelibusiBussiness = new PeliculaBussiness();
        ListaGenero[]lista= pelibusiBussiness.loadCL();
        
        for (ListaGenero l : lista) {
            System.out.println(l.tail.toString());
        }
        
        
        
        
    }
    
}
