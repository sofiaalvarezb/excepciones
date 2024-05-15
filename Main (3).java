//Sofia Alvarez
//14/05/2024
//Primer Punto - Taller excepciones
public class Main {
    public static void main(String[] args) {
        String texto = "Hola";
        try {
            char caracter = texto.charAt(10); 
            System.out.println("Carácter: " + caracter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Índice fuera del rango: " + e.getMessage());
        }
    }
}
