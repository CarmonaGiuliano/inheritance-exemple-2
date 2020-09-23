package com.company;

abstract class Contribuinte{

    private String nomeCont;
    private double rendaBruta;
    private double imposto;


    public String toString() {
        return "Contribuinte= " + this.getNomeCont() + "\n" +
                "Renda Bruta= " + this.getRendaBruta() + "\n" ;
    }

    public String getNomeCont() {
        return nomeCont;
    }

    public void setNomeCont(String nomeCont) {
        this.nomeCont = nomeCont;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract void calculaImposto();
}



