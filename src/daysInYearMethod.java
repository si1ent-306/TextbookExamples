public class daysInYearMethod {
    //Write a method that returns the number of days in a year using the following header:
    public static void main(String[] args){
        int number = numberOfDaysInYear(2000);
        System.out.println(number);
    }

    public static int numberOfDaysInYear(int i) {
        if(i %4==0){
            return 366;
        }else if(i % 4 != 0){
            return 364;
        }
        return -1;
    }
}
