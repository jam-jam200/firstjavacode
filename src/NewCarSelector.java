public class NewCarSelector {
    public static void main(String[] args) {
        String[] carData = new String[5];
        carData[0] = "White";
        carData[1] = "Red";
        carData[2] = "Blue";
        carData[3] = "blue";
        carData[4] = "Purples";

        for(int i = 0; i < carData.length; i++) {
            if(carData[i].equalsIgnoreCase("Blue")) {
                System.out.println("Car color numbered " + i + " is Blue");
            }
        }
    }
}
