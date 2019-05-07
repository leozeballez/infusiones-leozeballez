package ar.edu.unahur.obj2.modelo;

public class PatoCabezaNegra extends Pato {

    public PatoCabezaNegra() {
        super(new VueloConAlas());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato Cabeza Negra");
    }
}
