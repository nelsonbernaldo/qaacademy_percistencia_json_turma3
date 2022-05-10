import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class TesteJson {
    static Map<String, String> dadosTeste = new HashMap<>();
    static Gson gson = new Gson();
    static Reader reader;


    public static void main(String[] args) throws FileNotFoundException {
        reader = new FileReader("src/main/resources/MassaTesteJson.json");
        dadosTeste = gson.fromJson(reader,Map.class);

        System.out.println(dadosTeste.get("url"));
        System.out.println(dadosTeste.get("produto"));
        System.out.println(dadosTeste.get("valor"));

    }
}
