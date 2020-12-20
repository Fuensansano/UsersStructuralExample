package com.company;

public class Validar {
    private static final int EDAD_MINIMA = 18;
    private static final int EDAD_MAXIMA = 200;
    private static final int LONGITUD_DNI = 9;
    private static final int LETRA_DNI = 8;
    private static final int PRIMER_CHAR_DE_UN_STRING = 0;

    public static boolean esMayorDeEdad(int edad) {
        if (edad < EDAD_MINIMA || edad >= EDAD_MAXIMA) {
            return false;
        }
        return true;
    }

    private static boolean letraDni(int numeroDni, char letra) {
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo= numeroDni % 23;
        char letraDni = juegoCaracteres.charAt(modulo);
        return letraDni == letra;
    }

    private static boolean longitudCorrectaDni(String dni) {
        if (dni.length() != LONGITUD_DNI) {
            return false;
        }
        return true;
    }

    private static boolean ultimoCharLetter(String dni) {
        return Character.isLetter(dni.charAt(LETRA_DNI));
    }

    public static boolean esDniValido(String dni) {
        if (!Validar.longitudCorrectaDni(dni) && !Validar.ultimoCharLetter(dni)) {
            return false;
        }
        char letraMayuscula = ((dni.substring(LETRA_DNI)).toUpperCase()).charAt(0);
        int numerosDni = Integer.parseInt(dni.substring(PRIMER_CHAR_DE_UN_STRING, LETRA_DNI));

        return Validar.letraDni(numerosDni, letraMayuscula);
    }
}
