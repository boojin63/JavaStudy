public class PT2 {
    public static void main (String[] args) {

        int money = 2000;
        boolean creditCard = false;
        if(money >= 3000 || creditCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
    }
}
