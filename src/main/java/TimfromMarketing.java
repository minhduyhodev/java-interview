public class TimfromMarketing {

    public String print(Integer id, String name, String department) {
        // sđ
        if (id == null && department != null) {
            return name + " - " + department.toUpperCase();
        }

        if (id == null && department == null) {
            return name + " - OWNER";
        }

        if (id != null && department == null) {
            return "[" + id + "] - " + name + " - OWNER";
        }
        return "[" + id + "] - " + name + " - " + department.toUpperCase();
    }

    public static void main(String[] args) {
        TimfromMarketing timfromMarketing = new TimfromMarketing();
        System.out.println(timfromMarketing.print(null, "Charlotte Hale", null));
    }
}
