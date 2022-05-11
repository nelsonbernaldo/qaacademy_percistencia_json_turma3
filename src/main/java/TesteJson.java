import com.google.gson.Gson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TesteJson {
    static Map<String, String> dadosTeste = new HashMap<>();
    static Gson gson = new Gson();
    static Reader reader;


    public static void main(String[] args) throws IOException {
        leituraJson();
        escritaJson();


    }

    public static void leituraJson() throws FileNotFoundException {
        reader = new FileReader("src/main/resources/MassaTesteJson.json");
        dadosTeste = gson.fromJson(reader, Map.class);

        System.out.println(dadosTeste.get("url"));
        System.out.println(dadosTeste.get("produto"));
        System.out.println(dadosTeste.get("valor"));


    }

    public static void escritaJson() throws IOException {
        dadosTeste.put("email", "teste@teste.com.br");
        dadosTeste.put("senha", "teste123");

        FileWriter fileWriter = new FileWriter("src/main/resources/CopiaMassaTesteJson.json");
        gson.toJson(dadosTeste, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }
}
