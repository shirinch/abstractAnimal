public class Sheep extends Animal{
    private String nickName;
    private int weight;
    private char gender;
    private int age;

    public Sheep(){}

    public Sheep(String nickName, int weight, char gender, int age) {
        this.nickName = nickName;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void methodAbstract() {

    }

    @Override
    public String methodAbstract2() {
        return null;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
