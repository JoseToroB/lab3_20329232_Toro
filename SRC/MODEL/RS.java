package MODEL;

import java.util.ArrayList;
    /*
    * Clase perteneciente al modelo,contiene la estructura de la RS.
    * @author Jose Toro
    */
public class RS {
     //Atributos
     private int cantPublis;
     private ArrayList<Publicaciones> publis;
     private int cantComents;
     private ArrayList<Comentario> coments; 
     private int cantUsers;
     private ArrayList<Usuarios> users;
     private Usuario userOn;
     private boolean conectado = false;
 
    //constructor
    /*
    * constructor de la RS, no necesita parametros para inicializarce
    * 
    */
    public RS(){
        //creo la RS con sus 3 arrays 
        this.cantPublis=0;
        this.publis= new Arraylist<>();
        this.cantComents=0;
        this.coments new Arraylist<>();
        this.cantUsers=0;
        this.users= new Arraylist<>();
        //agregar usuarios Toro, pipo
        //una publicacion de toro
        //un comentario y like de pipo 

    }
    //getters

    /*
    *@return ArrayList de publis
    */
    public ArrayList<Publicaciones> getPublis()) {
        return publis;
    }
    /*
    *@return ArrayList de coments
    */
    public ArrayList<Comentario> getComents()) {
        return coments;
    }
    /*
    *@return ArrayList de users
    */
    public ArrayList<Usuarios> getUsers()) {
        return users;
    }
    /*
    * @return el Usuario conectado
    */
    public Usuario getUserOn() {
        return userOn;
    }
    /*
    * @return cantidad de publis
    */
    public int getCantPublis() {
        return cantPublis;
    }
    /*
    * @return cantidad de comentarios
    */
    public int getCantComents() {
        return cantComents;
    }
     /*
    * @return cantidad de users
    */
    public int getCantUsers() {
        return cantUsers;
    }
    /*
    * @return boolean si alguien esta online
    */
    public boolean isConectado() {
        return conectado;
    }

    //setters

    /*
    *@param cantidadPublicaciones
    */
    public void setCantPublis(int cantPublis) {
        this.cantPublis = cantPublis;
    }
    /*
    *@param publicaciones ArrayList con publis
    */
    public void setPublis(ArrayList<Publicaciones> publis) {
        this.publis = publis;
    }
    /*
    *@param cantidadComentarios
    */
    public void setCantComents(int cantComents) {
        this.cantComents = cantComents;
    }
    /*
    *@param comentarios ArrayList 
    */
    public void setComents(ArrayList<Comentario> coments) {
        this.coments = coments;
    }
    /*
    *@param cantidad usuarios
    */
    public void setCantUsers(int cantUsers) {
        this.cantUsers = cantUsers;
    }
    /*
    *@param users ArrayList 
    */
    public void setUsers(ArrayList<Usuarios> users) {
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
