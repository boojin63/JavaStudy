//Q5. 평균 점수 구하기 2
//A학급에 총 10명의 학생이있다. 이 학생들의 중간고사 점수는 다음과 같다.
//  70, 60, 55, 75, 95, 90, 80, 80, 85, 100
//for each문을 사용하여 A학급의 평균점수를 구해보자.


public class Q15 {
    public static void main(String[] args) {
        int[] marks = { 70, 60, 55, 75, 95, 90, 80, 80, 85, 100 };
        int total = 0;
        for (int mark: marks) {
            total += mark;
        }
        float average = (float) total/10 ;
        System.out.println(average);
    }
}

