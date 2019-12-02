/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Factory.*;

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
       
    }
    
}
