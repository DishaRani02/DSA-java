// public class linearSearch {
//     public static int LinearSearch(int number[], int key){
//         for(int i=0; i< number.length; i++){
//             if(number[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int number[] = {1,6,5,8,9};
//         int key = 9;
//         int x = LinearSearch(number, key);
//         System.out.println("Number is present at: "+x+" "+"index");
//         }
// }
public class linearSearch{
    public static int LinearSearch(String number[], String key){
        for(int i=0; i< number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
     return -1;
    }
    public static void main(String[] agrs){
        String number[] = {"Dosa", "Burger", "Samosa"};
        String key = "Samosa";
        int x = LinearSearch(number, key);
        System.out.println("String is at:"+" "+ x +" "+ "index");
    }
}

