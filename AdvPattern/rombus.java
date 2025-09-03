public class rombus {
    public static void Print(int num){
        for(int i=1; i<=num; i++){
            int space = num-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Print(5);
    }
}
