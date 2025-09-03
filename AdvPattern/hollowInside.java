public class hollowInside{
public static void StarPrint(int TotRow, int TotCol){
    for(int i=1; i<= TotRow; i++){
        for(int j=1; j<=TotCol; j++){
            if(i==1 || i==TotRow || j==1 || j==TotCol){
                System.out.print("*");
            }
            else System.out.print(" ");
        }
        System.out.println();
    }
    
}
public static void main(String args[]){
    StarPrint(8, 6);
}
}
