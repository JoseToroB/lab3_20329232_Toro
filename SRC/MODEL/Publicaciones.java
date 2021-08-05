package MODEL;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Publicaciones {
    //atributos
    private static Integer idPublicaciones=0;//ID AUTOINCREMENTAL 
    private ArrayList<Respuesta> respuestas;
    private String cuerpo;
    private String fecha;
    private Usuario autor;
    private Integer likes;
    private Integer id;

    //constructor
    public Publicaciones(ArrayList<Respuesta> respuestas, String cuerpo, String fecha, Usuario autor) {
        this.respuestas = respuestas;
        this.cuerpo = cuerpo;
        this.autor = autor;
        this.likes = 0;
        idPublicaciones +=1;
        this.id =idPublicaciones;
        //OBTENER LA FECHA CON UTIL.DATE
        SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.fecha = tipoFecha.format(date);
    }
    
}
