package MODEL;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Publicaciones {
    //atributos
    private static Integer idPublicaciones=0;//ID AUTOINCREMENTAL 
    private ArrayList<Comentario> comentarioPubli;
    private ArrayList<String> etiquetados;
    private String cuerpoPubli;
    private String fechaPubli;
    private Usuario autorPubli;
    private Integer likesPubli;
    private Integer idPubli;
    private String tipoPubli;
    private Integer cantCompartidas;
    //constructor
    public Publicaciones(ArrayList<String> etiquetados, String cuerpo, Usuario autor,String tipoPubli) {
        this.comentarioPubli = new ArrayList();
        this.etiquetados=etiquetados;
        this.cuerpoPubli = cuerpo;
        this.autorPubli = autor;
        this.likesPubli = 0;
        this.cantCompartidas=0;
        this.tipoPubli=tipoPubli;
        idPublicaciones +=1;
        this.idPubli =idPublicaciones;
        //OBTENER LA FECHA CON UTIL.DATE
        SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.fechaPubli = tipoFecha.format(date);
    }

    public ArrayList<Comentario> getComentariosPubli() {
        return comentarioPubli;
    }

    public void setComentariosPubli(ArrayList<Comentario> comentariosPubli) {
        this.comentarioPubli = comentariosPubli;
    }

    public String getCuerpoPubli() {
        return cuerpoPubli;
    }

    public void setCuerpoPubli(String cuerpoPubli) {
        this.cuerpoPubli = cuerpoPubli;
    }

    public String getFechaPubli() {
        return fechaPubli;
    }

    public void setFechaPubli(String fechaPubli) {
        this.fechaPubli = fechaPubli;
    }

    public Usuario getAutorPubli() {
        return autorPubli;
    }

    public void setAutorPubli(Usuario autorPubli) {
        this.autorPubli = autorPubli;
    }

    public Integer getLikesPubli() {
        return likesPubli;
    }

    public void setLikesPubli(Integer likesPubli) {
        this.likesPubli = likesPubli;
    }

    public Integer getIdPubli() {
        return idPubli;
    }

    public void setIdPubli(Integer idPubli) {
        this.idPubli = idPubli;
    }

    public ArrayList<Comentario> getComentarioPubli() {
        return comentarioPubli;
    }

    public void setComentarioPubli(ArrayList<Comentario> comentarioPubli) {
        this.comentarioPubli = comentarioPubli;
    }

    public String getTipoPubli() {
        return tipoPubli;
    }

    public void setTipoPubli(String tipoPubli) {
        this.tipoPubli = tipoPubli;
    }

    //metodo agregarComentario
    public void agregarComentario(Comentario coment){
        ArrayList<Comentario> listComentarios_Publi=getComentariosPubli();
        listComentarios_Publi.add(coment);
        setComentariosPubli(listComentarios_Publi);
    }
    
}
