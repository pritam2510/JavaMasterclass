public class POJOClasses {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student(
                    "S92023" + i,
                    switch (i){
                        case 1->"Pritam";
                        case 2->"Rakhi";
                        case 3->"Tisha";
                        case 4->"Tia";
                        default -> "Anonymous";
                    },
                    "25/10/1995",
                    "Java Master Class");

            System.out.println(s);
            //The above statement is equivalent to System.out.println(s.toString())
        }
    }
}

class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}







































































































