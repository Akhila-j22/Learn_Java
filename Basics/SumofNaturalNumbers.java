import java.util.*;
public class SumofNaturalNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Sum = 0; //instead of this we can directly use formula --->Sum = ( Num * ( Num + 1 ) ) / 2
        for(int i=1;i<=Num;i++){
            Sum+=i;
        }System.out.println(Sum);
    }
}