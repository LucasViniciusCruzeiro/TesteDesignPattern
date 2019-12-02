/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author PPO-USER
 */
public class Opcao {
    public Pizza CriaPizza(String sabor){
        if(sabor.equalsIgnoreCase("Calabresa")){
            return new Calabresa();
        }else{
            return new Moda();
        }
    }
}
