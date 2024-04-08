package org.example;
/**This class implements the garmentFactory class to help create the professional
 variant of garments**/
public class ProfessionalGarment implements GarmentFactory {
    public Top createTop() {
        return new ProfessionalTop();
    }
    public Pants createPants() {
        return new ProfessionalPants();
    }
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
