import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
int b=1;
        int a;
        a=in.nextInt();
        for (int i=a;a>=1;a--){


            b=a*b;

        }
        System.out.println(b);


    }
}