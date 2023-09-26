package lesson2.creatingClass;

public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge) {
        super();
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogType() {
        return this.dogType;
    }

    public String getDogName() {
        return this.dogName;
    }

    public String getDogColor() {
        return this.dogColor;
    }

    public int getDogAge() {
        return this.dogAge;
    }

    public void setDogType(String type) {
        this.dogType = type;
    }

    public void setDogName(String name) {
        this.dogName = name;
    }

    public void setDogColor(String color) {
        this.dogColor = color;
    }

    public void setDogAge(int age) {
        this.dogAge = age;
    }

    @Override
    public String toString() {
        return "Dog type:" + dogType + " Dog name:" + dogName + " Dog color:" + dogColor + " Dog age" + dogAge;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Poodle", "Ice", "White", 13);

        System.out.println(myDog.toString());
    }
}
