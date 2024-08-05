package Main;
import Academia.Persona;
import Academia.Profesor;
import Academia.Estudiante;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("1", "Juan", true));
        listaEstudiantes.add(new Estudiante("2", "Andrés", true));
        listaEstudiantes.add(new Estudiante("3", "Juan", false));
        listaProfesores.add(new Profesor("4", "José", true));
        for(Profesor profesor: listaProfesores) {
            System.out.println(profesor.toString());
        }
        for(Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.toString());
        }*/
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Estudiante(1500, "1", "Juan", true));
        lista.add(new Estudiante(2000, "2", "Andrés", true));
        lista.add(new Estudiante(3500, "3", "Juan", false));
        lista.add(new Profesor("10", "José", true));

        /*
        for(Persona individuo : lista) {
            System.out.println(individuo.toString());
            */
        for(Persona individuo : lista) {
            Estudiante estudiante = (Estudiante) individuo;
            System.out.println(individuo.getClass().getSimpleName());
            System.out.println(estudiante.getDeuda());
        }
    }
}