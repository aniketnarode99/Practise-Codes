import java.util.*;
public class pyramid {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("please enter no. for stars");
        int n =sc.nextInt();
        System.out.println("please enter\n"+ "1 for normal pyramid\n"+  "2 for reverse pyramid" );
        int a = sc.nextInt();
        sc.close();
        if(a==1){
            for(i=1;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println("");
            }
         }

        else if (a==2){
          for(i=n;i>0;i--){
              for(int j=0;j<i;j++){
               System.out.print("*");
               System.out.print(" ");
             }
            System.out.println("");
          } 
        }
        else{
            System.out.println("wrong entry");
        }
    }
}




    


