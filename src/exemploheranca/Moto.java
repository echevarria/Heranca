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
public class Moto extends Veiculo {

    public boolean exigeCapacete;
    public String maneabilidade;
    public boolean travada;

    public Moto(boolean exigeCapacete, String maneabilidade) {
        this.exigeCapacete = exigeCapacete;
        this.maneabilidade = maneabilidade;
        this.travada = true;
    }
    
    public void travar() {
        travada = true;
    }

    public void destravar() {
        travada = false;
    }

}
