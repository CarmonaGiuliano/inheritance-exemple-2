package com.company;

class PessoaFisica extends Contribuinte{

    private double imposto;

    private void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double getImposto(){
        return this.imposto;
    }

    public void calculaImposto() {
        if (getRendaBruta() > 0 && getRendaBruta() <= 1400) {
            this.setImposto(0);
        } else if (getRendaBruta() > 1400 && getRendaBruta() <= 2100) {
            this.setImposto((getRendaBruta() * 0.1) - 100);
        } else if (getRendaBruta() > 2100 && getRendaBruta() <= 2800) {
            this.setImposto((getRendaBruta() * 0.15) - 270);
        } else if (getRendaBruta() > 2800 && getRendaBruta() <= 3600) {
            this.setImposto((getRendaBruta() * 0.25) - 500);
        } else {
            this.setImposto((getRendaBruta() * 0.3) - 700);
        }
    }
}