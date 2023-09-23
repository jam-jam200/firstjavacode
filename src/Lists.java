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
        System.out.println(fruits.get(3));
    }
}
