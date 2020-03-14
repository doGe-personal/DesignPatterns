package 观察者模式;

/**
 * 测试
 * @author Lynn
 * @since 2020/3/9
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(80, 65, 30);
    }

}
