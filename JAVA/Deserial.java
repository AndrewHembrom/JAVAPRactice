import java.io.*;

class StudentInfo implements Serializable{
    String name;
    int rid;
    String contact;
    StudentInfo (String n, int r, String c){
        this.name = n;
        this.rid = r;
        this.contact = c;
    }
}

public class Deserial {
    public static void main(String[] args){
        StudentInfo si =null;
        try{
            FileInputStream fis = new FileInputStream("student.txt");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                si = (StudentInfo)ois.readObject();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(si.name);
        System.out.println(si.rid);
        System.out.println(si.contact);
    }
}