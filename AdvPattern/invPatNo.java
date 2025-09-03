public class invPatNo {
    public static void print(int totRow){
        for(int i=0; i<totRow; i++){
            for(int j=1; j<= totRow-i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        print(6);
    }
}
