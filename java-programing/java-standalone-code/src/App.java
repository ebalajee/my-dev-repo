import java.util.ArrayList;

public class App {
    private String name;

    private ArrayList aList = null;
    
    public App(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws Exception {
        App ob = new App("Balajee");
        System.out.println("Hello, World! "+ob.name);
    }

}
