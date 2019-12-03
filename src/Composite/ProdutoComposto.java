/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author PPO-USER
 */
public class ProdutoComposto implements Produto{
    private Produto produto1;
    private Produto produto2;
    private Double valor;
    
    public ProdutoComposto(Produto produto1, Produto produto2, Double valor){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.valor = valor;
    }
    
    @Override
    public String getDescricao() {
        return produto1.getDescricao() + " com " + produto2.getDescricao();
    }
    
    @Override
    public Double getValor() {
        return this.valor;
    }
    
}
