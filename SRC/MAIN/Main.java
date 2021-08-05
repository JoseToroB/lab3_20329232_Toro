package MAIN;

import java.util.Date;
import java.text.SimpleDateFormat;



/*
imports
*/

/**
 * Clase principal en la cual se inicialiazara  M V C
 * @author Jose Toro
 */
public class Main {
        public  static void main(String[] args) {
          System.out.println("clase main, debo llamar a menu");
          SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
          Date date = new Date();
          System.out.println(tipoFecha.format(date));
        }
}
