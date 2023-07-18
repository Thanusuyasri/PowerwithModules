import java.util.Scanner;

public class PowerwithModules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        a=a%p;
        int result = 1;
        for(int i=1;i<=n;i++)
        {
            result=(result*a)%p;
        }
        System.out.println(result%p);
    }
}
