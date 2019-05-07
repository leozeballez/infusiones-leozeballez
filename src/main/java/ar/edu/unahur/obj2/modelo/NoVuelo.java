package ar.edu.unahur.obj2.modelo;

public class NoVuelo implements Volable {

    @Override
    public void volar() {
        System.out.println("No vuelo");
    }
}
