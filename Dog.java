public class Dog extends Animal{

    public Dog(String name, String color, int age){
        super(name, color, age);}

    @Override
    public void run(int distance) {

        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Слишком далеко бежать");
        }
    }

    public void swim(int distance1){
            if(distance1<= 10){System.out.println (name+" проплыл " + distance1 +" метров");}
            else {
                System.out.println("Собаке слишком далеко плыть");
            }

    }

}
