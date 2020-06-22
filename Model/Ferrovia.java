/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class Ferrovia {
    
    ArrayList<Trilho> trilhos;
    
    public Ferrovia(){
        this.trilhos = new ArrayList();
        
        System.out.println("Modelo: Ferrovia criada!");
    }
    
    public void setTrilho(Trilho trilho) {
        this.trilhos.add(trilho);
    }
    
    public ArrayList<Trilho> getTrilhos() {
        return trilhos;
    }
}
