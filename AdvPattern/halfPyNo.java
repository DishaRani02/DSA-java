public class halfPyNo {
    public static void print(int TotRow){
        for(int i=0; i<TotRow; i++){
            for(int j=1; j<= TotRow-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] agrs){
        print(19);
    }
}
// public class halfPyNo{
//     public static void Print(int TotRow){
//         for(int i=0; i<TotRow; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Print(12);
//     }
// }
