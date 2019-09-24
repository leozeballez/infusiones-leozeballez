package ar.edu.unahur.obj2;

public abstract class Infusion implements QueHacerConAgua {
    private int temperaturaAgua;
    private double tiempoInfusion;
    private boolean azucar;
    private boolean leche;

    public Infusion(int temperaturaAgua, double tiempoInfusion) {
        this.temperaturaAgua = temperaturaAgua;
        this.tiempoInfusion = tiempoInfusion;
        this.azucar = false;
        this.leche = false;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public void setTiempoInfusion(double tiempoInfusion) {
        this.tiempoInfusion = tiempoInfusion;
    }

    public boolean getAzucar() {
        return azucar;
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }

    public boolean getLeche() {
        return leche;
    }

    public void setLeche(boolean leche) {
        this.leche = leche;
    }

    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public double getTiempoInfusion() {
        return tiempoInfusion;
    }
}
