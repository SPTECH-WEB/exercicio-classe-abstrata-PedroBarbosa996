package school.sptech;

public class Circulo extends Figura {
    private Double raio;

    @Override
    public Double calcularArea() {
        return Math.PI*(Math.pow(raio,2));
    }

    @Override
    public String toString(){
        return toString();
    };

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}