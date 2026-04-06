import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student ss = new Student();
        Student s2 = new Student();
        s2.setName("Ravi");
        s2.setReg(111);
        s2.setDep("CSE");
        System.out.println(s2.getName() + " " + s2.getReg() + " " + s2.getDep());

        Student s3 = new Student();
        s3.setName("Vijay");
        s3.setReg(112);
        s3.setDep("IT");
        System.out.println(s3.getName() + " " + s3.getReg() + " " + s3.getDep());

        ss.setName("Bhargav");
        ss.setReg(113);
        ss.setDep("ECE");
        System.out.println(ss.getName() + " " + ss.getReg() + " " + ss.getDep());

        ArrayList<Student> list = new ArrayList<>();
        list.add(ss);
        list.add(s2);
        list.add(s3);

        
        System.out.println(list);
    }
}

class Student {
    private String name;
    private int reg;
    private String dep;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }
    public int getReg() {
        return reg;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    public String getDep() {
        return dep;
    }

    @Override
    public String toString() {
        return name + " " + reg + " " + dep;
    }
}
