public class invertedPatteren{
    public static void Print(int totRow){
        for(int i=0; i<totRow; i++){
            for(int j=0; j<= totRow-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] agrs){
        Print(4);
    }
}