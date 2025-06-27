public class D51Q20kadai {
    public static void main(String[] args) {
        boolean flg = true;
        int n = 85;
        String c = (flg = n >= 70) ? "合格" : "不合格";
        System.out.println(c);
    }
}
