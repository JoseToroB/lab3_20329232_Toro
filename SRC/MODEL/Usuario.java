package MODEL;

import java.util.ArrayList;
/** 
*Clase usuario pertenece al modelo
*@author Jose Toro
*/
public class Usuario {
    //atributos
    private static Integer idUsuarios =0;
    private Integer idUser;
    private String username;
    private String password;
    private ArrayList<Publicaciones> publicacionesRealizadas;
    private ArrayList<Comentario> comentariosRealizados;
    private ArrayList<Usuario> Seguidos;
    private ArrayList<Compartidas> publicacionesCompartidas;
    //constructor
    public Usuario(String username, String password) {
        idUsuarios +=1;
        this.idUser = idUsuarios;
        this.username = username;
        this.password = password;
        this.publicacionesRealizadas = new ArrayList<>();
        this.publicacionesCompartidas =new ArrayList<>();
        this.comentariosRealizados = new ArrayList<>();
        this.Seguidos = new ArrayList<>();
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

    public ArrayList<Compartidas> getPublicacionesCompartidas() {
        return publicacionesCompartidas;
    }

    public void setPublicacionesCompartidas(ArrayList<Compartidas> publicacionesCompartidas) {
        this.publicacionesCompartidas = publicacionesCompartidas;
    }

    //metodos
    
     
    /** 
     * Metodo que permite agregar una publicacion 
     * @param publi una publi
     */
    public void agregarPubliUser(Publicaciones publi){
        ArrayList<Publicaciones> listaPublisUser = getPublicacionesRealizadas();
        listaPublisUser.add(publi);
        setPublicacionesRealizadas(listaPublisUser);
    }

    /** 
     * Metodo que permite agregar un comentario
     * @param coment un coment
     */
    public void agregarComentUser(Comentario coment){
        ArrayList<Comentario> listaComentsUser = getComentariosRealizados();
        listaComentsUser.add(coment);
        setComentariosRealizados(listaComentsUser);
    }
    /** 
     * Metodo que permite agregar una publicacion compartida 
     * @param publicacion publicacion a agregar
     * @param etiquetados con quien se comparte
     */
    public void agregarCompartidaUser(Publicaciones publicacion,ArrayList<String> etiquetados){
        Compartidas comp=new Compartidas(publicacion,etiquetados);
        ArrayList<Compartidas> lista= getPublicacionesCompartidas();
        lista.add(comp);
        setPublicacionesCompartidas(lista);
    }
    /** 
     * Metodo que permite agregar un seguido (user)
     * @param user un user
     */
    public void agregarSeguidosUser(Usuario seguido){
        ArrayList<Usuario> listaSeguidosUser = getSeguidos();
        listaSeguidosUser.add(seguido);
        setSeguidos(listaSeguidosUser);
    }
    //usuario a string
    public String userAstring(){

        return "Nombre:"+username+" Tienes un total de:"+publicacionesRealizadas.size()+"publicaciones realizadas\ny un total de:"+Seguidos+" usuarios seguidos\n";
    }

}
