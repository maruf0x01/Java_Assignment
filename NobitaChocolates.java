import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class NobitaChocolates {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter friend's date of birth (yyyy-mm-dd): ");
            String dobInput = sc.nextLine();
            LocalDate dob = LocalDate.parse(dobInput);

            System.out.print("Enter current year: ");
            int currentYear = sc.nextInt();

            System.out.print("How many birthdays Nobita was not invited: ");
            int notInvited = sc.nextInt();

            int totalBirthdays = 0;
            for (int year = dob.getYear() + 1; year <= currentYear; year++) {
                if (dob.getMonth() == Month.FEBRUARY && dob.getDayOfMonth() == 29) {
                    if (Year.isLeap(year)) {
                        totalBirthdays++;
                    }
                } else {
                    totalBirthdays++;
                }
            }

            int chocolates = totalBirthdays - notInvited;
            if (chocolates < 0) chocolates = 0;

            System.out.println("Nobita will give " + chocolates + " chocolates.");
        }
    }
}
