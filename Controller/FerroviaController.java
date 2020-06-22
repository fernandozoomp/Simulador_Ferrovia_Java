/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ferrovia;

/**
 *
 * @author Leandro
 */
public class FerroviaController {
    
    Ferrovia f;
    
    public FerroviaController(Ferrovia f){
        this.f = f;
        
        System.out.println("Controller: Ferrovia criada!");
    }

    public Ferrovia getFerrovia() {
        return f;
    }

    public void setFerrovia(Ferrovia f) {
        this.f = f;
    }
    
    
        
}
