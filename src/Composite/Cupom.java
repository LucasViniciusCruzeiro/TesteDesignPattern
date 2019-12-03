/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.*;


/**
 *
 * @author lucasvc
 */

public class Cupom {
    List<Produto> itens = new ArrayList<>();
    public void addItem(Produto item){
        itens.add(item);
    }
    public void imprimeCupom(){
        for(Produto p:itens){
            System.out.println("Kit contem " + p.getDescricao()+", Valor "+p.getValor());
        }
    }
}
