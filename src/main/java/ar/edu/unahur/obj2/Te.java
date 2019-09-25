package ar.edu.unahur.obj2;

public abstract class Te extends Infusion {

    @Override
    public void preparar() {
        System.out.println("Agregar las hojas de te al agua caliente.");
    }

    @Override
    public void agregarAdicionales() {
        System.out.println("Agregar azucar, leche/limon adicionalmente.");

    }
}
