enum Udon2 {
    KAKE("かけ",290, 280), KITSUNE("きつね", -380, 390), CURRY("カレー", 490, 520);
    private String japaneseName;
    int price;
    int calorie;
    Udon2(String japaneseName, int price, int calorie) {
        this.japaneseName = japaneseName;
        this.calorie = calorie;
        if (price < 0) {
            this.price = price;
        } else  {
            this.price = -1 * price;
        }
    }
    public String toString() {
        return japaneseName + " : " + price + "円" + " " + calorie + "カロリー";
    }
}
public class D53Q27kadai {
    public static void main(String[] args) {
        System.out.println(Udon2.KITSUNE);
    }
}
