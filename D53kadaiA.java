public class D53kadaiA {
    public static void main(String[] args) {
        int arr = 0;
        for (String x : args) {
            arr += Integer.parseInt(x);
        }
        System.out.println(arr);
    }
}
