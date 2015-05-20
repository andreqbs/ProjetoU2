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
public class PilhaEncadeadaPrincipal {
    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        
        pilha.criarPilha();
        pilha.push(10);
        pilha.listar();
        pilha.push(20);
        pilha.listar();
        pilha.pop();
        pilha.listar();
         pilha.pop();
        pilha.listar();
    }
    
}
