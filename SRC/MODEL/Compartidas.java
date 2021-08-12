package MODEL;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
/** 
*Clase compartidas pertence a model, contiene la struct de una publicacion compartida (fecha en que se comparte y con quien)
*@author Jose Toro
*/
public class Compartidas {
    //atributos
    private Publicaciones publiCompartida;
    private String fechaCompartir;
    private ArrayList<String> etiquetadosCompartidos;

    public Compartidas(Publicaciones publiCompartida, ArrayList<String> etiquetadosCompartidos) {
        this.publiCompartida = publiCompartida;
        this.etiquetadosCompartidos = etiquetadosCompartidos;
         //OBTENER LA FECHA CON UTIL.DATE
         SimpleDateFormat tipoFecha = new SimpleDateFormat("dd/MM/yyyy");
         Date date = new Date();
         this.fechaCompartir = tipoFecha.format(date);
    }

    public Publicaciones getPubliCompartida() {
        return publiCompartida;
    }

    public void setPubliCompartida(Publicaciones publiCompartida) {
        this.publiCompartida = publiCompartida;
    }

    public String getFechaCompartir() {
        return fechaCompartir;
    }

    public void setFechaCompartir(String fechaCompartir) {
        this.fechaCompartir = fechaCompartir;
    }

    public ArrayList<String> getEtiquetadosCompartidos() {
        return etiquetadosCompartidos;
    }

    public void setEtiquetadosCompartidos(ArrayList<String> etiquetadosCompartidos) {
        this.etiquetadosCompartidos = etiquetadosCompartidos;
    }
    
    //compartida a string
    public String compartidaAstring(){
        return "Fecha compartida: "+ fechaCompartir +" Etiquetados:"+etiquetadosCompartidos+"\n";
    }

}
