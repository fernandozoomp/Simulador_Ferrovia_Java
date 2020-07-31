/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controller.FerroviaController;
import Controller.TremController;
import Model.Ferrovia;
import Model.Trem;
import Model.Trilho;
import View.FerroviaView;
import javax.swing.JFrame;

/**
 *
 * @author FERNANDO C
 */
public class Main {
    public static void main(String args[]){
        /*
        ** Ferrovia é o elemento principal, nela estão contidos os trilhos e os trens.
        */
        Ferrovia ferrovia = new Ferrovia();
        FerroviaController ferc = new FerroviaController(ferrovia);
        FerroviaView ferv = new FerroviaView(ferc);
        
        /*
        ** Trilho é o caminho que o trem percorre e estão em função de 
        ** funções trigonometricas, sendo necessario passar a id da função
        ** desejada, o periodo, a amplitude e o deslocamento vertical.
        ** Após os instanciamentos, adiciona-se os trilhos na ferrovia.
        */
        Trilho tri1 = new Trilho(1, 400, 100, 200);
        Trilho tri2 = new Trilho(2, 500, 150, 150);
        ferrovia.setTrilho(tri1);
        ferrovia.setTrilho(tri2);
        
        /*
        ** Trem é o desenho que se movimenta na tela, sendo necessario 
        ** passar o nome do trem, o trecho do trilho que ele está (de 0 a 100%)
        ** e a velocidade maxima que ele alcança.
        ** Após os instanciamentos, adiciona-se os trens nos trilhos.
        */        
        Trem tre1 = new Trem("Maria Fumaça", 0, 32);
        TremController tc1 = new TremController(tre1);
        Trem tre2 = new Trem("Zé Lombriga", 20, 20);
        TremController tc2 = new TremController(tre2);
        tri1.setTrem(tre1);
        tri2.setTrem(tre2);
                        
        JFrame janela = new JFrame("Meu primeiro frame em Java");
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(600,400);
	janela.setVisible(true);
        
        janela.add(ferv);        
        
        tc1.teste();
        tc2.teste();
    }
}
