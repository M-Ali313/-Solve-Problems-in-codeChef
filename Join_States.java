
import java.util.Scanner;

 
public class Join_States {
         public static void main(String ar[]){
               Scanner scan=new Scanner(System.in);
	           int t=scan.nextInt();
	        while(t-->0){            // difficalty  1043  JOin States 
	           int n=scan.nextInt();
	           int x=scan.nextInt();
	           int arr[]=new int[n];
	       for(int i=0;i<n;i++){
	           arr[i]=scan.nextInt();
	       }
	       int sum=0;
	       int c=0;
	       for(int i=0;i<n;i++){
	           sum+=arr[i];
	           if(sum>=x){
	               c++;
	               sum=0;
	           }
	       }
	       System.out.println(c);
	        }
               
         }       
}
