package comparador.rugido.animal.repositorio;

import java.util.ArrayList;

public interface IRepositorioVencedores {

    public ArrayList<String> buscarVencedores(); 
    public void salvarVencedor(String animalVencendor); 

}
