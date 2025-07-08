//Q5. 다음과같은문자열a:b:c:d가있다.replaceAll메서드를사용하여a#b#c#d로바꿔서출력해보자

public class Q5 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replace(":", "#");
        System.out.println(b);
    }
}
