//Q2. 3의배수의합구하기
//while문을사용해1부터1000까지의자연수중3의배수의합을구해보자.
// if문 조건문 채우기

public class Q12 {
    public static void main(String[] args) {
        int result = 0;
        int i =1;
        while (i <= 1000) {
            if (i%3 == 0/*여기 채우기*/) {
                result += i;
            }
            i += 1;
        }
        System.out.println(result); //166833 출력되야함
    }
}
