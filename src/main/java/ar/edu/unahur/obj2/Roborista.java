package ar.edu.unahur.obj2;

public class Roborista implements PrepararInfusion, AgregarAdicionales {

    private Infusion infusion;
    private int temperaturaAgua;

    public Roborista(Infusion infusion) {
        this.infusion = infusion;
        this.temperaturaAgua = 0;
    }

    public Infusion getInfusion() {
        return infusion;
    }

    public void setInfusion(Infusion infusion) {
        this.infusion = infusion;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    @Override
    public void agregarAdicionales() {

    }

    @Override
    public void prepararInfusion() {

    }
}
