package streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPrsn {
    public static void main(String[] args) {
        LocalDate birthday=LocalDate.of(2003,01,01);
		LocalDate today=LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthday, today));
    }
}
