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
public interface interfaceListaEncadeadaSimples {
     void criarLista(); //cria lista com tamanho     
     boolean eVazia();  //verifica se a lista possui elementos     
     int tamanho();  //retorna o número de itens da lista      
     NoEncadeadoSimples buscarElemento(int valor);  //procura e retorna por um determinado nó     
     NoEncadeadoSimples addInicio(int valor);  //insere um valor no início da lista     
     NoEncadeadoSimples addFim(int valor);  //insere um valor no fim da lista    
     NoEncadeadoSimples addDepois(int valor, int novoValor);  //insere um novo nó depois de um valor já existente na lista     
     NoEncadeadoSimples addAntes(int valor, int novoValor);  //retira o nó do fim da lista   
     NoEncadeadoSimples removeInicio(int valor);  //insere um valor no início da lista     
     NoEncadeadoSimples removeFim(int valor);  //insere um valor no fim da lista    
     NoEncadeadoSimples removeDepois(int valor, int novoValor);  //insere um novo nó depois de um valor já existente na lista     
     NoEncadeadoSimples removeAntes(int valor, int novoValor);  //retira o nó do fim da lista     
     void listar();  //retorna os valores da lista
    
}
