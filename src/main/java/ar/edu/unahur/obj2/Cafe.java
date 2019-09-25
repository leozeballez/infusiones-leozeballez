package ar.edu.unahur.obj2;

public class Cafe extends Infusion {

    public Cafe() {
        this.setTemperaturaAgua(95);
        this.setTiempoInfusion("4 minutos.");
    }

    @Override
    public void agregarAdicionales() {
        System.out.println("Agregar azucar y/o leche opcionalmente.");
    }


    @Override
    public void preparar() {
        System.out.println("Pasar el agua a presión sobre el grano de café molido.");
    }

}
