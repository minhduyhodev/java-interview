import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, dateTimeFormatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime parsed = LocalDateTime.now();
        return appointmentDate.isBefore(parsed);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

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
