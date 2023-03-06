public class Country {
    private String country;
    private long population;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country: " + "Country: " + country + ", Population: " + population;
    }
}
