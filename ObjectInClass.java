// J.U 9.10.24
// ObjectInClass.java
// String Project to create objects from my classes
public class ObjectInClass {
    public static void main(String[] args) {
System.out.println("\n Welcome to my classes and object oriented programming!\n");


Student myNewStudent = new Student();

myNewStudent.age = 22;
myNewStudent.gpa = 3.4;
myNewStudent.major = "History";
myNewStudent.firstName = "Jonnie";
myNewStudent.lastName = "Uribe";
myNewStudent.onProbation = true;

        // Output some stuff about our new object
        System.out.println(" \n The first name of our student is: " + myNewStudent.firstName + "\n\n");

        // Create two more students
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

        oneMoreStu.major = "History";

        anotherStudent.age = 23;

        // How many statements?
        System.out.println("\n There were " + Student.getNumOfStudents() + " student objects created!" );


        // Create an array of students
        StuArray = new Student(100);


        for (int i = 0; i < 100; i++);{
            // Create 100 new Student objects.
            // Create names for my objects.
            // Create student objects
            Student studentNum = new Student();


            // Create a phone object
            Phone myNewPhone = new Phone();
            myNewPhone.model = "Iphone 13";
            myNewPhone.numOfCameras = 3;

            System.out.println("\n myNewPhone has " + myNewPhone.numOfCameras + " cameras!\n");
        }






        }
    }






