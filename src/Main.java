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

        //Solo pares desde 0
        OnlyEvenZero obj2 = new OnlyEvenZero();
        obj2.OnlyEvenZero(sc);

        // Solo pares desde 1
        OnlyEven obj3 = new OnlyEven();
        obj3.OnlyEven(sc);

        // Sumar números impares
        SumaImpar obj4 = new SumaImpar();
        obj4.SumaImpar(sc);

        // Sumar números impares en un rango
        SumarImparRango obj5 = new SumarImparRango();
        obj5.SumarImparRango(sc);

        // Mostrar secuencia Fibonacci
        Fibonacci obj6 = new Fibonacci();
        obj6.Fibonacci(sc);

        //Cerrar Scanner
        sc.close();

    }
}