//Q4. 주민등록번호뒷자리의첫번째숫자는성별을나타낸다.첫번째숫자가1이면남자를,2이면여자를
//의미한다.홍길동씨의주민등록번호881120‑1068234에서성별을나타내는숫자를출력해보자

public class Q4 {
    public static void main (String[] args){
        String pin = "881120-1068234";
        System.out.println(pin.charAt(7)); // 특정 인덱스 추출
    }
}

