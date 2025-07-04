public class D51Q26kadai {
    public static void main(String[] args) {
        // fall-through  breakが記入されてない場合、続きの処理を実行すること
        // break  そこで処理を終了するためのコマンド
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            default:
                s += "?";
        }
        System.out.println(s);
    }
}
