package com.company;

public class Acciones {
    public static void listarUsuario(String[] users) {
        if (null == users) {
            System.out.println("No hay usuarios");
            return;
        }
        for(int i = 0; i < users.length; i++) {
            if (null == users[i]) {
                continue;
            }
            System.out.println(users[i]);
        }
    }

    public static String crearUsuario() {
        String user = "";
        String plantillaTexto = "Nombre: %s\nPrimer apellido: %s\nSegundo apellido: %s\nEdad: %s\nDNI: %s";
        String nombre = Pedir.cadenaPorTeclado("Dime el nombre del usuario que intentas introducir:");
        String primerApellido = Pedir.cadenaPorTeclado("Dime el primer apellido del usuario que intentas introducir:");;
        String segundoApellido = Pedir.cadenaPorTeclado("Dime el segundo apellido del usuario que intentas introducir:");;
        int edad = Pedir.edadPorTeclado("Introduce la edad del usuario");
        String dni = Pedir.dniPorTeclado("Introduce el DNI completo con letra:");


        user = String.format(plantillaTexto,nombre,primerApellido,segundoApellido, String.valueOf(edad), dni);
        return user;
    }

    public static String[] addUser(String[] users, String user)
    {
        String nuevoArrayUsuarios[] = new String[users.length + 1];

        try {
            for (int i = 0; i < users.length; i++) {
                nuevoArrayUsuarios[i] = users[i];
            }

            nuevoArrayUsuarios[nuevoArrayUsuarios.length - 1] = user;
        } catch (ArrayIndexOutOfBoundsException arrayException) {
            System.out.println("Ocurrio un error añadiendo un usuario");
        }

        return nuevoArrayUsuarios;
    }
}
