package MODEL;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
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
    
    //constructor
    public Comentario(Usuario autorComent, String cuerpoComent) {
        this.autorComent = autorComent;
        this.cuerpoComent = cuerpoComent;
        this.likesComent = 0;
        idComentarios +=1;
        this.idComent = idComentarios;
        //OBTENER LA FECHA CON UTIL.DATE
        SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.fechaComent = tipoFecha.format(date);
    }
    //getters y setters

    public Usuario getAutorComent() {
        return autorComent;
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
    
   
}