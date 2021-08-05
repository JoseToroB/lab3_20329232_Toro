package MODEL;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
*Clase usuario pertenece al modelo
*@author Jose Toro
*/
public class Usuario {
    //atributos
    private static Integer idUsuarios =0;
    private Integer idUser;
    private String fechaRegistro;//quiza al momento de mostrar la RS utilizo la fecha de registro
    private String username;
    private String password;
    private ArrayList<Publicaciones> publicacionesRealizadas;
    private ArrayList<Comentario> comentariosRealizados;
    private ArrayList<Usuario> Seguidos;

    //constructor
    public Usuario(String username, String password) {
        idUsuarios +=1;
        this.idUser = idUsuarios;
        this.username = username;
        this.password = password;
        this.publicacionesRealizadas = new ArrayList();
        this.comentariosRealizados = new ArrayList();
        this.Seguidos = new ArrayList();
         //OBTENER LA FECHA CON UTIL.DATE
         SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
         Date date = new Date();
        this.fechaRegistro = tipoFecha.format(date);
    }
    //getters y setters
    public Integer getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Publicaciones> getPublicacionesRealizadas() {
        return publicacionesRealizadas;
    }

    public void setPublicacionesRealizadas(ArrayList<Publicaciones> publicacionesRealizadas) {
        this.publicacionesRealizadas = publicacionesRealizadas;
    }

    public ArrayList<Comentario> getComentariosRealizados() {
        return comentariosRealizados;
    }

    public void setComentariosRealizados(ArrayList<Comentario> comentariosRealizados) {
        this.comentariosRealizados = comentariosRealizados;
    }

    public ArrayList<Usuario> getSeguidos() {
        return Seguidos;
    }

    public void setSeguidos(ArrayList<Usuario> seguidos) {
        Seguidos = seguidos;
    }

    //metodos
    
    /*
     * Metodo que permite agregar una publicacion 
     * @param publi una publi
     */
    public void agregarPubliUser(Publicaciones publi){
        ArrayList<Publicaciones> listaPublisUser = getPublicacionesRealizadas();
        listaPublisUser.add(publi);
        setPublicacionesRealizadas(listaPublisUser);
    }

    /*
     * Metodo que permite agregar un comentario
     * @param coment un coment
     */
    public void agregarComentUser(Comentario coment){
        ArrayList<Comentario> listaComentsUser = getComentariosRealizados();
        listaComentsUser.add(coment);
        setComentariosRealizados(listaComentsUser);
    }
    
    /*
     * Metodo que permite agregar un seguido (user)
     * @param user un user
     */
    public void agregarSeguidosUser(Usuario seguido){
        ArrayList<Usuario> listaSeguidosUser = getSeguidos();
        listaSeguidosUser.add(seguido);
        setSeguidos(listaSeguidosUser);
    }

}
