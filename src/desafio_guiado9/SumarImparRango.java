package desafio_guiado9;
import java.util.Scanner;

public class SumarImparRango {
    public void SumarImparRango(Scanner sc) {
        System.out.println("Este programa sumará los números impares que se encuentren en el rango que indiques.");
        //Ingresar el límite inferior
        System.out.println("Ingrese el primer número: ");
        int min = sc.nextInt();
        //Ingresar el límite superior
        System.out.println("Ingrese el segundo número: ");
        int max = sc.nextInt();
        //Almacenar la suma en variable sum
        int sum = 0;
        //Iniciar suma a través de los rangos
        for(int i = min; i <= max; i++)
        //Verificar si los números son impares
            if(i % 2 !=0){
                sum +=i;
            }
        System.out.printf("La suma de los números impares en el rango [%d, %d] es: %d\n", min, max, sum);
    }
}