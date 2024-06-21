package dia_16;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Secuencias {
    public void Secuencias () {
        List<Integer> numeros = Arrays.asList(1, 9, 2, 10, 2, 4, 7, 4, 7, 1, 4);
        System.out.println("Array original: " + numeros);

        //Usando reduce, sumar todos los valores del array
        int suma = numeros.stream()
                .reduce(0, (a,b) ->a+b);
        System.out.println("La suma de todo el arreglo es: " + suma);

        //Usando reduce, sumar todos los valores no repetidos del array
        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numerosDistintos);
        //Operación de suma
        int sumaDistintos = numerosDistintos.stream()
                .reduce(0, (a,b) ->a+b);
        System.out.println("La suma de los números distintos es: " + sumaDistintos);

        //Convertir datos a tipo Float
        List<Float> floatList = numeros.stream()
                .map(i -> (float) i)
                .collect(Collectors.toList());
        System.out.println(floatList);

        //Filtrar todos los elementos menores a 5 sin repetir
        List<Integer> NumCinco = numeros.stream()
                .distinct()
                .filter(x -> x <= 5)
                .collect(Collectors.toList());
        System.out.println(NumCinco);

        //Usando mapToInt, sumar todos los valores del arreglo
        int sumaMTI = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Usando mapToInt, la suma es: " + sumaMTI);

        //Usando .count() contar todos los elementos menores que 5
        long count = numeros.stream()
                .filter(x -> x < 5)
                .count();
        System.out.println(count);
    }
}