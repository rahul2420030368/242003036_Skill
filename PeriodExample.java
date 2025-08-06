package MYPROJECT;
import java.time.*;

public class PeriodExample {
    public static void main(String[] args) {
        
        
        LocalDate startDate = LocalDate.of(2007, 4, 11); 
        LocalDate endDate = LocalDate.now();
        
        Period period = Period.between(startDate, endDate);
        
       
        System.out.print("Years:" + period.getYears());
        System.out.print(" Months:" + period.getMonths());
        System.out.print(" Days: " + period.getDays());
     
    }
}
