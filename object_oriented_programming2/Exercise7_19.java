package object_oriented_programming2;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (p.price > money) {
            System.out.printf("잔액이 부족하여 %s을/를 살 수 없습니다.\n", p.toString());
            return;
        } else {
            money -= p.price;
            add(p);
        }
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] temp = new Product[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                temp[j] = cart[j];
            }
            cart = temp;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        int sum = 0;
        String buy_items = "";
        for (int i = 0; i < cart.length; i++) {
            sum += cart[i].price;
            buy_items += (cart[i].toString() + ", ");
        }

        System.out.println("구입한 물건: " + buy_items);
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}