/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author kauan.user
 */
public class Notificacao {
    
    private byte tempo;
    private String unidade;
    private char tipo;

    public Notificacao(byte tempo, String unidade, char tipo) {
        this.tempo = tempo;
        this.unidade = unidade;
        this.tipo = tipo;
    }
    
    public Notificacao() {

    }
    
    public byte getTempo() {
        return tempo;
    }
    public void setTempo(byte tempo) {
        this.tempo = tempo;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return tempo + ", " +  unidade + ", " + tipo;
    }
}
