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
public interface InterfacePilhaEncadeada {
    void criarPilha(); //cria uma pilha
    boolean eVazia (); //verifica se está vazia a pilha
    int tamanho(); //retorna o número de elementos da pilha 
    void limpar(); //esvaziar pilha
    NoEncadeado push(int valor); //insere um valor no topo da pilha
    NoEncadeado pop(); //retira o valor no topo da pilha
    int pegarTopo(); //retorna o valor atual do topo da pilha
    void listar(); //retorna todos os valores da pilha
}
