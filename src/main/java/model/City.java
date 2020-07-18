package model;

public class City extends Location{
    public City(String name, String voivodeship, LocationType type) {
        super(name, voivodeship, LocationType.CITY);
    }

    @Override
    public String sayGreeting() {
        return "Welcome to big, dynamic " +getName();
    }
}
