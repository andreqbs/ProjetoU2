/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unp.br.pilha;

/**
 *
 * @author andreqbs
 */
public class NoEncadeado {
    int valor;
    NoEncadeado ponteiro;

    public NoEncadeado(int valor, NoEncadeado ponteiro) {
        this.valor = valor;
        this.ponteiro = ponteiro;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEncadeado getPonteiro() {
        return ponteiro;
    }

    public void setPonteiro(NoEncadeado ponteiro) {
        this.ponteiro = ponteiro;
    }
    
    
    
}
