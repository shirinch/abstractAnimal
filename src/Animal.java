public abstract class Animal {
    private String nickName;
    private int weight;
    private char gender;
    private int age;
    public Animal(){}

    public Animal(String nickName, int weight, char gender, int age) {
        this.nickName = nickName;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }


    public abstract void methodAbstract();
    public abstract String methodAbstract2();


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
        return "Animal{" +
                "nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
