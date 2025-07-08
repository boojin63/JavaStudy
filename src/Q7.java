//Q7. 다음과같은[‘Life’, ‘is’, ‘too’, ‘short’]리스트를‘Life istoo short’과같이
//하나의문자열로만들어출력해보자.

import java.util.ArrayList;
import java.util.Arrays;

public class Q7 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList);
        System.out.println(result);
    }
}
