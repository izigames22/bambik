package zoo;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.speak();
//        dog.feed("jedzenie");
//        dog.feed("jedzenie", 2);

        Food paroowa = new Food("parówka", 50000);
        dog.feed(paroowa);

        Food trutka = new Food("trutka", 50000);
        dog.feed(trutka);

        Food marchewa = new Food("marchewka", 10000);
        dog.feed(marchewa);

        Food smaczek = new Food("smaczek", 5000);
        dog.feed(smaczek);
    }


}