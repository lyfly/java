public class Student {
    public int id;
    public String name;
    public int age;
    public Student(){
        super();
    }
    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
