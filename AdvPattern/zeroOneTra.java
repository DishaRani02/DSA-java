public class zeroOneTra {
    public static void Print(int TotRow){
        int num1 = 1;
        int num2 = 0;
        for(int i=0; i<=TotRow; i++){
            for(int j=0; j<=i; j++){
                if( (j+i)%2 ==0){
                    System.out.print(num1);
                }
                else System.out.print(num2);
            }
            System.out.println();
        }
    }
    public static void main(String[] agrs){
        Print(5);
    }
}