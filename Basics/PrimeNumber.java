import java.util.*;
public class PrimeNumber{
    public static void main(String[]args0){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime = false;
        }else{
            for(int i =2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" "+"is a prime number");
        }else{
            System.out.println(num+" "+"is not a prime number");
        }
        sc.close();
    }
}