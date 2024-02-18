public class JavaLangObjectSuperClass extends java.lang.Object {
    public static void main(String[] args) {
        Students max = new Students("Max", 21);
        System.out.println(max.toString());
        System.out.println(max);

        PrimaryStudent jimmy = new PrimaryStudent("Jimmy", 8, "Clair");
        System.out.println(jimmy);
    }
}

class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@Override
    public String toString() {
        super.toString();
    }*/

    /*@Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    */
    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }
}

class PrimaryStudent extends Students{
    private String parentName;

    public PrimaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}









































































































