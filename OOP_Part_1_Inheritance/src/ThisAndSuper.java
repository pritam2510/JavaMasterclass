public class ThisAndSuper {
    public static void main(String[] args) {

    }
}

class ParentClass {
    private String prop1;
    private String prop2;

    public ParentClass() {
        this("default value1", "default value2");
        //The "this" above will call the constructor from same class that match the argument list.
        //It must be the very first statement in the constructor
    }

    public ParentClass(String prop1, String prop2) {
        //The "this" here is referring to the object in question and used to access fields for the object
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public String print() {
        return this.prop1 + " " + this.prop2;
    }
}

class ChildClass extends ParentClass {
    private String prop3;

    public ChildClass() {
        this("default value1", "default value2", "default value3");
        //The "this" above will call the constructor from same class that match the argument list.
        //Can not have super() in this constructor
    }

    public ChildClass(String prop1, String prop2, String prop3) {
        super(prop1, prop2);
        //The "super" her will call a constructor from the parent class that matches the argument list.
        //It must be the very first statement in the constructor
        //Therefore a constructor can't have both this() and super() as they both need to be the very first statement. So only one can be called
        this.prop3 = prop3;
    }

    @Override
    public String print() {
        return (this.prop3 + " " + super.print());
    }

}