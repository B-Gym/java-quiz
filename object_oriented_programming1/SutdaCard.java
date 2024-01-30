package object_oriented_programming1;

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return isKwang ? num + "K" : "" + num;
    }
}