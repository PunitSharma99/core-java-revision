import java.sql.SQLOutput;

public class Student
{
    String email;
    String name;
    int studentId;


    public void showName()
    {
        System.out.println("Name ="+name);
    }
    public void showAll()
    {
        System.out.println("Name ="+name);
        System.out.println("Email ="+email);
        System.out.println("Student id ="+studentId);

    }
}
