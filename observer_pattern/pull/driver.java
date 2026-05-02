import Displays_pull.CurrentDisplay;
import Displays_pull.WeatherStatsDisplay;
import Subject_pull.WeatherData;

public class driver {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentDisplay cd = new CurrentDisplay(wd);
        WeatherStatsDisplay sd = new WeatherStatsDisplay(wd);

        wd.setMeasurements(10,10,10);
        wd.setMeasurements(20,20,20);
    }
}
