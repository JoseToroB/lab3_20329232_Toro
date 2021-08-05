package MODEL;

import java.util.ArrayList;
    /*
    * Clase perteneciente al modelo,contiene la estructura de la RS.
    * @author Jose Toro
    */
public class RS {
     //Atributos
     private ArrayList<Publicaciones> publis;
     private ArrayList<Usuario> users;
     private Usuario userOn;
     private boolean conectado = false;
 
    //constructor
    /*
    * constructor de la RS, no necesita parametros para inicializarce
    * 
    */
    public RS(){
        //creo la RS con sus 3 arrays 
        this.publis= new ArrayList<>();
        this.users= new ArrayList<>();
        //agregar usuarios Toro, pipo
        //una publicacion de toro
        //un comentario y like de pipo 

    }
    //getters

    /*
    *@return ArrayList de publis
    */
    public ArrayList<Publicaciones> getPublis() {
        return publis;
    }
    /*
    *@return ArrayList de users
    */
    public ArrayList<Usuario> getUsers() {
        return users;
    }
    /*
    * @return el Usuario conectado
    */
    public Usuario getUserOn() {
        return userOn;
    }
    /*
    * @return boolean si alguien esta online
    */
    public boolean isConectado() {
        return conectado;
    }

    //setters

    /*
    *@param publicaciones ArrayList con publis
    */
    public void setPublis(ArrayList<Publicaciones> publis) {
        this.publis = publis;
    }
    
    /*
    *@param users ArrayList 
    */
    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
    /*
    *@param usuario online
    */
    public void setUserOn(Usuario userOn) {
        this.userOn = userOn;
    }
    /*
    *@param saber si alguien esta online
    */
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    //falta el metodo "toString"
}
