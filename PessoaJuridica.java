package com.company;

public class PessoaJuridica extends Contribuinte {

private double imposto;

    private void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double getImposto(){
        return this.imposto;
    }

    public void calculaImposto() {
        this.setImposto((this.getRendaBruta() * 0.1));
    }
}

