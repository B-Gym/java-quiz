package collections_framework;

import java.util.HashSet;

public class Exercise11_11 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object o) {
        if (o instanceof SutdaCard) {
            SutdaCard c = (SutdaCard) o;
            return num == c.num && isKwang == c.isKwang;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return ("" + num + isKwang).hashCode();
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

}
