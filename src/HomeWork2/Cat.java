package HomeWork2;

public class Cat {
    private static int age;
    private static String name;

    public Cat(String name, int age) {
        this.age = age;
        this. name = name;
    }

    public Cat() {
    }

    public static int getAge() {
        return age;
    }

    public static String getName() {
        return name;
    }

    public static void setAge(int age) {
        Cat.age = age;
    }

    public static void setName(String name) {
        Cat.name = name;
    }

    @Override
    public String toString() {
        return "Cat{ age = " + age +" name = "+ name + "}";
    }
}

