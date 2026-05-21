import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {

    // AppointmentScheduler scheduler = new AppointmentScheduler();
    // scheduler.schedule("7/25/2019 13:45:00");
    // => LocalDateTime.of(2019, 7, 25, 13, 45, 0)
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, dateTimeFormatter);
    }
    // AppointmentScheduler scheduler = new AppointmentScheduler();
    // scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0));
    // => true

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime parsed = LocalDateTime.now();
        return appointmentDate.isBefore(parsed);
    }

    /*
     * AppointmentScheduler scheduler = new AppointmentScheduler();
     * scheduler.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 15, 0, 0))
     * // => true
     */
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    /*
     * AppointmentScheduler scheduler = new AppointmentScheduler();
     * scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0))
     * // => "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
     */
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.",
                Locale.ENGLISH);
        String result = appointmentDate.format(dateTimeFormatter);
        return "You have an appointment on " + result;
    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDate.now().getYear();
        return LocalDate.of(year, 9, 15);
    }
}
