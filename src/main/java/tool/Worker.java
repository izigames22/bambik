package tool;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    static List <Tool> tools = new ArrayList<>();
    static String[] tablica;
    public static void main(String[] args) {
        Tool tool = new Tool("Pomalutku powolutku");
        tools.add(new Tool("Siekiera"));
        tools.add(new Tool("Klucz"));
        tools.add(new Tool("Piła"));
        tools.add(tool);

        for (Tool t: tools)
            t.useTool();
    }
}