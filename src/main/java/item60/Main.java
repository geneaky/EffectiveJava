package item60;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double funds = 1.00;
        int itemsBought = 0;
        for(double price = 0.10;funds>=price;price+=0.10){
            funds-= price;
            itemsBought++;
        }
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈:" + funds);
        ////////float이나 double을 사용하면 정확한 계산이 불가능함
        ////따라서 decimal 혹은 int long을 써야함 decimal은 사용하기 불편하다는 단점과 단발성 계산이 느리다는 단점이 있다.

        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsDecimalBought = 0;
        BigDecimal BDfunds = new BigDecimal("1.00");
        for(BigDecimal price = TEN_CENTS; BDfunds.compareTo(price)>=0;price=price.add(TEN_CENTS)){
            BDfunds = BDfunds.subtract(price);
            itemsDecimalBought++;
        }
        System.out.println(itemsDecimalBought + "개 구입");
        System.out.println("잔돈 :" + BDfunds);
    }
}
