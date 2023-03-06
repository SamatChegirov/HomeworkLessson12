public class City {
    private String city;
    private String cod;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "City: " + "city: " + city + ", City cod: " + cod;
    }
}
