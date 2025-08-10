import java.util.Scanner;

public class NobitaChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter friend's date of birth (yyyy-mm-dd): ");
        String dobInput = sc.nextLine();
        java.time.LocalDate dob = java.time.LocalDate.parse(dobInput);

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        System.out.print("How many birthdays Nobita was not invited: ");
        int notInvited = sc.nextInt();

        sc.close();

        int totalBirthdays = 0;
        for (int year = dob.getYear() + 1; year <= currentYear; year++) {
            if (dob.getMonth() == java.time.Month.FEBRUARY && dob.getDayOfMonth() == 29) {
                if (java.time.Year.isLeap(year)) {
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
