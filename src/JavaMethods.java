import java.util.Scanner;

public class JavaMethods {
    // static void welcom(){
    //     System.out.println("Hello");
    // }

    // public void welcome(){
    //     System.out.println("Hello!");
    // }

    class Algebra{
        int add(int a, int b){
          int ans = a + b;
          return ans;  
        }
    }
    public static void main(String[] args) {
        // JavaMethods method = new JavaMethods();
        // method.welcome();

        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Sum of input numbers is: ");
        int ans = obj.add(x, y);
        System.out.println(ans);


    }
}
