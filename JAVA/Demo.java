import java.io.*;

class StudentInfo implements Serializable{
    String name;
    int rid;
    String contact;
    StudentInfo(String n, int r, String c){
        this.name = n;
        this.rid = r;
        this.contact = c;
    }
}

public class Demo{
    public static void main(String[] args){
        try{
            StudentInfo si = new StudentInfo("Abhi", 104, "110044");
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}