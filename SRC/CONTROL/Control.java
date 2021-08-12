package CONTROL;

import MODEL.*;

import java.util.ArrayList;
/** 
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
    /** 
    * funcion que permite seguir a un usuario
    * @param userAseguir nombre del user a seguir
    */
    //funcion  follow
    public void follow(String userAseguir){
        RS redS = getRedSocial();
        Usuario online= redS.getUserOn();
        //recorro la lista para saber si existe el usuario  a seguir
        if(online.getUsername().equals(userAseguir)){
            //si se intenta seguir a si mismo se dara un mensaje de que no puede seguirse a si mismo
            System.out.println("No puedes seguirte a ti mismo\n");
        }
        else{
            int i;
            for (i = 0; i < redS.getUsers().size();i++){ 
                if(redS.getUsers().get(i).getUsername().equals(userAseguir)) {
                    //si encuentro un usuario con ese nombre entonces seguire con el codigo
                    ArrayList<Usuario> lista= online.getSeguidos();
                    lista.add(redS.getUsers().get(i));
                    online.setSeguidos(lista); 
                    System.out.println("Ahora sigues al usuario "+redS.getUsers().get(i).getUsername()+" \n");
                    return;//utilizo el return para cerrar el ciclo
                }
            }
            //si no encuentro el user entonces no hago nada
            System.out.println("Usuario a seguir inexistente\n");
        }
        
    }
    /** 
    * funcion que permite compartir una publicacion
    * @param idPost id del post que se quiere compartir
    * @param etiquetados lista de gente con la que se comparte, como los etiquetados en facebook
    */
    //funcion share
    public void share(Integer idPost,ArrayList<String> etiquetados){
        RS redS = getRedSocial();
        Usuario online= redS.getUserOn();
        int i;
        for (i = 0; i < redS.getPublis().size();i++){ 
            if(redS.getPublis().get(i).getIdPubli()==idPost) {
                //modifico la publicacion haciendo cantCompartidas+1
                Publicaciones publi = redS.getPublis().get(i);
                publi.aumentarComp();
                redS.getPublis().set(i,publi);
                //la agrego a la lista de compartidos del usuario
                online.agregarCompartidaUser(publi, etiquetados);
                redS.getUsers().set((online.getIdUser()-1), online);
                System.out.println("Publicacion compartida\n");
                return;//utilizo el return para cerrar el ciclo
            }
        }
        //si no encuentro el user entonces no hago nada
        System.out.println("Publicacion inexistente\n");
    }
    
    /** 
    * funcion que permite visualizar la red social
    * esta funcion no requiere parametros para ser utilizada
    */
    /*
    - SocialNetworkToString: Esta funcionalidad puede ser
    ejecutada con sesión iniciada o sin ella. En caso de ejecutarla
    con sesión iniciada debe entregar todos los elementos del
    usuario con sesión activa (publicaciones, lista de follows,
    reacciones, publicaciones compartidas, etc.) junto con los
    detalles del usuario (nombre de usuario y fecha de creación
    de cuenta. En caso de ejecutarla sin sesión iniciada, debe
    entregar todo lo que haya en la red social (usuarios
    registrados, listas de follows, publicaciones, etc.).
    - PrintSocialNetwork: Debe imprimir en pantalla el string
    obtenido de SocialNetworkToString en un formato
    comprensible por el usuario. Evite imprimir datos sensibles
    (como contraseñas).
    */
    //funcion visualize



    //metodos extras//
    

    /** 
    * funcion que permite comentar una publicacion o comentario
    * @param idPublicacion id del post, 0 en caso de ser a comentario
    * @param idComentario id del comentario, 0 en caso de ser a publicacion
    * @param texto contenido del comentario
    */
    //funcion comment 
    

    /** 
    * funcion que permite dar like a post o comentario
    * @param idPublicacion id del post, 0 en caso de ser a comentario
    * @param idComentario id del comentario, 0 en caso de ser a publicacion
    */
    //funcion like 
    
    ///////funcion isviral ista de publicaciones que complan con el criterio K
}
