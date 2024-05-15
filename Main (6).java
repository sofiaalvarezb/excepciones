//Angela Sofia Alvarez Becerra 
//14-05-2024
//Cuarto punto del taller de excepciones
class ExcepcionA extends Exception {
    public ExcepcionA(String mensaje) {
        super(mensaje);
    }
}
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String mensaje) {
        super(mensaje);
    }
}
class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String mensaje) {
        super(mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new ExcepcionC("Excepcion de tipo ExcepcionC");
        } catch (ExcepcionA e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}




