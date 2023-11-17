package tool;

public class Tool {
    String type = "";

    public Tool(String type) {
        this.type = type;
    }
    public void useTool() {
        System.out.println("Pole pole łyse pole " + type);
    }
}