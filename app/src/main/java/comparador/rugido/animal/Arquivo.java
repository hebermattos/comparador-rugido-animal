package comparador.rugido.animal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arquivo {


    public ArrayList<String> buscarVencedores() throws FileNotFoundException  {

        ArrayList<String> listaVencedores = new ArrayList<>();

        File myObj = new File("animais-vencedores.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          listaVencedores.add(data);
        }
        
        myReader.close();

        return listaVencedores;
    }

    public void salvarVencedor(String animalVencendor) throws IOException {
        FileWriter myWriter = new FileWriter("animais-vencedores.txt", true);
        myWriter.write(animalVencendor);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.close();
    }

}
