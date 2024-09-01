package Exercises;

public class DataTypes {
    public String cadena;
    public int entero;
    public float flotante;
    public char caracter;  // Cambiado a public
    public boolean boleano;  // Cambiado a public

    // Constructor que inicializa los atributos
    public DataTypes() {
        this.cadena = "Hola Mundo";
        this.entero = 10;
        this.flotante = 5.9f;
        this.caracter = 'A';
        this.boleano = true;
    }

    // Nuevo constructor con parámetros
    public DataTypes(String cadena, int entero, float flotante, char caracter, boolean boleano) {
        this.cadena = cadena;
        this.entero = entero;
        this.flotante = flotante;
        this.caracter = caracter;
        this.boleano = boleano;
    }
}
