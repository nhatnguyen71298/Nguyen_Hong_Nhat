package lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class XayDungLopStopWatch {
    public static class StopWatch{
        private long start,stop,elapsedTime;

        public StopWatch(){
        }

        public void setStart(long start) {
            this.start = start;
        }

        public void setStop(long stop) {
            this.stop = stop;
        }

        public long getStart() {
            return start;
        }

        public long getStop() {
            return stop;
        }

        void start(){
            start=System.currentTimeMillis();
        }

        void stop(){
            stop=System.currentTimeMillis();
        }

        long getElapsedTime(){
            return elapsedTime= this.stop-this.start;
        }
    }

    public static void main(String[] args) {
        int[] array=new int[100000];
        for (int i=0;i<array.length;i++){
            array[i]=  (int) (Math.random()*100000+1);
        }
        StopWatch stopWatch =new StopWatch();
        stopWatch.start();
        Arrays.sort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

}
