//Q3. 별 표시하기
//while 문과 for 문을 사용하여 다음과 같이 별 (*) 을 표시하는 프로그램을 작성해 보자.
//if문과 for문 빈칸 채우기
//*
//**
//***
//****
//*****

public class Q13 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i += 1;
            if (i > 5) {
                break;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
