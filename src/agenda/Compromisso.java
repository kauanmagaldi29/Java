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

import java.util.ArrayList;
import java.util.Date;

    public class Compromisso {
        
        private String titulo;
        private String descricao;
        private Date dataHoraInicio;
        private Date dataHoraFim;
    
        public ArrayList<Notificacao> notificacao = new ArrayList<>();
        
    public Compromisso() {

    }
    public Compromisso(String titulo, String descricao, Date dataHoraInicio, Date dataHoraFim) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }
    public Compromisso(String titulo, Date dataHoraInicio) {
        this.titulo = titulo;
        this.dataHoraInicio = dataHoraInicio;
    }   
    public Compromisso(String titulo, String descricao, Date dataHoraInicio, Date dataHoraFim, Notificacao notific) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.notificacao.add(notific);
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Date getHoraInicio() {
        return dataHoraInicio;
    }
    public void setHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }
    
    public Date getHoraFim() {
        return dataHoraFim;
    }
    public void setHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
    
    public ArrayList<Notificacao> getNotificacao() {
        return notificacao;
    }
    public void setNotificacao(ArrayList<Notificacao> notific) {
        this.notificacao = notific;
    }
    
    @Override
    public String toString(){
       return titulo + ", " + dataHoraInicio;
    }
}