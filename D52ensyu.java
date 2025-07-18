public class D52ensyu {
    public static void main(String[] args) {
        Animal tama =  new Cat();
        Animal ao = new Horse();
        Animal a = new Animal();

        tama.bark();
        ao.bark();
        a.bark();
    }
}

class Animal {
    public void bark() {
        System.out.println("???");
    }
}

class Cat extends Animal {
    public void bark() {
        System.out.println("ニャーン");
    }
}

class Horse extends Animal {
    public void bark() {
        System.out.println("ヒヒーン");
    }
}