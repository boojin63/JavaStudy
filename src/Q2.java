//Q2. 자연수13이홀수인지짝수인지를판별할수있는방법을생각해보고,프로그램을만들어보자.

public class Q2 {
    public static void main (String[] args) {
        int a = 13;

        if (a % 2 == 1) {
            System.out.println("홀수");
        } else if (a % 2 == 0) {
            System.out.println("짝수");
        }
    }
}
