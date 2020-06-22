/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Trem;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Leandro
 */
public class TremController {
    
    Trem tre;
    
    public TremController(Trem tre){
        this.tre = tre;
        
        System.out.println("Controller: Trem criado!");
    }
    
    public void teste(){
        Timer timer = new Timer(true);
        timer.schedule(new TremTarefa(), 0, 1000);
    }
    
    public class TremTarefa extends TimerTask {
        @Override
        public void run() {
            tre.setTrecho(tre.getTrecho()+(int)tre.getVelocidade());
        }
    }
}
