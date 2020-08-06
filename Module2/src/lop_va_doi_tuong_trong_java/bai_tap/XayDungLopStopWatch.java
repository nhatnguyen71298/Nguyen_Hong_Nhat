package lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Date;
import java.util.Scanner;

public class XayDungLopStopWatch {
    public static class StopWatch{
        Date start,stop;
        public StopWatch(){

        }
        public StopWatch(Date timeStart,Date timeStop){
            this.start=timeStart;
            this.stop=timeStop;
        }
        public Date start(){
            return this.start;
        }
        public Date stop(){
            return this.stop;
        }
        public long getElapsedTime(){
            long elapsedTime= this.stop.getTime()-this.start.getTime();
            return elapsedTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Date start,stop;
        int choose;

        System.out.println("Started!\n" +
                "Press 1 to finish: ");
        choose=scanner.nextInt();

        start=new Date();
        while (choose!=1){
                System.out.println("The clock is still running");
            choose=scanner.nextInt();
        }

        stop=new Date();
        StopWatch watch= new StopWatch(start,stop);
        System.out.println("The clock has not stopped");
        System.out.println("Time has passed:");
        System.out.println(watch.getElapsedTime());

    }
}
