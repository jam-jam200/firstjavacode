public class loops {
    public static void main(String[] args){
        for(int i = 0; i <= 12; i++){
            System.out.println(i);
            for(int j = 1; j<=10; j++){
                System.out.println("Multiplication of "+ i + " X " + j + " = " + i * j);
                System.out.println("Addition of "+ i + " + " + j + " = " + (i + j));
                System.out.println("Subtraction of "+ i + " - " + j + " = " + (i - j));
                System.out.println("Division of "+ i + " / " + j + " = " + i / j);
                //i'm back
            }
        }
    }
}
