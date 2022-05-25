/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kauan.user
 */
public class Agenda {

    public Agenda() {
        
        //array com os compromissos
        var agenda = GerarCompromissos();
        //abre a tela utilizando Lambda e Thread
        java.awt.EventQueue.invokeLater(() -> {
        new FormAgenda(agenda).setVisible(true);
        });

    }

    public static void main(String[] args) {
        var agenda = new Agenda();


        System.out.print("\n        E-Agenda\n\n");

        ArrayList<Compromisso> Compromissos = GerarCompromissos();
        
        int cont = 1;
        for (Compromisso i : Compromissos) {
            cont++;
            printarCompromisso(i);
        }

    }

    private static ArrayList<Compromisso> GerarCompromissos() {

        var agenda = new ArrayList<Compromisso>(10);
        
        for(int i = 1; i < 11; i++){
            
            agenda.add(new Compromisso(("E-Agenda - Compromisso "+i ), ("C"+i) , new Date(2021, 10, 12, 22, 45), new Date(2021, 10, 12, 23, 30)));                        
        }
        
        return agenda;
    }

    public static void printarCompromisso(Compromisso c) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("" + c.getTitulo() + " - " + c.getDescricao() + " - " + fmt.format(c.getHoraInicio()) + " - " + c.getHoraFim());
        printarNotificacoes(c);
    }

    public static void printarNotificacoes(Compromisso c) {
        for (Notificacao n : c.notificacao) {
            System.out.print(" | " + n.getTempo() + " - " + n.getUnidade() + " - " + n.getTipo());
        }
    }
}
