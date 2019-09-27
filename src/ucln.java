import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a :");
        a = input.nextInt();
        System.out.print("Enter number b :");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a==0 || b==0){
            System.out.print("No greater common factor");
        }
        while (a!=b){
        if (a>b) a = a - b;
        else b = b - a;
    }
        System.out.print("Greater common factor :" + a);
}
}
