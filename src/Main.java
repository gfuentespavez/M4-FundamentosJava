import desafio_guiado9.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CambiarWhile
        CambiarWhile obj1 = new CambiarWhile();
        obj1.CambiarDoWhile();

        // Solo pares
        OnlyEven obj2 = new OnlyEven();
        obj2.OnlyEven(sc);

        // Sumar números impares
        SumaImpar obj3 = new SumaImpar();
        obj3.SumaImpar(sc);

        // Sumar números impares en un rango
        SumarImparRango obj4 = new SumarImparRango();
        obj4.SumarImparRango(sc);

        // Mostrar secuencia Fibonacci
        Fibonacci obj5 = new Fibonacci();
        obj5.Fibonacci(sc);

        //Cerrar Scanner
        sc.close();
    }
}