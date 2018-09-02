/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persicistencia;

import Bean.Programador;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class CRUD {
    
    LinkedList<Programador> LinkedListGallinas = new LinkedList<>();
    RandomAccessFile file;
    RandomAccessFile fileR;
    

    public CRUD() throws IOException {
        this.file = new RandomAccessFile("crud.txt","rw");
        this.fileR = new RandomAccessFile("crud.txt","r");
    }
    public void terminar() throws IOException{
        file.close();
        fileR.close();
    }
    public void escribir(Programador programador) throws IOException{
        
        file.writeChars(programador.getId()+" ");
        file.writeChars(programador.getLenguaje()+" ");
        file.writeChars(programador.getComputadora().getProcesador()+" ");
        file.writeChars(programador.getComputadora().getTamaño()+" ");
        file.writeChars(programador.getComputadora().getColor()+" ");
        file.writeChars(programador.getComputadora().getRam()+"\n");
        
        
        //file.close();
        
    }
    
    
    public void leer() throws FileNotFoundException, IOException{
        boolean dentro = true;
        boolean dentro_aux = true;
        fileR.seek(0);
        
        try{
           
            int a = 0;

            while(a!=-1){
                a = fileR.read();
                char letra = (char)a;
                
                if (dentro) {
                    System.out.print(letra);
                    if (a == 61) {
                    
                    dentro = false;
                    }
                }else{
                    if(a != 0){
                        //if (a != 61) {
                            if (a == (48)){
                                dentro_aux = false;
                            }else{
                                if (dentro_aux || a == 61) {
                                    System.out.print(letra);
                                    dentro = true;
                                    dentro_aux = true;
                                }
                            }        
                        //}               
                    }
                }
            }
        }catch(FileNotFoundException ex){  
        }catch(IOException es){  
        }finally{ 
            
            //fileR.close();
            //fileR.reset();
        }
    }
    
    public void actualizar(Programador programador) throws IOException{
        boolean dentro = true;
        String aux = programador.getId();
        int id_aux = Integer.parseInt(aux);
        System.out.println(id_aux);
        file.seek(0); 
        try{
           
            int a = 0;

            while(a!=-1){
                a = file.read();
                
                if (dentro) {
                    System.out.println(a);
                    if (a == 61) {
                    System.out.println("dentro");
                    dentro = false;
                    }
                }else{
                    if(a != 0){
                        if (a == (id_aux+48)){
                       
                        System.out.println(id_aux+48);
                        System.out.println("encontrado");
                        
                        //file.writeChars(programador.getId()+" ");
                        file.writeChars(programador.getLenguaje()+" ");
                        file.writeChars(programador.getComputadora().getProcesador()+" ");
                        file.writeChars(programador.getComputadora().getTamaño()+" ");
                        file.writeChars(programador.getComputadora().getColor()+" ");
                        file.writeChars(programador.getComputadora().getRam()+"\n");
                        
                        dentro = true;
                        
                        }else{
                            dentro = true;
                        }                       
                    }
                } 
            }
        }catch(FileNotFoundException ex){  
        }catch(IOException es){  
        }finally{ 
           
        }
    }
    
    public void eliminar(String id_eliminar) throws IOException{
        boolean dentro = true;
        //String aux = programador.getId();
        int id_aux = Integer.parseInt(id_eliminar);
        
        file.seek(0); 
        try{
           
            int a = 0;

            while(a!=-1){
                a = file.read();
                
                if (dentro) {
                    
                    if (a == 61) {
                    
                    dentro = false;
                    }
                }else{
                    if(a != 0){
                        if (a == (id_aux+48)){
                        file.seek(file.getFilePointer()-1);
                        file.writeChars("0"+" "); 
                        dentro = true;
                        
                        }else{
                            dentro = true;
                        }                       
                    }
                } 
            }
        }catch(FileNotFoundException ex){  
        }catch(IOException es){  
        }finally{ 
           
        }
    }
    
}
