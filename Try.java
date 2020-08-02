import java.time.*;

public class Try extends PublicTime{
    public static void main(String[] args){
        PublicTime time_logged = new PublicTime(LocalDateTime.now());
        int this_hour = time_logged.getHour();
        System.out.println(this_hour);
    }
}