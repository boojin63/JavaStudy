//Q3. 홍길동씨의주민등록번호는881120‑1068234이다. 홍길동씨의주민등록번호앞자리에해당하는부
//분인연월일(YYYYMMDD)과뒷자리에해당하는부분으로나누어출력해보자

public class Q3 {
    public static void main (String[] args) {
        String pin = "881120-1068234";
        String yyyyMMdd = pin.substring(0,6); // 0~5번째 인덱스만 추출
        String num = pin.substring(7); // 7번째 인덱스부터 추출
        System.out.println(yyyyMMdd);
        System.out.println(num);
    }
}