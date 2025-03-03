class Student 
{
    
    private String name;
    private int age;
    private String grade;
    public Student(String name, int age, String grade) 
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");
    }
}
public class task_7 
{
    public static void main(String[] args) 
    {
        
        Student student1 = new Student("karim", 20, "A");
        Student student2 = new Student("rahim", 22, "B");
        Student student3 = new Student("rakib", 21, "A+");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}