package 观察者模式.java内置观察者;

import java.util.Observable;
import java.util.Observer;
import 观察者模式.DisplayElement;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println("current conditions: "+temp+"F degrees and "+ humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
