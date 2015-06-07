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
public interface interfaceArvoreBinaria {

    NoArvore raiz(); //retorna a raiz da árvore

    NoArvore buscarItr(int valor); //retorna um nó da árvore, caso ele se encontre nela (while)

    void inserirItr(int valor); //adiciona um novo nó na árvore de forma iterativa (while)
    
    void inserirRec(int valor); //adiciona um novo nó na árvore de forma iterativa (while)

    void removerItr(int valor, char tipo); //remover um nó da árvore de forma iterativa (while)
    
    void removerRec(int valor, char tipo); //remover um nó da árvore de forma recursiva

    void preOrdemItr();  //percorre a árvore na pré-ordem de forma iterativa  (usando pilha)    

    void posOrdemItr();  //percorre a árvore na pos-ordem de forma iterativa  (usando pilha)      

    void inOrdemItr();  //percorre a árvore na em-ordem de forma iterativa  (usando pilha)   
}
