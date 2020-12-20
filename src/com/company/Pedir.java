package com.company;

import java.util.Scanner;

public class Pedir {
    public static int menuPrincipal() {
        int opcion = 0;
        String cadena = "";
        boolean continuar = true;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("+----------------------+");
            System.out.println("| 1) Agregar usuario   |");
            System.out.println("| 2) Listar usuarios   |");
            System.out.println("| 3) Salir             |");
            System.out.println("+----------------------+");
            try {
                cadena = teclado.nextLine();
                opcion = Integer.parseInt(cadena);
                continuar = false;
            } catch (NumberFormatException opcionNoValida) {
                System.out.println("Opción erronea intentelo de nuevo");
            }
        } while (continuar == true);
        return opcion;
    }

    private static String stringPorTeclado(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        return teclado.nextLine();
    }

    public static String cadenaPorTeclado(String mensaje) {
        String cadena = "";
        do {
            cadena = stringPorTeclado(mensaje);
        } while (cadena.isEmpty());
        return cadena;
    }

    public static int edadPorTeclado(String mensaje) {
        String cadena = "";
        int intPorTeclado = 0;
        boolean esEntero = false;
        do {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(mensaje);
                cadena = teclado.nextLine();
                intPorTeclado = Integer.parseInt(cadena);
                if (!Validar.esMayorDeEdad(intPorTeclado)) {
                    System.out.println("El usuario no puede ser menor de edad");
                    continue;
                }
                esEntero = true;
            } catch (NumberFormatException formatException) {
                System.out.println("El valor introducido no es un entero:");
            }

        } while (esEntero == false);
        return intPorTeclado;
    }

    public static String dniPorTeclado(String mensaje) {
        String dni = "";
        int intPorTeclado = 0;
        boolean esDniValido = false;
        do {
            dni = Pedir.cadenaPorTeclado(mensaje);
            try {
                if (Validar.esDniValido(dni)) {
                    esDniValido = true;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("El DNI tiene que ser valido");
            } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                System.out.println("El DNI es demasiado corto");
            } catch (Exception exception) {
                System.out.println("El DNI tiene que ser valido");
            }
        } while (esDniValido == false);
        return dni;
    }
}
