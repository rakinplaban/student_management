import java.io.*;
import java.util.*;

public class Teacher extends User{
    private ArrayList<Student> students;

    public Teacher(String username,String password) {
        this.username = username;
        this.password = password;
        this.students = new ArrayList<Student>();
    }

    @Override
    public boolean authentication(String username,String password){
        return this.username == username && this.password == password;
    }

    public String getUsername() {

        return username;
    }

    public String getPassword() {

        return password;
    }

    private static Student parseStudent(String line) {
        String[] fields = line.split(",");
        String name = fields[0];
        String roll_no = fields[1];
        String address = fields[2];
        int roll = Integer.parseInt(roll_no);
        return new Student(name, roll, address);
    }

    public void displayStudents() {
        try {
            File myObj = new File("students.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}