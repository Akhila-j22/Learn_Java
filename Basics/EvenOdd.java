import java.util.*;
public class EvenOdd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        if(Num%2==0){
            System.out.println(Num +" "+"is even number");
        }
        else{
            System.out.println(Num +" "+"is odd number");
        }
    }
}