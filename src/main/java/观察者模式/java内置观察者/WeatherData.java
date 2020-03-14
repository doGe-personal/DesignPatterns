package 观察者模式.java内置观察者;

import java.util.ArrayList;
import java.util.Observable;
import 观察者模式.Observer;

/**
 * @author Lynn
 * @since 2020/3/9
 */
public class WeatherData extends Observable {

    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

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
        //标示状态已经改变
        setChanged();
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
