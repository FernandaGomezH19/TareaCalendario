package com.petShop.mascota;

public class Mascota {

    private String nombreM;
    private String tipoM;
    private double pago;

    public Mascota(String nombreM, String tipoM) {
        this.nombreM = nombreM;
        this.tipoM = tipoM;
        this.pago = 0;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double pago (){
        double pago = 0;
    //operador ternario
        pago= (getTipoM() == "perro") ? 3500 : 4500;
        return pago;
    }
}
