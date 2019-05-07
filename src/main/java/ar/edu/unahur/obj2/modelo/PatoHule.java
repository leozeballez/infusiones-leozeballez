package ar.edu.unahur.obj2.modelo;

public class PatoHule extends Pato {

    public PatoHule() {
        super(new NoVuelo());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato de hule");
    }

    @Override
    public void parpar() {
        System.out.println("Cuek");
    }
}
