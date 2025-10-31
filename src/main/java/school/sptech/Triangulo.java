package school.sptech;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString(){
        return toString();
    };

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}