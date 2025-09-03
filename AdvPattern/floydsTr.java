public class floydsTr{
    public static void Print(int TotRow){
        int counter = 1;
        for(int i=1; i<=TotRow; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] agrs){
        Print(3);
    }
}