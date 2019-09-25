package ar.edu.unahur.obj2;

public abstract class Infusion implements PrepararInfusion, CalentarAgua, Preparar, ServirTaza, AgregarAdicionales {

    private int temperaturaAgua;
    private String tiempoInfusion;

    public String getTiempoInfusion() {
        return tiempoInfusion;
    }

    public void setTiempoInfusion(String tiempoInfusion) {
        this.tiempoInfusion = tiempoInfusion;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }

    @Override
    public void prepararInfusion() {
        calentarAgua(getTemperaturaAgua());
        preparar();
        servirTaza();
        agregarAdicionales();
    }

    @Override
    public void calentarAgua(int temperaturaDeseada) {
        System.out.println("Calentar agua a "+temperaturaDeseada+"°.");
        System.out.println("Tiempo de infusion: "+getTiempoInfusion());
    }

    @Override
    public void servirTaza() {
        System.out.println("Servir en taza.");
    }

    public abstract void preparar();
    public abstract void agregarAdicionales();
}
