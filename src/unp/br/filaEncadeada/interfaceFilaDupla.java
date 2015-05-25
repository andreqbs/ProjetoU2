/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unp.br.filaEncadeada;

/**
 *
 * @author andreqbs
 */
public interface interfaceFilaDupla {
    void criarFila(); //cria fila    
    boolean eCheia();  //verifica se a fila estar cheia     
    boolean eVazia();  //verifica se a fila possui elementos     
    int tamanho();  //retorna o número de itens da fila      
    NoEncadeadoDuplo addInicio(int valor);  //insere um valor no início  da fila     
    NoEncadeadoDuplo addFim(int valor);  //insere um valor no fim da fila     
    NoEncadeadoDuplo removeInicio();  //retira o nó do início da fila     
    NoEncadeadoDuplo removeFim();  //retira o nó do fim da fila  
    int pegarInicio();  //retorna o valor atual do início da fila     
    void listar();  //retorna os valores da fila  
    
}
