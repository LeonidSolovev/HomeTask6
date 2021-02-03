public class Cat extends Animal{
    public Cat(String name, String color, int age){
        super(name, color, age);
} @Override
    public void run(int distance) {

        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Слишком далеко бежать");
        }
    }

    @Override
    public void swim(int distance1) {
        System.out.println(name +" не умеет плавать");
    }
}
