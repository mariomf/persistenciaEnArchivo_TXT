/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persicistencia;

import Bean.HP;
import Bean.Programador;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import persicistencia.CRUD;


/**
 *
 * @author mario
 */
public class Persicistencia {
    
    static int contador = 0;
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
        boolean salir = true;
        int opcion;
        CRUD crud = new CRUD();
        Scanner scann = new Scanner(System.in);
        while(salir){
            menu();
            opcion = scann.nextInt();
            switch(opcion){
                case 0:
                    salir = false;
                    crud.terminar();
                    break;
                case 1:
                    String aux;
                    Programador programadorAdd = agregar();
                    crud.escribir(programadorAdd);
                    break;
                case 2:
                    crud.leer();
                    break;
                case 3:
                    Programador programadorAc = actualizar();
                    crud.actualizar(programadorAc);
                    break;
                case 4:
                    crud.eliminar(eliminar());
                    break;
            }
        }        
    }
    
    public static void menu(){
        System.out.println("Menu CRUD");
        System.out.println("1) Agregar.\n"+
                "2) Leer.\n"+
                "3) Actualizar.\n"+
                "4) Eliminar\n"+
                "0) Salir");
    }
    public static Programador agregar(){
        contador++;
        Scanner scann = new Scanner(System.in);
        Scanner scann1 = new Scanner(System.in);
        Scanner scann2 = new Scanner(System.in);
        Scanner scann3 = new Scanner(System.in);
        Scanner scann4 = new Scanner(System.in);
        
        System.out.println("Ingresa el procesador que tiene su computadora:(Ej: i7)");
        String procesador = scann.nextLine();
        
        System.out.println("Ingresa el tamaño de memoria que tiene su computadora:(Ej: 1)");
        int tamaño = scann1.nextInt();
        
        System.out.println("Ingresa el color que tiene su computadora:(Ej: Gris)");
        String color = scann2.nextLine();
        
        System.out.println("Ingresa el tamaño de memoria RAM que tiene su computadora:(Ej: 8)");
        int Ram = scann3.nextInt();
        
        System.out.println("Ingresa el lenguaje que domina el programador: (Ej: Java)");
        String lenguaje= scann4.nextLine();
       
        String id = "id="+contador;
        
        HP compu = new HP(color, Ram, procesador, tamaño);
        Programador programador = new Programador(id, compu, lenguaje);
        
        return programador;
    }
    
    public static Programador actualizar(){
        
        Scanner scann = new Scanner(System.in);
        Scanner scann1 = new Scanner(System.in);
        Scanner scann2 = new Scanner(System.in);
        Scanner scann3 = new Scanner(System.in);
        Scanner scann4 = new Scanner(System.in);
        
        System.out.println("Ingresa el id para actualizar su informacion: ");
        String id = scann.nextLine();
        
        System.out.println("Ingresa el procesador que tiene su computadora:(Ej: i7)");
        String procesador = scann.nextLine();
        
        System.out.println("Ingresa el tamaño de memoria que tiene su computadora:(Ej: 1)");
        int tamaño = scann1.nextInt();
        
        System.out.println("Ingresa el color que tiene su computadora:(Ej: Gris)");
        String color = scann2.nextLine();
        
        System.out.println("Ingresa el tamaño de memoria RAM que tiene su computadora:(Ej: 8)");
        int Ram = scann3.nextInt();
        
        System.out.println("Ingresa el lenguaje que domina el programador: (Ej: Java)");
        String lenguaje= scann4.nextLine();
        
        HP compu = new HP(color, Ram, procesador, tamaño);
        Programador programador = new Programador(id, compu, lenguaje);
        
        return programador;
    }
    
    public static String eliminar(){
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Ingresa el id para ELIMINAR su informacion: ");
        String id = scann.nextLine();
        
        return id;
    }
    
}
