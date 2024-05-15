//Sofia Alvarez
//14/05/2024
//Tercer Punto - Taller excepciones
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "programacion1"; 
        String[] nombresValidos = {"programacion1", "programacion2", "programacion3"};
        boolean archivoValido = false;
        for (String nombreValido : nombresValidos) {
            if (nombreArchivo.equals(nombreValido)) {
                archivoValido = true;
                break;
            }
        }
        if (!archivoValido) {
            System.out.println("El archivo \"" + nombreArchivo + "\" no se encontró.");
            return;
        }
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo + ".txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("El archivo \"" + nombreArchivo + "\" no se encontró.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo \"" + nombreArchivo + "\".");
            e.printStackTrace();
 }
}
}