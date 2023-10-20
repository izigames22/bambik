package zoo;

import javax.xml.bind.SchemaOutputResolver;

public class Animal {

    String spiece;
    int age;
    double height;
    float weight;
    boolean isAlive;
    void feed(String food){
        System.out.println("I am eating now");
    }

    void speak() {
        System.out.println("Hello I am " + spiece);
    }
}