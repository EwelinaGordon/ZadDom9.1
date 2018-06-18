import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fn = sc.nextLine();
        String ln = sc.nextLine();
        int a = sc.nextInt();
        sc.nextLine();
        String p = sc.nextLine();


        try {
            Person prs = new Person(fn, ln, a, p);
            System.out.println(prs.toString());
        } catch (NameUndefinedException ex) {
            System.out.println(ex.getMessage());
        } catch (IncorrectAgeException ex) {
            ex.getMessage();
        }


    }
}
