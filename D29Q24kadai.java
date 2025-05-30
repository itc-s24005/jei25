public class D29Q24kadai {
    public static void main(String[] args) {
        int values[] = {10,20, 30, 40};
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.printf("%d, %d", sum , values.length);
    }
}
