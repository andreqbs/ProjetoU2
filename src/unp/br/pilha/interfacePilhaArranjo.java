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
public interface interfacePilhaArranjo {
    
    void criarPilha(int tamanho);
    boolean eVazia (); //verificar se está vazia a pilha
    boolean eCheia (); //verificar se está vazia a pilha
    int tamanho(); //retorna o número de itens da pilha 
    No push(int valor); //insere um valor no topo da pilha
    No pop(); //retira o valor no topo da pilha
    int pegarTopo(); //retorna o valor atual do topo da pilha
     
}
