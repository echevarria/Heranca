/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;

/**
 *
 * @author Avell B155 MAX
 */
public class ExemploHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Aqui instanciamos um objeto da classe Carro que estende a classe Veiculo
        Carro onix = new Carro();
        
        // Aqui instanciamos um objeto da classe Moto que estende a classe Veiculo
        Moto honda125 = new Moto(true, "Boa");
        
        // Aqui destravamos a Moto porque na incialização ela é travada
        honda125.destravar();
        
        // Aqui chamamos o método de ligar a Moto
        honda125.ligar();
        
        // Aqui chamamos o método de ligar o Carro
        onix.ligar();
        
        // Aqui fazemos o Carro andar na marcha ré
        onix.marchaRe();
        
    }
    
}
