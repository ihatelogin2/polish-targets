package model;

public class UrbanRural extends Location{
    public UrbanRural(String name, String voivodeship, LocationType type) {
        super(name, voivodeship, LocationType.URBAN_RURAL);
    }

    @Override
    public String sayGreeting() {
        return "Welcome to totally balanced "+getName();
    }
}
