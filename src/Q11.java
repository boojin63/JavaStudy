//Q1. 조건문의 참과 거짓 판단하기
//다음 코드의 출력 결과는 무엇일까?
//A. everywhere

public class Q11 {
    public static void main(String[] agrs) {
        String a = "write once, run anywhere";
        if (a.contains("wife"))  {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }
}
