package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar (Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        double soma = 0.0;
        for(Figura f : figuras){
            soma += f.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List maior20 = new ArrayList();
        for(Figura f : figuras){
            if (f.calcularArea() > 20){
                maior20.add(f);
            }
        }
        return maior20;
    }

    public List<Figura> buscarQuadrados(){
        List quadrados = new ArrayList<>();
        for(Figura f : figuras){
            if (f instanceof Quadrado){
                quadrados.add(f);
            }
        }
        return quadrados;
    }
}
