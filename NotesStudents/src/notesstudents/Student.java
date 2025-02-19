package notesstudents;

public class Student {
    private String code, name;
    private int age;
    private double note;

    public Student() {}

    public Student(String code, String name, int age, double note) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.note = note;
    }
    
    public String getCode(){
        return code;
    }
    
   public void setCode(String code){
       this.code = code;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", age=" + age + ", note=" + note + '}';
    }
}
