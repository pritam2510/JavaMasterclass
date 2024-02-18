public class RecordPOJO {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(
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

record LPAStudent(String id, String name, String dateOfBirth, String classList){

}

