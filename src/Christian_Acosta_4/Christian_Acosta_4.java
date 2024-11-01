/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Christian_Acosta_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author omarr
 */
public class Christian_Acosta_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opciones = 0;
        int alrevez = 0;
        int perfecto = 0;
        int primos=0;
        int votaciones=0;

        do {
            //Esto es el menu 
            System.out.print("Utilice una opcion");
            System.out.print("1. Hacer palabras alrevez");
            System.out.print("2. Los numeros perfectos");
            System.out.print("3. Numeros primos");
            System.out.print("4. Votaciones");
            System.out.print("5. Salir");

            //Lee cada opcion del Menu
            switch (opciones) {
                case 1:
                    alrevez++;
                    //Esto es para que aumente cada vez mas
                    System.out.print("Ingrese una palabra");
                    String palabra = scanner.next();
                    //Esto es para que se vuelva la palabra al reves
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        alrevez += palabra.charAt(i);
                    }
                    System.out.print("La palabra al reves es: " + alrevez);
                    break;

                case 2:
                    perfecto++;
                    //Incrementa el numero de numeros perfectos
                    System.out.print("Ingrese un numero");
                    int numero = scanner.nextInt();
                    int sumaDivision = 0;
                    for (int  i = 1; 1 < numero; i++){
                    if (numero % 1 == 0) {
                            sumaDivision += 1;
                        }
                    }
                    //Esto determina si es o no perfecto
                    if (sumaDivision == numero) {
                        System.out.print(numero + "Es un numero perfecto");
                    } else {
                        System.out.print(numero + "No es un numero perfecto");
                        break;
                    }
                    
                case 3:
                    primos++;
                    //Incrementa el numero de valores primos
                    int numAleatorio = random.nextInt(100)+1;
                    System.out.print("Numero aleatorio generado"+numAleatorio);
                    
                    //Verifica si es o no primo
                    int division = 0;
                    System.out.print("Divisores de"+numAleatorio+" son: ");
                    for (int i = 1; i <= numAleatorio; i++){
                        if (numAleatorio % 1==0);{
                    division++;
                        System.out.print(i+ " ");    
                    }
                    }
                    //El print de si es o no
                    if (division ==2){
                    System.out.print(+numAleatorio+"Es primo");}
                    else{ 
                    System.out.print(+numAleatorio+"No es un primo");}
                    break;
                    
                case 4:
                    votaciones++;
                    //Incrementa 
                     System.out.println("¿Cuántos votantes hay en el país?");
                    int votantes = scanner.nextInt();
                    int votosAzul = 0, votosRojo = 0, votosNegro = 0, votosAmarillo = 0, votosNulos = 0;

                    for (int i = 0; i < votantes; i++) {
                        System.out.println("Ingrese su voto (AZUL, ROJO, NEGRO, AMARILLO):");
                        String voto = scanner.next().toUpperCase();
                        switch (voto) {
                            case "AZUL":
                                votosAzul++;
                                break;
                            case "ROJO":
                                votosRojo++;
                                break;
                            case "NEGRO":
                                votosNegro++;
                                break;
                            case "AMARILLO":
                                votosAmarillo++;
                                break;
                            default:
                                votosNulos++;
                                break;
                        }
                    }

                    // Esto es para calcular los votos validos
                    int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                    if (votosValidos >= (0.6 * votantes)) {
                        // Determina cual es la ganadora
                        String ganadora = "Ninguna";
                        if (votosAzul > Math.max(votosRojo, Math.max(votosNegro, votosAmarillo))) {
                            ganadora = "AZUL";
                        } else if (votosRojo > Math.max(votosAzul, Math.max(votosNegro, votosAmarillo))) {
                            ganadora = "ROJO";
                        } else if (votosNegro > Math.max(votosAzul, Math.max(votosRojo, votosAmarillo))) {
                            ganadora = "NEGRO";
                        } else {
                            ganadora = "AMARILLO";
                        }
                        System.out.println("La planilla ganadora es: " + ganadora);
                    } else {
                        System.out.println("VOTACIÓN FALLIDA");
                    }
                    break;

                case 5: // Sale de las opciones
                    System.out.println("Saliendo del programa...");
                    break;

                default: //Si es otro numero que lo cierre
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opciones != 5); 
        // El contador de todas las veces utilizadas
        
        System.out.println("Conteo de opciones seleccionadas:");
        System.out.println("Palabra Alreves: " + alrevez);
        System.out.println("Número Perfecto: " + perfecto);
        System.out.println("Primos: " + primos);
        System.out.println("Votaciones: " + votaciones);
        
        scanner.close();
                        
            }

    }

