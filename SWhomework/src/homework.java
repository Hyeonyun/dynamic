import java.util.Scanner;

public class homework {
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();
  
  int[] arr1 = new int[41];
  int[] arr2 = new int[41];
  
  arr1[0] = 1;
  arr1[1] = 0;
  
  arr2[0] = 0;
  arr2[1] = 1;
  
  for(int i=2; i<41 ;i++){
   arr1[i] = arr1[i-1] + arr1[i-2];
   arr2[i] = arr2[i-1] + arr2[i-2];
   
  }
  
  for(int j=0 ; j<t ; j++){
   int a = scan.nextInt();
   System.out.println(arr1[a] +" "+arr2[a]);
   System.out.println("commit_1");  
  }
  scan.close();
 }

}