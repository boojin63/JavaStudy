//Q6. 다음과같은[1,3, 5, 4,2]리스트를[5,4, 3,2,1]로만들어보자

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q6 {
    public static void main (String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder()) ; // 내림차순 정렬
        System.out.println(myList);
    }
}
