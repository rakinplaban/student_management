public class Student {
    public String name;
    public int roll;
    public String address;

    Student(String name, int roll, String address){
        this.name = name;
        this.roll = roll;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return roll;
    }

    public String getAddress() {
        return address;
    }

}