import java.util.*;
public class LargestNumber{
  public static void main(String[]args){
    int arr[] = {12,13,14,10,15};
    int max = arr[0];
    for(int i = 0;i<arr.length;i++){
      if(max<arr[i]){
        max = arr[i];
      }
    }System.out.println(max);
  }
}
    
