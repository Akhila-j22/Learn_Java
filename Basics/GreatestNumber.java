public class GreatestNumber{
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>b && a>c ){
            System.out.println(a+ " "+"is greater");
        }else if(b>a && b>c){
            System.out.println(b+ " "+"is greater");
        }else if(c>a && c>b){
            System.out.println(c+ " "+"is greater");
        }
    }
}