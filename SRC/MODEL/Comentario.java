package MODEL;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/** 
*Clase comentario pertence a model, contiene la struct de un comentario
*@author Jose Toro
*/
public class Comentario{
    //atributos
    private static Integer idComentarios = 0;
    private Usuario autorComent;
    private String fechaComent;
    private String cuerpoComent;
    private Integer idComent;
    private Integer likesComent;
    private Integer comentObjetivo;
    private Integer publiObjetivo;
    private ArrayList<Comentario> comentarios;
    
    //constructor
    public Comentario(Usuario autorComent, String cuerpoComent) {
        this.autorComent = autorComent;
        this.cuerpoComent = cuerpoComent;
        this.likesComent = 0;
        idComentarios +=1;
        this.idComent = idComentarios;
        this.comentarios=new ArrayList<>();
        //OBTENER LA FECHA CON UTIL.DATE
        SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.fechaComent = tipoFecha.format(date);
    }
    //to string de un comentario
    public String comentarioAstring(){
        return  "Autor: "+autorComent.getUsername()+" ID comentario: "+ idComent+" fecha:"+fechaComent+"\n    "+cuerpoComent+"\n    likes:"+likesComent+"\n";
    }
    //getters y setters

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }
    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public Usuario getAutorComent() {
        return autorComent;
    }
    public Integer getComentObjetivo() {
        return comentObjetivo;
    }
    public void setComentObjetivo(Integer comentObjetivo) {
        this.comentObjetivo = comentObjetivo;
    }
    public Integer getPubliObjetivo() {
        return publiObjetivo;
    }
    public void setPubliObjetivo(Integer publiObjetivo) {
        this.publiObjetivo = publiObjetivo;
    }
    public void setAutorComent(Usuario autorComent) {
        this.autorComent = autorComent;
    }

    public String getFechaComent() {
        return fechaComent;
    }

    public String getCuerpoComent() {
        return cuerpoComent;
    }

    public Integer getIdComent() {
        return idComent;
    }

    public Integer getLikesComent() {
        return likesComent;
    }

    public void setLikesComent(Integer likesComent) {
        this.likesComent = likesComent;
    }
    public void aumentarLikeComent(){
        Integer n;
        n= getLikesComent()+1;
        setLikesComent(n);
    }
   
}