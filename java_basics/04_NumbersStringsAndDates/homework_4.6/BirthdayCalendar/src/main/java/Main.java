import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; birthday.isBefore(currentDate); i++) {
            sb.append(i).append(" - ").append(birthday).append(" - ").append(birthday.getDayOfWeek()).append(System.lineSeparator());
            birthday = birthday.plusYears(1);
        }

        return sb.toString();

/*      // month -= 1;
        Calendar birthday = new GregorianCalendar(year, month, day);
        Calendar currentDate = Calendar.getInstance(Locale.US);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - E", Locale.US);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; birthday.before(currentDate); i++) {
            sb.append(i).append(" - ").append(dateFormat.format(birthday.getTime())).append(System.lineSeparator());
            birthday.add(Calendar.YEAR, 1);
        }
        return sb.toString();
*/
    }
}
