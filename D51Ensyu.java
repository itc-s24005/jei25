public class D51Ensyu {
    public static void main(String[] args) {
        D51Student d1 = new D51Student(args[0], args[1]);
        System.out.printf("学籍番号: %s%n氏名: %s%n", d1.number, d1.name);
    }
}

class D51Student {
    String number;
    String name;

    D51Student(String number, String name) {
        this.number = number;
        this.name = name;
    }
}
