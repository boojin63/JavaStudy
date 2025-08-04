import java.util.ArrayList;

public class PT4 {
    public static void main (String[] args) {
        boolean creditCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("creditCard");

        if(pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else {
            if (creditCard) {
                System.out.print("택시를 타고 가라");
            } else {
                System.out.println("걸어가라");
            }
        }
    }
}
