public class Dog {
    // Create two fields for our Dog object.

    private String name;
   private int age;




   // Create getters and setters for our fields.
    // Create getter and setter for name.

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Crete getter and setter for age.
    public int getAge() {
        return this.age;
        // this would work as well because there is no ambiguity
        // return age;

    }
    public void setAge(int age){
        this.age = age;

    }



    // Create a constructor for the Dog objects that will be created with the "new" keyword.
    // A constructor is a special method that is called or invoked when...the Dog class is used
    // to create an object.
    public Dog(){
        System.out.println("\n a dog object was created. This message is from the constructor. \n");
    }


    // Create a constructor that accepts a string data type for the Dog's name.
    public Dog(String myName) {
       this.name = myName;
    }

    // Create a constructor that accepts an argument when an object is created, this argument will
    // will be an int
    public Dog(int theAge){
        this.age = theAge;
    }

    // Create a constructor that accepts two arguments - a string for the name an int for age.
    public void Dog(String someName, int someAge){
    // Assign name and age to our new object.
    this.age = someAge;
    this.name = someName;
    }





}

