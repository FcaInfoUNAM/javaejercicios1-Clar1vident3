package Exercises;

public class Padre {
    String apellido;

//El constructor se encarga de inicializar el atributo de la clase
//Los dos tipos de constructores son el constructor por defecto y el constructor con parametros

public Padre(String apellidoN) {
        this.apellido = apellidoN;
    
    }

    public Boolean test() {

        Hijo hijo = new Hijo("Juan", this.apellido);
        
        EspirituSanto es = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        
        return es.pruebaParternidad();
    }
}