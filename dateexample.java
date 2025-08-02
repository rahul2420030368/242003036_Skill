package MYPROJECT;
import java.util.*;
public class dateexample {
public static void main(String[] args) {
	Date d=new Date();
	 System.out.println("current date is" +d);
	 int month = d.getMonth();
	 System.out.println("the month : "+month);
	 int year = d.getYear();
	 System.out.println("the year :"+year);
	 System.out.println("the minutes : "+d.getMinutes());
	 System.out.println("the hours :" +d.getHours());
}
}
                                                