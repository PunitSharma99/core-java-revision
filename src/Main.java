public class Main {
    public static void main(String[] args)
    {
        Student student1=new Student();
        student1.name="Aman";
        student1.email="aman@gmail.com";
        student1.studentId=123;

        student1.showName();
        student1.showAll();


        Student student2=new Student();
        student2.name="Ayush";
        student2.email="ayush@gmail.com";
        student2.studentId=1234;

        student2.showName();
        student2.showAll();

        Student student3=new Student();
        student3.name="Anil";
        student3.email="anil@gmail.com";
        student3.studentId=12345;

        student3.showName();
        student3.showAll();

    }
}