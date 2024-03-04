
import java.util.Scanner;

 
public class End_Sorted {
    public static void main(String ara[]){
         Scanner scan=new Scanner(System.in);
	            int t=scan.nextInt();
	        while(t-->0){
	            int n=scan.nextInt();
	            int arr[]=new int[n];
	            int po1=0,po2=0;
                    
	       for(int i=0;i<n;i++){
	           arr[i]=scan.nextInt();
	           if(arr[i]==1)po1=i;
	           if(arr[i]==n)po2=i;
	       }           //  difficalty 1049  
	       int swap=0;
	           if(po1<po2){
	          swap=po1+(n-1-po2);
	       }
	       else 
	        swap=po1+(n-1-po2)-1;
	        
	        System.out.println(swap);
	        }
                
	        
	        
    }
}
