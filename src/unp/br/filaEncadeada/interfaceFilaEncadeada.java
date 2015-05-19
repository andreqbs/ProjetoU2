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
public interface interfaceFilaEncadeada {
    void criarFila(int tamanho); //cria fila com tamanho    
    boolean eCheia();  //verifica se a fila estar cheia     
    boolean eVazia();  //verifica se a fila possui elementos     
    int tamanho();  //retorna o número de itens da fila      
    NoEncadeadoSimples enfileirar(int valor);  //insere um valor no fim da fila     
    NoEncadeadoSimples desenfileirar();  //retira o nó do início da fila     
    int pegarInicio();  //retorna o valor atual do início da fila     
    void listar();  //retorna os valores da fila  
    
}
