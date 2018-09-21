
package main;

import control.Controllers;
import models.Modelos;
import views.Vistas;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelos modelblocnotas = new Modelos();
        Vistas viewblocnotas = new Vistas();
        Controllers ontrollerblocnotas = new Controllers(modelblocnotas, viewblocnotas); // Integra los componentes del modelo MVC.
        
    }
    
}
