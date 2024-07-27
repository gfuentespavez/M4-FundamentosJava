package dia24;

public class Excepciones {
    private String valorUno;
    private String valorDos;
//Constructor
    public Excepciones(String valorDos, String valorUno) {
        this.valorDos = valorDos;
        this.valorUno = valorUno;
    }
//Getter and setters
    public String getValorUno() {
        return valorUno;
    }

    public void setValorUno(String valorUno) {
        this.valorUno = valorUno;
    }

    public String getValorDos() {
        return valorDos;
    }

    public void setValorDos(String valorDos) {
        this.valorDos = valorDos;
    }
    //Validaciones
    public static void main (String [] args){
        division("22", "0");
    }
    public static int division(String valorDos, String valorUno) {
        int resultado = 0;
        try {
            int uno = Integer.parseInt(valorUno);
            int dos = Integer.parseInt(valorDos);
            resultado = uno/dos;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Formato de número incorrecto: " + e.getMessage());
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error en aritmética: " + e.getMessage());
        }
        return resultado;
    }
}
