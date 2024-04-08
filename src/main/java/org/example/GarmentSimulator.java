package org.example;
// This class simulates dressing up using the GarmentFactory
public class GarmentSimulator {
    private Top top;
    private Pants pants;
    private Shoes shoes;

    // Constructor takes a GarmentFactory to create a coordinated outfit
    public GarmentSimulator(GarmentFactory factory) {
        top = factory.createTop();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    // Method to simulate dressing up with the created garments
    public void dressUp() {
        top.wear();
        pants.wear();
        shoes.wear();
    }
}
