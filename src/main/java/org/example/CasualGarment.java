package org.example;
/**This class implements the garmentFactory class to help create the casual
variant of garments**/
public class CasualGarment implements GarmentFactory{
    public Top createTop() {
        return new CasualTop();
    }
    public Pants createPants() {
        return new CasualPants();
    }
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
