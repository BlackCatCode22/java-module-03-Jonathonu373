public class Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal object
    public Animal() {
        numOfAnimals++;
    }


    // Create a few attributes (fields)
    // Sex will be 'male' or 'female'
    String sex = "";
    // age will be in years
    private int age = 0;
    // weight will be in pounds
    private int weight = 0;

    // Create getters and setters


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
