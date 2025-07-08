//Q10. 다음은커피의종류(1:아메리카노,2:아이스아메리카노,3:카페라떼)를입력하면가격을알려주는
//        프로그램이다.이코드에서1,2,3과같은매직넘버를제거하여프로그램을개선해보자

import java.util.HashMap;

public class Q10 {
    enum CoffeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    static void printCoffeePrice(CoffeType type) {
        HashMap<CoffeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeType.AMERICANO, 3000);
        priceMap.put(CoffeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
    public static void main (String [] args) {
        printCoffeePrice(CoffeType.AMERICANO);
    }
}
