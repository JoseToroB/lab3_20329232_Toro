package CONTROL;

import MODEL.*;

import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner;
/*
*clase  correspondiente al controlador
*en esta clase esta la mayoria de metodos solicitados
* @author jose toro
*/
public class Control {
    //atributos
    //el control tiene como atributos las clases del modelo
    //modelo
    private RS redSocial;
    //constructor
    public Control(RS redSocial) {
        this.redSocial = redSocial;
    }
    //getters 
    public RS getRedSocial() {
        return redSocial;
    }
    //metodos
    //ahora creare los metodos solicitados en el laboratorio

    /** 
    * revisar si existe algun usuario online
    * @return  true o false
    */
    public boolean existeOnline(){
        RS redSocial =getRedSocial();
        return redSocial.isConectado();
    }
    /** 
    * retorna el usuario conectado
    * @return  un usuario
    */
    public Usuario entregarOnline(){
        RS redSocial =getRedSocial();
        return redSocial.getUserOn();
    }

    //metodos importantes
    /** 
    *metodo que permite registrarse si el nombre es valido
    * @param username es el nombre del usuario
    * @param pass contraseña del usuario
    */
    //funcion register (parte de authentication)
    public void register(String username,String pass){
        RS redS = getRedSocial();
        int i;
        for (i = 0; i < redS.getUsers().size();i++){ 
            if (redS.getUsers().get(i).getUsername().equals(username)) {
                System.out.println("Nickname no disponible\n");
                return;//utilizo el return para cerrar el ciclo
            }
        }
        Usuario nUser = new Usuario(username, pass);
        redS.getUsers().add(nUser);
        System.out.println("Registrado con exito\n");
    }

    /** 
    *metodo que permite logearse si los datos de ingreso son validos
    * @param username es el nombre del usuario
    * @param pass contraseña del usuario
    */
    //funcion login (parte de authentication)
    public void login(String username,String pass){
        RS redS = getRedSocial();
        int i;
        for (i = 0; i < redS.getUsers().size();i++) { 
            ///recorro la lista de users, comparando con cada uno nombre y pass
            if ( redS.getUsers().get(i).getUsername().equals(username) && redS.getUsers().get(i).getPassword().equals(pass) ) {
                //si encuentro un usuario con ese nombre y contraseña entonces lo logeo
                //establezco el booleano en conectado true y cambio el usuario userOn
                /*
                private Usuario userOn;
                */
                redS.setConectado(true);
                redS.setUserOn(redS.getUsers().get(i));
                return;//utilizo el return para cerrar el ciclo
            }
        }
        //si no encuentro el user entonces le digo que algun dato esta mal
        System.out.println("Alguno dato es incorrecto\n");
    }

    /** 
    *metodo para desconectar a un usuario de la red social
    */
    //funcion logut (parte de authentication)
    public void logout(){
        RS redS = getRedSocial();
        redS.setConectado(false);
        //al cambiar este booleano a false, simboliza que no hay nadie conectado, sin embargo la var
        //userOn seguira manteniendo al ultimo usuario que se logeo
    }

    /** 
    * funcion que permite crear una publicacion 
    * @param tipoPubli String que simboliza el tipo de publicacion (foto,texto,gif )
    * @param contenido contenido de la publicacion ya sea el texo, la foto, etc
    * @param etiquetados lista de gente con la que se comparte, como los etiquetados en facebook
    */
    //funcion post
    public void post(String tipoPubli, String contenido,ArrayList<String> etiquetados){
        RS redS = getRedSocial();
        //creo la publicacion 
        Usuario autor = redS.getUserOn();
        Publicaciones publi =new Publicaciones(etiquetados, contenido, autor, tipoPubli);
        //agrego la publicacion al usuario online
        autor.getPublicacionesRealizadas().add(publi);
        //agrego la publicacion a la lista de publicaciones totales de  la RS
        redS.getPublis().add(publi);
        //entrego un mensaje para que el usuario sepa que su publicacion fue agregada
        System.out.println("Publicado\n");
    }
}
