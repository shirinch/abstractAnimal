public class Horse extends Animal {
    private String nickName;
    private int weight;
    private int age;
    private char gender;
    private String color;

    public Horse (){}

    @Override
    public void methodAbstract() {

    }

    @Override
    public String methodAbstract2() {
        return null;
    }

    public Horse(String nickName, int weight, int age, char gender, String color) {
        this.nickName = nickName;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.color = color;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}
