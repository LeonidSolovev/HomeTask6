public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Пушок", "Синий", 4);
        Dog dog = new Dog("Лысик", "Розовый", 5);
        int n = 430;
        int q = 5;
        dog.run(n);
        cat.run(n);
        dog.swim(q);
        cat.swim(q);
     

    }
}
