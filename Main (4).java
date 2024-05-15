//Sofia Alvarez
//14/05/2024
//Segundo Punto - Taller excepciones
public class Main {
  public static void main(String[] args) {
      int numerador = 10;
      int denominador = 0;
      try {
          int resultado = dividir(numerador, denominador);
          System.out.println("El resultado de la división es: " + resultado);
      } catch (ArithmeticException e) {
          System.out.println("Error: División por cero no está permitida.");
          e.printStackTrace();
      }
  }
  public static int dividir(int numerador, int denominador) {
      if (denominador == 0) {
          throw new ArithmeticException("Intento de división por cero.");
      }
      return numerador / denominador;
}
}