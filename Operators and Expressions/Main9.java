public class Main9 {
    public static void main(String[] args) {
        int year = 2025;
        boolean isLeapYear = ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0)) ?  true: false;
        System.out.println(year + " is " + ((isLeapYear == true) ? "a leap year." : "not a leap year."));
    }
}
