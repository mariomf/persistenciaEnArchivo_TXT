/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Interface.IPersona;

/**
 *
 * @author mario
 */
public class Programador implements IPersona{

    private String id;
    private HP computadora;
    private String lenguaje;

    
    
    public void Programador(){}
    public Programador(String id, HP computadora, String lenguaje){
        this.id = id;
        this.lenguaje = lenguaje;
        this.computadora = computadora;  
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
   
    /**
     * @return the computadora
     */
    public HP getComputadora() {
        return computadora;
    }

    /**
     * @param computadora the computadora to set
     */
    public void setComputadora(HP computadora) {
        this.computadora = computadora;
    }

    /**
     * @return the lenguaje
     */
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * @param lenguaje the lenguaje to set
     */
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
   
    //*******Metodo de la interfaz "Persona"
    @Override
    public void Escribir() {
        
    }
}
