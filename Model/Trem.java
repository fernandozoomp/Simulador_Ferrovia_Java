/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FERNANDO C
 */
public class Trem {
    private String nome;
    private int trecho; // de 0 a 100
    private double velocidade;
    
    public Trem(String nome, int trecho, double velocidade){
        this.nome = nome;
        this.trecho = trecho;
        this.velocidade = velocidade;
        
        System.out.println("Modelo: Trem criado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getTrecho() {
        return trecho;
    }

    public void setTrecho(int trecho) {
        this.trecho = trecho;
    }
    
}
