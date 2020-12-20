package com.company;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        int opcion = 0;
        String[] usuarios = new String[0];
        do {
            opcion = Pedir.menuPrincipal();
            switch (opcion) {
                case 1:
                    String usuario = Acciones.crearUsuario();
                    usuarios = Acciones.addUser(usuarios, usuario);
                    break;
                case 2:
                    Acciones.listarUsuario(usuarios);
                    break;
                case 3:
                    System.out.println("Gracias por su visita, adios");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción desconocida, intentelo de nuevo");
                    break;
            }
        } while (salir == false);
    }
}
