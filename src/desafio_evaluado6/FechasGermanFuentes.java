package desafio_evaluado6;

import java.util.Scanner;

public class FechasGermanFuentes {
    public void Fechas (){
        Scanner sc = new Scanner(System.in);
        //Solicitar fecha 1
        System.out.println("Ingrese la fecha Número Uno (DD/MM/AAAA): ");
        String fecha1String = sc.nextLine();
        int dia1 = Integer.parseInt(fecha1String.substring(0,2));
        int mes1 = Integer.parseInt(fecha1String.substring(3,5));
        int año1 = Integer.parseInt(fecha1String.substring(6));
        //Solicitar fecha 2
        System.out.println("Ingresa la fecha Número Dos (DD/MM/AAAA); ");
        String fecha2String = sc.nextLine();
        int dia2 = Integer.parseInt(fecha2String.substring(0,2));
        int mes2 = Integer.parseInt(fecha2String.substring(3,5));
        int año2 = Integer.parseInt(fecha2String.substring(6));
        //Comparar las fechas
        int resultado;
        if (año1 < año2) {
            resultado = 2;//Persona 2 es mayor
        } else if(año1 > año2) {
            resultado = 1; //Persona 1 es mayor
        } else {
            if (mes1 < mes2) {
                resultado = 2;//Persona 2 es mayor
            } else if (mes1 > mes2) {
                resultado = 1;//Persona 1 es mayo
            } else {
                if (dia1 < dia2) {
                    resultado = 2;//Persona 2 es mayor
                } else if (dia1 > dia2) {
                    resultado = 1;//Persona 1 es mayor
                }else {
                    resultado = 0;//Las personas nacieron el mismo día.
                }
            }
        }
        //Imprimir por pantalla el resultado
        if (resultado == 1) {
            System.out.println("La persona 1 es mayor");
        } else if (resultado == 2) {
            System.out.println("La persona 2 es mayor");
        } else {
            System.out.println("Ambas personas nacieron el mismo día");
        }
    }
}
