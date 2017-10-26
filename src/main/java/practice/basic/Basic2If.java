package practice.basic;

public class Basic2If {

    public static void main(String[] args) {

        int myAge = 32;

        if (myAge > 18) {
            System.out.println("성인");
        }
        else if (myAge == 18) {
            System.out.println("성인까지 1년남음");
        }
        else {
            System.out.println("미성년자");
        }

    }
}
