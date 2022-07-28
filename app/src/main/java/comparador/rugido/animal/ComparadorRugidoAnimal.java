package comparador.rugido.animal;

import javax.lang.model.util.ElementScanner6;

public class ComparadorRugidoAnimal {

    public String Comparar(Animal animal1, Animal animal2) {

        if (animal1.getIntensidadeRugido() == animal2.getIntensidadeRugido())
            return "empate!";

        if (animal1.getIntensidadeRugido() > animal2.getIntensidadeRugido())
            return animal1.getTipo();

        return animal2.getTipo();
    }

}
