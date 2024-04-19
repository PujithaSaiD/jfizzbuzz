import java.util.*;
public class Fizzbuzz {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<m;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
            }
            else if(i%3==0){
                System.out.print("Fizz ");
            }
            else if(i%5==0){
                System.out.print("Buzz ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
    
}
