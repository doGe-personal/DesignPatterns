package 观察者模式;

import java.util.ArrayList;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (Object o : observers) {
            Observer observer = (Observer) o;
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
