public class loops {
    public static void main(String[] args){
        for(int i = 12; i < 20; i++){
            System.out.println(i);
            for(int j = 1; j<=10; j++){
                System.out.println("Multiplication of "+ i + " X " + j + " = " + i * j);
            }
        }
    }
}
