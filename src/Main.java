import java.time.LocalDate;

/*Country, City, Address жана Person деген класс түзүп,
        Алардын поляларын ойлоп табыңыз
        Геттер сеттерлерди маани берүү жана алуу үчүн колдонуу керек
        Ар бир класска 3-4 төн объект түзүп жана аларга маанилерин бериңиз
        Ар бир класстын объектилерин өз-өзүнчө массивке салып, аларды консольго чыгарыңыз*/
public class Main {
    public static void main(String[] args) {

    Country country = new Country();
    country.setCountry("Kyrgyzstan");
    country.setPopulation(7000000);

    City city = new City();
    city.setCity("Osh");
    city.setCod("02");

    Address address = new Address();
    address.setStreet("Salieva: ");
    address.setHouse(145);

    Person person = new Person();
    person.setName("Samat");
    person.setAge(40);
    person.setDateOfBirthDay(LocalDate.of(1982, 8, 2));

    Country[] countries = {country};
    City [] cities = {city};
    Address[] addresses = {address};
    Person[] persons = {person};

    for (Country c : countries)
        System.out.println(c);
    for (City ci : cities)
        System.out.println(ci);
    for (Address ad : addresses)
        System.out.println(ad);
    for (Person p : persons)
        System.out.println(p);


        System.out.println("Name: " + person.getName() + "\nAge: " + person.getAge() + "\nBirth day: " + person.getDateOfBirthDay());
        System.out.println("Country: " + country.getCountry() + "\nPopulation: " + country.getPopulation());
        System.out.println("City: " + city.getCity() + "\nCity code: " + city.getCod());
        System.out.println("Address: " + address.getStreet() + "\nStreet: " + address.getHouse());


    }
}