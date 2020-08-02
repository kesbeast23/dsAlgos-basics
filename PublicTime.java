import java.time.*;

public class PublicTime implements Time {
    // private int hour;
    // private int minute;
    // private int second;
    private LocalDateTime time;

    public PublicTime(){
    }
    public PublicTime(LocalDateTime time){
        this.time=time;
    }

    public int getHour(){
        return time.getHour();
    }
    public int getMinute(){
        return time.getMinute();
    }
    public int getSecond(){
        return time.getSecond();
    }
}