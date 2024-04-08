package org.example;
// Abstract  interface for creating families of related products

public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
