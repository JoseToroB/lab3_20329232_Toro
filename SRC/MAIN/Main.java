package MAIN;

import CONTROL.Control;
import MODEL.*;
import VISUAL.*;
/*
imports
*/

/**
 * Clase principal en la cual se inicialiazara  M V C
 * @author Jose Toro
 */
public class Main {
        public  static void main(String[] args) {
          //creo el modelo
          RS redS =new RS();
          //creo el controlador
          Control ctrl = new Control(redS);
          //creo el visual
          Menu menu = new Menu(ctrl);
          System.out.print("despliego menu\n");
          menu.desplegarMenu();
          
        }
}
