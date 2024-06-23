import desafio_evaluado15.*;
import desafio_evaluado18.CrearArchivo;
import dia_14.*;
import dia_15.*;
import dia_16.*;
import dia_17.CrearDirectorio;
import dia_17.crearFile;
import dia_8.*;
import desafio_guiado9.*;
import dia_10.*;
import desafio_evaluado12.*;
import dia_13.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainChoice;
        int subChoice;

        do {
            System.out.println("Seleccione una categoría: ");
            System.out.println("1. Operaciones en ciclos While, do While.");
            System.out.println("2. Operaciones en bucle y bucles anidados.");
            System.out.println("3. Operaciones en arrays");
            System.out.println("4. Operaciones en cálculos y métodos con arrays");
            System.out.println("5. Operaciones en matriz y arrays");
            System.out.println("6. Operaciones en secuencias e interfaces");
            System.out.println("7. Ciclos, contadores y sumatorias");
            System.out.println("8. Arreglos y archivos");

            //Salir
            System.out.println("0. Salir");

            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                //Opción 1. Ciclos While, do While
                case 1:
                    do {
                        System.out.println("Seleccione una opción en Ciclos While, do While: ");
                        System.out.println("1. Cambiar While");
                        System.out.println("2. OnlyEvenZero");
                        System.out.println("3. OnlyEven");
                        System.out.println("4. SumaImpar");
                        System.out.println("5. SumarImparRango");
                        System.out.println("6. Fibonacci");
                        System.out.println("0. Volver al menú principal");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            //Ciclos While, do While
                            case 1:
                                CambiarWhile obj1 = new CambiarWhile();
                                obj1.CambiarDoWhile();
                                break;
                            case 2:
                                OnlyEvenZero obj2 = new OnlyEvenZero();
                                obj2.OnlyEvenZero(sc);
                                break;
                            case 3:
                                OnlyEven obj3 = new OnlyEven();
                                obj3.OnlyEven(sc);
                                break;
                            case 4:
                                SumaImpar obj4 = new SumaImpar();
                                obj4.SumaImpar(sc);
                                break;
                            case 5:
                                SumarImparRango obj5 = new SumarImparRango();
                                obj5.SumarImparRango(sc);
                                break;
                            case 6:
                                Fibonacci obj6 = new Fibonacci();
                                obj6.Fibonacci(sc);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (subChoice != 0);
                    break;

                //Bucles
                case 2:
                    do {
                        System.out.println("Seleccione una opción en bucles.");
                        System.out.println("1. Tables");
                        System.out.println("2. Stars");
                        System.out.println("3. PatternsGF");
                        System.out.println("4. NestedPatternsGF");
                        System.out.println("5. Blah");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            case 1:
                                Tables obj7 = new Tables();
                                obj7.showTables();
                                break;


                            case 2:

                                Stars obj8 = new Stars();
                                obj8.Stars(sc);
                                break;


                            case 3:
                                PatternsGF obj9 = new PatternsGF();
                                obj9.PatternsGF(sc);
                                break;


                            case 4:
                                NestedPatternGF obj10 = new NestedPatternGF();
                                obj10.NestedPatternGf(sc);
                                break;


                            case 5:
                                Blah obj11 = new Blah();
                                obj11.Blah();
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (subChoice != 0);
                    break;

                //Arrays simples
                case 3:
                    do {
                        System.out.println("Seleccione una opción en arrays simples");
                        System.out.println("1. ArregloPizza");
                        System.out.println("2. ArregloSuma");
                        System.out.println("3. AgregarPar");
                        System.out.println("4. Métodos");
                        System.out.println("5. ListaPlatos");
                        System.out.println("0. Volver al menú principal");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            case 1:
                                ArregloPizza obj12 = new ArregloPizza();
                                obj12.ArregloPizza(sc);
                                break;

                            case 2:
                                ArregloSuma obj13 = new ArregloSuma();
                                obj13.ArregloSuma();
                                break;

                            case 3:
                                AgregarPar obj14 = new AgregarPar();
                                obj14.AgregarPar();
                                break;

                            case 4:
                                Metodos obj15 = new Metodos();
                                obj15.Metodos(sc);
                                break;

                            case 5:
                                ListaPlatos obj16 = new ListaPlatos();
                                obj16.ListaPlatos(sc);
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (subChoice != 0);
                    break;

                case 4:
                    do {
                        System.out.println("Seleccione una opción en cálculos y métodos con arrays");
                        System.out.println("1. ArraysIntro");
                        System.out.println("2. ArregloCocina");
                        System.out.println("3. Promedio notas, nota mínima, nota máxima");
                        System.out.println("4. BuscarDestruir");
                        System.out.println("5. VisitasGF");
                        System.out.println("6. SmartWatch");
                        System.out.println("7. MultiplosDeTres");
                        System.out.println("0. Volver al menú principal");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            case 1:
                                ArraysIntro obj19 = new ArraysIntro();
                                obj19.ArraysIntro();
                                break;

                            case 2:
                                ArregloCocina obj20 = new ArregloCocina();
                                obj20.ArregloCocina(sc);
                                break;

                            case 3:
                                Indice obj21 = new Indice();
                                obj21.Indice();
                                break;

                            case 4:
                                BuscarDestruir obj22 = new BuscarDestruir();
                                obj22.BuscarDestruir(sc);
                                break;

                            case 5:
                                VisitasGF obj23 = new VisitasGF();
                                obj23.promedio();
                                break;

                            case 6:
                                SmartWatch obj24 = new SmartWatch();
                                obj24.SmartWatch();
                                break;

                            case 7:
                                MultiplosDeTres obj25 = new MultiplosDeTres();
                                obj25.MultiplosDeTres();
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opción no valida");
                        }
                    } while (subChoice != 0);
                    break;

                case 5:
                    do {
                        System.out.println("Seleccione una opción en matriz e interfaces");
                        System.out.println("1. Iterando");
                        System.out.println("2. Arreglo Bidimensional");
                        System.out.println("0. Volver al menú principal");

                        subChoice = sc.nextInt();
                        sc.nextLine();
                        switch (subChoice) {
                            case 1:
                                Iterando obj17 = new Iterando();
                                obj17.Iterando();
                                break;

                            case 2:
                                ArregloBidimensional obj18 = new ArregloBidimensional();
                                obj18.ArregloBidimensional();
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (subChoice != 0);
                    break;

                case 6:
                    do {
                        System.out.println("Seleccione una opción en secuencias");
                        System.out.println("1. Secuencias");
                        System.out.println("2. Secuencias String");
                        System.out.println("0. Volver al menú principal");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            case 1:
                                Secuencias obj26 = new Secuencias();
                                obj26.Secuencias();
                                break;

                            case 2:
                                SecuenciasString obj27 = new SecuenciasString();
                                obj27.SecuenciasString();
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (subChoice != 0);
                    break;

                case 7:
                    do {
                        System.out.println("Seleccione un ciclo, contador o sumatoria a ejecutar:");
                        System.out.println("1. Operaciones matemáticas básicas");
                        System.out.println("2. Cuenta regresiva");
                        System.out.println("3. Sumar pares hasta n");
                        System.out.println("4. Sumar pares haste n, n es solo par");
                        System.out.println("5. Sumar todos los naturales");
                        System.out.println("0. Volver al menú principal");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            case 1:
                                EjercicioCiclos obj28 = new EjercicioCiclos();
                                obj28.EjercicioCiclos(sc);
                                break;

                            case 2:
                                EjercicioContador obj29 = new EjercicioContador();
                                obj29.EjercicioContador(sc);
                                break;

                            case 3:
                                SumarPares obj30 = new SumarPares();
                                obj30.SumarPares(sc);
                                break;

                            case 4:
                                SumarSoloPar obj31 = new SumarSoloPar();
                                obj31.printEvenNumbers(sc);

                            case 5:
                                Sumatoria obj32 = new Sumatoria();
                                obj32.Sumatoria(sc);
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (subChoice != 0);
                break;

                case 8:
                    do {
                        System.out.println("1. Crear directorio");
                        System.out.println("2. Crear archivo");
                        System.out.println("3. Desafío evaluado día 18");
                        System.out.println("0. Volver al inicio");

                        subChoice = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice) {
                            case 1:
                                CrearDirectorio cd = new CrearDirectorio();
                                System.out.println("Ingrese el nombre del directorio a crear: ");
                                String dirName = sc.nextLine();
                                cd.crearDirectorio(dirName);
                                break;

                            case 2:
                                crearFile cf = new crearFile();
                                try {
                                    cf.crearFile();
                                } catch (IOException e) {
                                    System.out.println("Error al crear el archivo: " + e.getMessage());
                                }
                                break;

                            case 3:
                                CrearArchivo cg = new CrearArchivo();

                                // Crear directorio
                                System.out.println("Introduzca el nombre del directorio");
                                String nombreDirectorio = sc.nextLine();
                                cg.newDirectory(nombreDirectorio);

                                // Crear archivo
                                System.out.println("Introduzca el nombre del archivo (con extensión, por ejemplo, texto.txt)");
                                String nombreArchivo = sc.nextLine();

                                // Contenido en ArrayList
                                ArrayList<String> contenido = new ArrayList<>();
                                contenido.add("Perro");
                                contenido.add("Gato");
                                contenido.add("Juan");
                                contenido.add("Daniel");
                                contenido.add("Juan");
                                contenido.add("Gato");
                                contenido.add("Perro");
                                contenido.add("Camila");
                                contenido.add("Daniel");
                                contenido.add("Camila");

                                cg.createNewFile(nombreDirectorio, nombreArchivo, contenido);

                                //Buscar archivo
                                //cg.comprobarArchivo(nombreDirectorio);

                                // Buscar texto con repeticiones
                                cg.buscarTexto(nombreDirectorio, nombreArchivo);
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("Opción no valida");
                        }
                    } while (subChoice != 0);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no valida");
            }
            System.out.println();
        } while (mainChoice != 0);
            sc.close();
    }
}