//Q8. 다음과같은grade맵에서B에해당되는값을삭제해보자

import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result = grade.remove("B");
        System.out.println(result);
        System.out.println(grade);
    }
}
