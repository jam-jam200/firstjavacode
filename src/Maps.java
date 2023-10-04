import java.util.Map;
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        Map colorPaint = new HashMap();
        //the one in "" is the key while the one outside is the value
        colorPaint.put("Blue", 2);
        colorPaint.put("Purple", 3);
        colorPaint.put("Pink", 5);
        colorPaint.put("Yellow", 7);
        colorPaint.put("Green", 1);
        colorPaint.put("White", 4);

        colorPaint.remove("Pink"); //removing an element from the map


        System.out.println(colorPaint.size()); //size of map
        System.out.println(colorPaint.get("Yellow")); //searching map
    }
}
