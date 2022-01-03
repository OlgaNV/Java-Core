public class Pupils {
    private final String City;
    private final int Data;
    private final int Temperature;

    public Pupils(String city, int data, int temperature) {
        this.City = city;
        this.Data = data;
        this.Temperature = temperature;
    }

    public String getCity() {
        return City;
    }
    public int setData() {
        return Data;
    }
    public int getTemperature() {
        return Temperature;
    }
}
