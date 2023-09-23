import java.util.ArrayList;
public class Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cucumber");
        fruits.add("Strawberry");

        int fruitSize = fruits.size();
        System.out.println("fruit size is: " + fruitSize);
        System.out.println("previous list: " + fruits);
        System.out.println(fruits.get(3));

        fruits.set(0, "Carrots");
        System.out.println("new list: " + fruits);

        fruits.remove(2);
        System.out.println("new list: " + fruits);

    }
}
