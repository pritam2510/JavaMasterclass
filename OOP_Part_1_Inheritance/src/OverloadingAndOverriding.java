public class OverloadingAndOverriding {
    public static void main(String[] args) {

    }
}

class Overloading {
    public Overloading() {
    }

    public void Print(){
        System.out.println("Random text");
    }

    //Overloading
    public void Print(String text){
        System.out.println(text);
    }

    //Overloading
    protected int Print(int num){
        System.out.println(num);
        return num;
    }

    //Not Overloading, as return type is not considered as signature of the method
    /*public int Print(){

    }*/
}

class Overriding extends Overloading{
    @Override
    public void Print(){
        System.out.println("Random text");
    }

    @Override
    public void Print(String text){
        System.out.println(text);
    }

    @Override
    public int Print(int num){
        System.out.println(num);
        return num;
    }
    //one more rule for overriding is that the return type can be exactly same class type or any subclass of the actual class returned in the parent class (basically covariant class as return)

    //Not possible because while overloading we can not have a more restrictive access specifier that of the parent class
    /*@Override
    private int Print(int num){
        System.out.println(num);
        return num;
    }*/
}