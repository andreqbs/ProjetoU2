/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unp.br.fila;

/**
 *
 * @author andreqbs
 */
public class FilaVetorSimples implements interfaceFilaArranjoSimples {

    private NoVetorSimples fila[];
    private int capacidade;
    private int inicio = 0;
    private int fim = 0;

    @Override
    public void criarFila(int tamanho) {
        fila = new NoVetorSimples[tamanho];
        capacidade = tamanho;
    }

    @Override
    public boolean eCheia() {
        return fim == capacidade;
    }

    @Override
    public boolean eVazia() {
        return fim == inicio;
    }

    @Override
    public int tamanho() {
        return fim + 1;
    }

    @Override
    public NoVetorSimples enfileirar(int valor) {
        if (!eCheia()) {
            NoVetorSimples elemento = new NoVetorSimples(valor);
            fila[fim++] = elemento;
            return elemento;
        }
        System.out.println("Fila cheia");
        return null;
    }

    @Override
    public NoVetorSimples desenfileirar() {
        if (!eVazia()) {
            NoVetorSimples aux = fila[inicio];
            fila[inicio++] = null;
            return aux;
        }
        System.out.println("Fila não possui elementos");
        return null;
    }

    @Override
    public int pegarInicio() {
        if (inicio != 0 && fim != 0) {
            return fila[inicio].getValor();
        } else {
            return -1;
        }

    }

    @Override
    public void listar() {
        if (!eVazia()) {
            for (int i = inicio; i < fim; i++) {
                System.out.println(fila[i].getValor());
            }
            System.out.println("----------------------------------");
        }
    }

}
