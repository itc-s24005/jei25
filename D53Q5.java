public class D53Q5 {
    private static int[] taxes = {8, 10};
    private static  int FOODS = 0;
    private static int OTHER = 1;
    public static void main(String[] args) {
        int dataSizes = Integer.parseInt(args[0]);
        String[] names = new String[dataSizes];
        int[] prices = new int[dataSizes];
        int[] nums = new int[dataSizes];
        char[] types = new char[dataSizes];

        int argsIdx = 1;
        for (int i = 0; i < dataSizes; i++) {
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }

        System.out.println("商品名¥t 税抜¥t 税込¥t タイプ");
        for (int i = 0; i < dataSizes; i++) {
            int zeinuki = prices[i] * nums[i];
            int zeikomi, taxType;
            taxType = types[i] == 'f' ? FOODS : OTHER;
            zeikomi = zeinuki * (taxes[taxType] + 100) / 100;
            System.out.print(names[i] + "¥t" + viewtype(types[i]));
            System.out.println(zeikomi + "円¥t" + viewtype(types[i]));
        }
    }
    private static String viewtype(char c) {
        return c == 'f' ? "食品等" : "その他";
    }
}
