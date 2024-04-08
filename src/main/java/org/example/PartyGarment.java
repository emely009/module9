package org.example;
/**This class implements the garmentFactory class to help create the party
 variant of garments**/
public class PartyGarment implements GarmentFactory {
    public Top createTop() {
        return new PartyTop();
    }
    public Pants createPants() {
        return new PartyPants();
    }
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
