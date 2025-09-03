public class butterfly{
    public static void Print(int totRow){
        for(int i=1; i<=totRow; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(totRow-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totRow; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(totRow-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] agrs){
        Print(4);
    }
}