package org.example;

// The main class demonstrates how the garments are put together
public class Main {
    public static void main(String[] args) {
        System.out.println("Example of Professional outfit:");
        GarmentFactory professionalFactory = new ProfessionalGarment();
        GarmentSimulator professionalSimulator = new GarmentSimulator(professionalFactory);
        professionalSimulator.dressUp();

        System.out.println("\nExample of Casual outfit:");
        GarmentFactory casualFactory = new CasualGarment();
        GarmentSimulator casualSimulator = new GarmentSimulator(casualFactory);
        casualSimulator.dressUp();

        System.out.println("\nExample of Party outfit:");
        GarmentFactory partyFactory = new PartyGarment();
        GarmentSimulator partySimulator = new GarmentSimulator(partyFactory);
        partySimulator.dressUp();
    }
}