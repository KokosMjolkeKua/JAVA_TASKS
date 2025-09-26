package Classes_Objects_Assignments;

class Clock{
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds){
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24){
            this.hour = hour;
        }

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59){
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
            if (seconds >= 0 && seconds <= 59){
                this.seconds = seconds;
            }
    }

    public void showTime(){
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }

}

public class Assignment_8 {
    public static void main(String[]args){
        Clock timeOne = new Clock(12,45,01);
        timeOne.showTime();
        Clock timeTwo = new Clock(11,34,67);
        timeTwo.showTime();

    }
}
