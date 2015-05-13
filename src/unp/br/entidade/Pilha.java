/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unp.br.entidade;

/**
 *
 * @author andreqbs
 */
public class Pilha implements interfacePilhaArranjo {

    private int capacidade;
    private No pilha[];
    private int topo = -1;

    @Override
    public void criarPilha(int tamanho) {
        this.pilha = new No[tamanho];
        this.capacidade = tamanho;
    }

    @Override
    public boolean eVazia() {
        return topo < 0;
    }

    @Override
    public boolean eCheia() {
        return (this.topo + 1 == capacidade);
    }

    @Override
    public No push(int valor) {
        No elemento = new No(valor);
        if (!eCheia()) {
            this.pilha[++topo] = elemento;
            System.out.println("Elemento " + valor + " adicionado");
            return elemento;
        }
        return null;
    }

    @Override
    public No pop() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
            return null;
        } else {
            No elemento = pilha[topo];
            pilha[topo--] = null;
            System.out.println("Elemento " + elemento.getValor() + " removido");
            return elemento;
        }
    }

    @Override
    public int pegarTopo() {
        return pilha[topo].getValor();
    }

    @Override
    public int tamanho() {
        return topo + 1;
    }

}
