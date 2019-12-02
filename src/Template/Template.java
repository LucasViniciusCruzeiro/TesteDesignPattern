/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;
/**
 *
 * @author PPO-USER
 */
public abstract class Template{
    
    protected abstract void borda();
    
    private void criar(){
        System.out.println("Montando pizza...");
    }
    
    private void assar(){
        System.out.println("Assando...");
    }
    
    public void ordem(){
        borda();
        criar();
        assar();
        
    }
}
