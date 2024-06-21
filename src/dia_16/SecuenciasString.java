package dia_16;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class SecuenciasString {
    public void SecuenciasString () {
        List<String> nombres = Arrays.asList("Anastasia","Beatriz","Clara","Carla","Marianela","Paula","Pia");
        System.out.println(nombres);

        //Obtener todos los elementos que excedan los 5 caracteres
        List<String> nombresCinco = nombres.stream()
                .filter (name -> name.length() > 5)
                .collect(Collectors.toList());
        System.out.println(nombresCinco);

        //Usar map para transformar todos los nombres a minúsculas
        List<String> minuscula = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(minuscula);

        //Crear un arreglo con todos los nombres que comiencen con P
        List<String> PNombres = nombres.stream()
                .filter(name -> name.startsWith("P"))
                .collect(Collectors.toList());
        String [] pNombresArray = PNombres.toArray(new String[0]);
        System.out.println("Los nombres que empiezan con P son: " + Arrays.toString(pNombresArray));

        //Utilizando .count, contar los elementos que empiecen con 'A', 'B' o 'C'
        long ABCnombres = nombres.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("B") || name.startsWith("C"))
                .count();
        System.out.println(ABCnombres);

        //Utilizando .map, crear un arreglo con la cantidad de letras que tiene cada nombre
        List<Integer> letras = nombres.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(letras);
    }
}