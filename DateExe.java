package com.company.classAndInstanceExecrise;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateExe {
    public static void main(String[] args) {
        LocalDateTime dnt = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd-MM-yyyy // HH:mm:ss a");
        DateTimeFormatter ymd = DateTimeFormatter.ofPattern("yyyy-dd-MM // HH:mm:ss a");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter d for date, t for time & dnt for date and time: ");
        String choice = input.next();
        if (Objects.equals(choice, "d")){
            System.out.println("Enter Format you want: dmy or ymd ");
            String format = input.next();
            if (Objects.equals(format, "dmy")){
                String pattern = "dd-MM-yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String dte = simpleDateFormat.format(new Date());
                System.out.println("Today's date:"+dte);
            }else {
                System.out.println("Today's date:"+ date);
            }
        }
        else if (Objects.equals(choice, "t")){
            String pattern = "HH:mm:ss a";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String dte = simpleDateFormat.format(new Date());
            System.out.println("Time is: "+ dte);
        }
        else {
            System.out.println("Enter Format you want: dmy or ymd ");
            String format = input.next();
            if (Objects.equals(format, "dmy")){
                String dntdmy = dnt.format(dmy);
                System.out.println("Today's date and Time now: "+ dntdmy);
            }else {
                String dntymd = dnt.format(ymd);
                System.out.println("Today's date and Time now: "+dntymd);
            }
        }
}
}

