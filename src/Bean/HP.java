/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Abstract.Compu;

/**
 *
 * @author mario
 */
public class HP extends Compu{

    private String procesador;
    private int tamaño;
   
    public HP(String color, int Ram, String procesador, int tamaño){
        super(color, Ram);
        this.procesador = procesador;
        this.tamaño = tamaño;
    }
    
    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void imprimir(){
        
    }

    @Override
    public void AbrirPrograma() {
        
    }
    
}
