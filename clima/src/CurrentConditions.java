public class CurrentConditions implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float preassure;
    private Subject weatherData;


    public CurrentConditions (Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions are: "+ temperature + "F degrees," + humidity + "% humidity and "+ preassure + "in pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.preassure= pressure;
        display();

    }
}
