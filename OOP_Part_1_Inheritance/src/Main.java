public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------------------JAVA CLASSES-----------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        Car car = new Car();
        System.out.println();
        System.out.println("Using public method from the class to print");
        car.describeCar();

        System.out.println();
        System.out.println("Using public getter method to print");
        System.out.println("Make: " + car.getMake() + " and " + "Model: " + car.getModel());

        System.out.println();
        System.out.println("Using public setter method to set different values for the fields");
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        car.setConvertible(true);
        car.describeCar();

        System.out.println();
        System.out.println("Using public setter method (make with some additional validation) to set different values for the fields");
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        car.setConvertible(true);
        car.describeCar();

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------------------CLASSES CHALLENGE------------------------------");
        System.out.println("--------------------------------------------------------------------------");
        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------------------CREATE OBJECT USING CONSTRUCTOR----------------");
        System.out.println("--------------------------------------------------------------------------");
        bobsAccount = new Account("12345", 500,
                "Bob Brown", "myemail@bob.com",
                "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------------------MULTIPLE CONSTRUCTOR---------------------------");
        System.out.println("--------------------------------------------------------------------------");
        Account timsAccount = new Account("Tim",
                "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());

        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------------------CONSTRUCTOR CHALLENGE--------------------------");
        System.out.println("--------------------------------------------------------------------------");

        Customer pritam = new Customer("Pritam", 100000.00,"allArgsConstructor@email.com");
        System.out.println("Customer Name: " + pritam.getName());
        System.out.println("Customer Email: " + pritam.getEmailAddress());
        System.out.println("Customer Credit Limit: " + pritam.getCreditLimit());
        System.out.println("--------------------------------------------------------------------------");

        pritam = new Customer("Rocky", "2ArgsConstructor@email.com");
        System.out.println("Customer Name: " + pritam.getName());
        System.out.println("Customer Email: " + pritam.getEmailAddress());
        System.out.println("Customer Credit Limit: " + pritam.getCreditLimit());
        System.out.println("--------------------------------------------------------------------------");


        pritam = new Customer();
        System.out.println("Customer Name: " + pritam.getName());
        System.out.println("Customer Email: " + pritam.getEmailAddress());
        System.out.println("Customer Credit Limit: " + pritam.getCreditLimit());
    }
}
































