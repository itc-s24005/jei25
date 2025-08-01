public class D53Q25kadai {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C'};
        //アドレスが違うので同じになるようにした
        String s1 = "ABC";
        String s2 = "ABC";
        boolean b1 = s1 == s2;
        boolean b2 = s1.equals(s2);
        System.out.println(b1 + " " + b2);
    }
}
