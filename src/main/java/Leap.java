public class Leap {

    boolean isLeapYear(int year) {
        if (year <= 0 || year > 2026) return false;

//        if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0) return true;

//        if(year < 100 && year % 4 == 0){
//            return true;
//        } else if( year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
//            return true;
//        return false;
//

       return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

    }

    public static void main(String[] args) {
        Leap leap = new Leap();
        System.out.println("no ra " + leap.isLeapYear(2400 ));
    }
}
