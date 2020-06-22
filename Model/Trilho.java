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
public class Trilho {
    ArrayList<Trem> trens;
    int trilho;
    double periodo;
    double amplitude;
    double deslocamento;
    
    public Trilho(int trilho, double periodo, double amplitude, double deslocamento){
        this.trens = new ArrayList();
        this.trilho = trilho;
        this.periodo = periodo;
        this.amplitude = amplitude;
        this.deslocamento = deslocamento;
        
        System.out.println("Modelo: Trilho criado!");
    }
    
    public double getY(double x){
        double y = 0;
        
        switch(trilho){
            case 1:
                y = deslocamento + amplitude * Math.cos(2.0 * Math.PI * x / periodo);
                break;
            case 2:
                y = deslocamento + amplitude * Math.sin(2.0 * Math.PI * x / periodo);
                break;
        }
        
        return y;
    }
    
    public void setTrem(Trem trem) {
        this.trens.add(trem);
    }
    
    public ArrayList<Trem> getTrens() {
        return trens;
    }

    public int getTrilho() {
        return trilho;
    }

    public void setTrilho(int trilho) {
        this.trilho = trilho;
    }
    
    public double getPeriodo() {
        return periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public double getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(double deslocamento) {
        this.deslocamento = deslocamento;
    }
    
    
}
