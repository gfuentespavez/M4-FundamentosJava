import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nota 1
        System.out.println("Ingresar nota 1");
        float nota1 = sc.nextFloat();
        //Nota 2
        System.out.println("Ingresar nota 2");
        float nota2 = sc.nextFloat();
        //Nota 3
        System.out.println("Ingresar nota 3");
        float nota3 = sc.nextFloat();
        //Nota 4
        System.out.println("Ingresar nota 4");
        float nota4 = sc.nextFloat();
        //Cálculo promedio
        float promedio = (float)((nota1 + nota2 + nota3 + nota4)/4);
        System.out.println("Tu promedio final es: " + promedio);
        //Rendir recuperación para examen
        if(promedio < 4) {
            System.out.println("Debes dar una prueba de recuperación para poder rendir el examen final");
            //calcular nota necesaria en base 70-30 A examen con un 4
            float recuperativa = (float)((4.0 - (promedio * 0.7)) / 0.3);
            System.out.println("Necesitas una nota recuperativa de: " + recuperativa);
        }
        else if(promedio >=4 && promedio <= 5.5) {
            System.out.println("Debes rendir el examen final para aprobar");
            //Calcular nota necesaria en base 70-30
            float examen = (float)( (5.5 - (promedio * 0.7)) / 0.3);
            System.out.println("Necesitas un: " + examen +" para aprobar");
        }
        else if(promedio >5.5) {
            System.out.println("Aprobado.");
        }
        }
    }