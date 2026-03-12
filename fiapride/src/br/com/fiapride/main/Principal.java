package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setDono("Carlos");
        veiculo1.setPlaca("ABC-1234");

        veiculo1.setGasolina(-10);      // bloqueia e avisa
        veiculo1.adicionarGasolina(50); 
        veiculo1.gastarGasolina(100);   // bloqueia e avisa

        System.out.println(
                "Dono: " + veiculo1.getDono() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getGasolina()
        );
    }
}
