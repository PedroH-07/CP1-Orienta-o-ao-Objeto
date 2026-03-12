package br.com.fiapride.model;

public class Veiculo {

    private String dono;
    private String placa;
    private double gasolina;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        if (gasolina < 0) {
            System.out.println("Não pode definir gasolina negativa.");
            return;
        }
        this.gasolina = gasolina;
    }

    public void adicionarGasolina(double valor) {
        if (valor <= 0) {
            System.out.println("Não pode adicionar um valor menor ou igual a zero.");
            return;
        }
        this.gasolina += valor;
    }

    public void gastarGasolina(double valor) {
        if (valor <= 0) {
            System.out.println("Não pode gastar um valor menor ou igual a zero.");
            return;
        }

        if (this.gasolina - valor < 0) {
            System.out.println("Operação negada: a gasolina não pode ficar negativa.");
            return;
        }

        this.gasolina -= valor;
    }
}