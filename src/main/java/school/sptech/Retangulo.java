package school.sptech;

public class Retangulo extends Figura {
    private Double base;
    private Double altura;

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString(){
        return toString();
    };

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
