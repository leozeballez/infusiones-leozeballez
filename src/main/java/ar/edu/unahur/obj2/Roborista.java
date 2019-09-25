package ar.edu.unahur.obj2;

public class Roborista implements PrepararInfusion {

    private Infusion infusion;

    public Roborista(Infusion infusion) {
        this.infusion = infusion;
    }

    public Infusion getInfusion() {
        return infusion;
    }

    public void setInfusion(Infusion infusion) {
        this.infusion = infusion;
    }


    @Override
    public void prepararInfusion() {
        infusion.prepararInfusion();
    }
}
