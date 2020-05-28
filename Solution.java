import java.util.Scanner;

public class Bunny {
    public static void main(String args[])throws Exception {
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("number of test cases: ");
        int t = scan.nextInt();
        while(t-->0){
        System.out.println("value of x:");
        int x = scan.nextInt();
        System.out.println("value of n:");
        int n = scan.nextInt(); 
        int result = ((x+n-1)*(x+n-2)/2)+x;
        System.out.println(result);
        }
        scan.close();
        }catch(Exception e){
            return;
        }
    }
}

