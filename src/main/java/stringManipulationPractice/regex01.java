package stringManipulationPractice;

public class regex01 {

    public static void main(String[] args) {
        //String checkChars = "appLe0123-";
       // boolean a = checkChars.matches("^[\\w]");
        //System.out.println();

            /*    System.out.println(validate("ABCDEFabcdef123450"));
                System.out.println(validate("SQL"));
                System.out.println(validate("Java"));
                System.out.println(validate("*&%@#!}{"));
                System.out.println(validate("w3resource.com"));
            }

            public static boolean validate(String text) {
                return text.matches("^[\\w]+$"); */

      String seq = "abc_cde_fgh";
      boolean result = seq.matches("^[a-z]+(_[a-z]+)*$");
      System.out.println(result);

    }
}



