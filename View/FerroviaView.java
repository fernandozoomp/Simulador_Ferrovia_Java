/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FerroviaController;
import Model.Trem;
import Model.Trilho;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author FERNANDO C
 */
public class FerroviaView extends JPanel {
    
    FerroviaController fc;
    
    public FerroviaView(FerroviaController fc){
        this.fc = fc;
        
        System.out.println("View: Ferrovia criada!");
    }
        
    @Override
    public void paintComponent(Graphics g){
	int tamanho = this.getWidth();
        super.paintComponent(g);
        
        for(Trilho tri: fc.getFerrovia().getTrilhos()){
            g.setColor(Color.BLACK);
            for(double i = 0; i<tamanho; i+=1){
                g.fillOval((int)i, (int) tri.getY(i), 4, 4);
            }
            
            g.setColor(Color.RED);
            for(Trem tre: tri.getTrens()){
                int trecho = tre.getTrecho();
                if(trecho > tamanho){
                    tre.setTrecho(0);
                    trecho = 0;
                }
                
                g.fillRect(trecho-10, (int) tri.getY(trecho), 20, 10);
            }
        }
        
        repaint();
    }
}
