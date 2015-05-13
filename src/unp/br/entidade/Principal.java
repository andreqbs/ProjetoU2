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
public class Principal {
    public static void main(String[] args) {
        Pilha x = new Pilha();
        x.criarPilha(10);
        x.pop();
        System.out.println(x.tamanho());
        System.out.println(x.eCheia());
        x.push(10);
        x.pop();
        //x.liberaPilha();
        x.push(10);
    }
    
}
