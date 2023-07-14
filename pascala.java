import java.util.*;

import javax.security.sasl.SaslClient;

public class pascala{

public static void main(String[] args) {
    System.out.println("enter ur  problem:______");
Scanner sc= new  Scanner(System.in);
int k = sc.nextInt();

for(int j=0;j<k;j++){
    int num=1;
    for(int m=0;m<=j;m++){
        
        System.out.format("%4d",num);
         num=num*(j-m)/(m+1);
         boolean is =(j==k-1);
         if(is){
            System.out.print("\u001B[41m");
         }
    } 
    
    System.out.println();
   

}

}


}
