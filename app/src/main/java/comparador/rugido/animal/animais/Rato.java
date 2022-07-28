package comparador.rugido.animal.animais;

import comparador.rugido.animal.Animal;

public class Rato implements Animal {

    @Override
    public int getIntensidadeRugido() {
        return 1;
    }

    @Override
    public String getTipo() {
        return "rato";
    }

}
