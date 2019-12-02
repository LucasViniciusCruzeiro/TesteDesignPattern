/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Template.BordaCheedar;
import Template.Template;
import Factory.*;
import Composite.*;
/**
 *
 * @author PPO-USER
 */
public class TesteDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Factory
        Opcao op = new Opcao();
        Pizza p = op.CriaPizza("calabresa");
        p.sabor();
        System.out.println("");
        //Template
        Template opcao = new BordaCheedar();
        opcao.ordem();
        System.out.println("");
        //Composite
        Produto pizza = new ProdutoSimples("pizza sabor", 40.0);
        Produto coca = new ProdutoSimples("Coca",8.0);
        Produto kit = new ProdutoComposto(pizza,coca,47.0);
        Cupom cupom = new Cupom();
        cupom.addItem(kit);
        cupom.imprimeCupom();
    }
    
}
