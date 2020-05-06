package com.company;

import java.util.Scanner;

public class Main {

    static public Scanner lee = new Scanner(System.in);
    // menu del programa
    public static void Menu(){

        System.out.println("Menu:");
        System.out.println("1: Sumar dos números");
        System.out.println("2: Restar dos números");
        System.out.println("3: Multiplicar dos números");
        System.out.println("4: Dividir dos números");
        System.out.println("5: El mayor de dos números");
        System.out.println("6: Potencia de un número entero elevado a otro número entero");
        System.out.println("7: Salir del programa");

    }
    // metodo suma de dos numeros
    public static void Suma(){
        float nroUno, nroDos; //numeros a ingresar
        System.out.println("Ingrese número uno");
        nroUno = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Ingrese número dos");
        nroDos = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Resultado: " + (nroUno + nroDos)); //print resultado
    }
    // metodo resta de dos numeros
    public static void Resta(){
        float nroUno, nroDos; //numeros a ingresar
        System.out.println("Ingrese número uno");
        nroUno = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Ingrese número que restara a uno");
        nroDos = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Resultado: " + (nroUno - nroDos)); //print resultado
    }
    // metodo de multiplicacion de dos numeros
    public static void Multiplicacion(){
        float nroUno, nroDos; //numeros a ingresar
        System.out.println("Ingrese número uno a multiplicar");
        nroUno = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Ingrese número dos a multiplicar");
        nroDos = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Resultado: " + (nroUno * nroDos)); //print resultado
    }
    //metodo de division de dos numeros
    public static void Division(){
        float nroUno, nroDos; //numeros a ingresar
        System.out.println("Ingrese número dividendo");
        nroUno = lectorFloat(); //ingreso a travez de metodo lectorFloat
        do{
            System.out.println("Ingrese número divisor distinto de 0");
            nroDos = lectorFloat(); //ingreso a travez de metodo lectorFloat
        }while (nroDos == 0); // validar el distinto de 0

        System.out.println("Resultado: " + (nroUno / nroDos)); // print resultado
    }
    //metodo para determinar el mayor de dos numeros
    public static void MayorMenor(){
        float nroUno, nroDos; //numeros a ingresar
        System.out.println("Ingrese número uno");
        nroUno = lectorFloat(); //ingreso a travez de metodo lectorFloat
        System.out.println("Ingrese número dos");
        nroDos = lectorFloat(); //ingreso a travez de metodo lectorFloat
        if(nroUno >= nroDos){
            System.out.println("Resultado: " + nroUno + " es mayor"); // print numero uno mayor o igual a dos
        }
        else{
            System.out.println("Resultado: " + nroDos + " es mayor"); // print numero dos mayor a dos
        }
    }
    //metodo para determinar potencia de un numero sobre otro
    public static void Potencia(){
        int seleccion = 2;  //contador para ingresar a lectorInt de forma correcta
        int base, exponente; //numeros enteros a ingresar
        double resultado;
        System.out.println("Ingrese base ");
        base = lectorInt(seleccion); // ingreso a travez de metodo lectorInt
        System.out.println("Ingrese exponente ");
        exponente = lectorInt(seleccion); // ingreso a travez de metodo lectorInt
        resultado = (Math.pow(base, exponente)); // resultado de la potencia
        System.out.println("Resultado: " + resultado); // print resultado

    }
    public static void Salir(){
        int seleccion = 3; //contador para ingresar a lectorInt de forma correcta
        int opcionSalir; // opcion para salir del programa
        System.out.println("¿Deseas salir?");
        System.out.println("1: si");
        System.out.println("2: no");
        opcionSalir = lectorInt(seleccion);
        if(opcionSalir == 2 && opcionSalir != 1){ //determina la opcion elegida
            Menu();
            Opcion();
        }
        else{
        }
    }

    public static void Opcion(){
        int seleccion = 1; //contador para ingresar a lectorInt de forma correcta
        int nroMenu; // opcion para menu
        nroMenu = lectorInt(seleccion); //ingreso a travez de metodo lectorInt
        switch(nroMenu){
            case 1:
                Suma();
                Menu();
                Opcion();
                break;
            case 2:
                Resta();
                Menu();
                Opcion();
                break;
            case 3:
                Multiplicacion();
                Menu();
                Opcion();
                break;
            case 4:
                Division();
                Menu();
                Opcion();
                break;
            case 5:
                MayorMenor();
                Menu();
                Opcion();
                break;
            case 6:
                Potencia();
                Menu();
                Opcion();
                break;
            case 7:
                Salir();
                break;

        }
    }
    //Verificador de datos float ingresador por el usuario
    public static float lectorFloat(){
        float nroFloat=0;
        boolean repetidor = true; // repetidor ayuda a mantener el programa en una tombola hasta elegir opción correcta
        while(repetidor) {
            try {
                nroFloat = lee.nextFloat(); //ingreso usuario
                repetidor = false;
            } catch (Exception e) { //error por Exception
                System.out.println("Ingrese una opción válida");
                lee.next();
            }
        }
        return nroFloat;
    }
    //Verificador de datos int ingresador por el usuario
    public static int lectorInt(int selecionador){ //seleccionador ayuda a elegir en cual de los diferentes casos entrara el int
        int nroInt=0;
        boolean repetir = true;
        switch (selecionador){
            case 1: // Menu de opciones
                do {
                    System.out.println("Seleccione una opción");
                    try {
                        nroInt = lee.nextInt(); //Numero ingresado por usuario
                    } catch(Exception e){ //error por Exception
                        lee.next();
                        System.out.println( "Ingresa una opcion valida");
                    }
                } while (nroInt <= 1 && nroInt >= 7);
                break;
            case 2: // Menu de Potencia
                do {
                    System.out.println("Ingresa el numero");
                    try {
                        nroInt = lee.nextInt();//Numero ingresado por usuario
                        repetir = false;
                    } catch(Exception e){ //error por Exception
                        lee.next();
                        System.out.println( "Numero no valido");
                        repetir = true;
                    }
                } while (repetir == true);
                break;
            case 3: //Menu de salida
                do {

                    System.out.println("Seleccione una opción");
                    try {
                        nroInt = lee.nextInt();//Numero ingresado por usuario
                    } catch(Exception e){ //error por Exception
                        lee.next();
                        System.out.println( "Ingrese una opción valida");

                    }
                } while (nroInt != 1 && nroInt !=2);
                break;

        }
        return nroInt; //retorna numero valido
    }

    public static void main(String[] args) {
        Menu();
        Opcion();
    }
}
