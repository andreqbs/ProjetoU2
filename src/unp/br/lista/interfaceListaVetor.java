/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unp.br.lista;

/**
 *
 * @author andreqbs
 */
public interface interfaceListaVetor {

    void criarLista(int tamanho); //cria lista com tamanho    
    NoVetor[] aumentarLista(); //dobra o tamanho da lista atual
    boolean eVazia();  //verifica se a lista possui elementos   
    boolean eCheia(); //verfica se a lista está cheia
    int tamanho();  //retorna o número de itens da lista   '
    int capacidade();  //retorna a capacidade de itens possiveis na lista   
    boolean procurarElemento(int valor); //verifica se o elemento está na lista
    NoVetor pegarElemento(int indice);  //retorna um determinado nó  de um determinado indice    
    void addNoInicio(int valor);  //insere um novo nó no inicio da lista    
    void addNoFim(int valor);  //insere um novo nó no fim da lista
    void addNaPosicao(int indice, int valor);  //insere um novo nó em uma posição desejada, caso ela esteja disponivel   
    void removerNoInicio(int valor);  //remove um novo nó do inicio da lista 
    void removerNoFim(int valor);  //remove um novo nó do fim da lista  
    void remover(int indice);  //remove o nó de uma posição desejada    
    void listar();  //retorna os valores da lista

}
