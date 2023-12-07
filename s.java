import java.util.*;



class asssigningStartup{
   
    int[]arr=new int[7];

    public int[] getArr() {
        return arr;
    }

    public void setArr() {
        
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
    }
  
}
public class mai {

    public static void main(String[] args) {
        asssigningStartup x=new asssigningStartup();
        
        asssigningStartup[] user=new asssigningStartup[7];
        for (int i = 0; i < user.length; i++) {
             user[i]=new asssigningStartup();

        }
        Scanner sc=new Scanner(System.in);
       int sum=0,m=0;
       System.out.println("plese enter your guess");
        for (int i = 0; i < user.length; i++) {
            int n=sc.nextInt();
            if (n>6||n<0) {
                System.out.println("invalidd number of guess");
            }
            else{
                if(n==2||n==3||n==4){System.out.println("hit");sum++;
            }
            
                else{System.out.println("miss");}
                 
               m++;
                if(sum==3){System.out.println("kill");System.out.println("you won ");break;}
                 
                 else{continue;}
            }
            
            
        }
        System.out.println("u have taken "+m+"guesses");

    }
}