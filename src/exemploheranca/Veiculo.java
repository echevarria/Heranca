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
public class Veiculo {

    public String nome;
    private double valor;
    private double consumo;
    private boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

}
