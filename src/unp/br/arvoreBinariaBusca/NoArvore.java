/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unp.br.arvoreBinariaBusca;

/**
 *
 * @author andreqbs
 */
public class NoArvore {
    private int chave;
    private NoArvore esquerda;
    private NoArvore direita;

    public NoArvore(int chave) {
        this.chave = chave  ;
        this.esquerda = null;
        this.direita = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public NoArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }
    
    
}
