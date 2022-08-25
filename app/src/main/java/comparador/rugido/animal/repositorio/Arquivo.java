package comparador.rugido.animal.repositorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arquivo implements IRepositorioVencedores {


    public ArrayList<String> buscarVencedores()  {

        ArrayList<String> listaVencedores = new ArrayList<>();

        File myObj = new File("animais-vencedores.txt");
        Scanner myReader;

        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listaVencedores.add(data);
              }
              myReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return listaVencedores;
    }

    public void salvarVencedor(String animalVencendor) {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("animais-vencedores.txt", true);
            myWriter.write(animalVencendor);
            myWriter.write(System.getProperty("line.separator"));
            myWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      
    }

}
