public class simplePattern{
    public static void print(int totRow){
        for(int i=0; i<totRow; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}