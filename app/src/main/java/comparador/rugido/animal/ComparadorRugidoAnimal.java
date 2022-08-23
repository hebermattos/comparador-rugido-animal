package comparador.rugido.animal;

public class ComparadorRugidoAnimal {

    public String Comparar(Animal animal1, Animal animal2) {

        if (animal1.getIntensidadeRugido() == animal2.getIntensidadeRugido())
            return "empate!";

        if (animal1.getIntensidadeRugido() > animal2.getIntensidadeRugido())
            return animal1.getTipo();

        return animal2.getTipo();
    }

}
