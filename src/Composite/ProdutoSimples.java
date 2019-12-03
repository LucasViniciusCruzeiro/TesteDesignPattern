/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import Factory.*;
/**
 *
 * @author PPO-USER
 */
public class ProdutoSimples implements Produto{
    private String descricao;
    private Double valor;
    
    public ProdutoSimples(String descricao, Double valor){
        this.descricao = descricao;
        this.valor = valor;
    }
    
    @Override
    public String getDescricao(){
        return descricao;
    }
    @Override
    public Double getValor(){
        return valor;
    }
}
