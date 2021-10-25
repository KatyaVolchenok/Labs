/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratories;

/**
 *
 * @author Shwartskopff
 */
public class Country {
    private String name;
    private int square;
    private int population;
    private String capitalName;
    private int capitalPopulation;
    private int capitalSquare;

    public Country(String name, int square, int population) {
        setName(name);
        setSquare(square);
        setPopulation(population);
    }


    public Country(String name, int square, int population, String capitalName, int capitalPopulation) {
        this(name, square, population);
        setCapital(capitalName, capitalPopulation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("Название страны не должно быть пустым.");
        this.name = name;
    }

    public int getSquare() {
        return square;
    }
    public void setSquare(int square) {
        if(square <= 0)
            throw new IllegalArgumentException("Площадь страны должна быть строго больше нуля.");
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        if(population <= 0)
            throw new IllegalArgumentException("Население страны должно быть строго больше нуля.");
        this.population = population;
    }

    public float getPopulationDensity() {
        return ((float)population) / square;
    }

    public String getCapitalName() {
        return capitalName;
    }


    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapital(String capitalName, int capitalPopulation) {
        if(capitalName != null) {
            if(capitalPopulation <= 0)
                 throw new IllegalArgumentException("Население страны должно быть строго больше нуля.");
        } else {
            capitalPopulation = 0;
        }
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public void print() {
        System.out.println(name + "; square=" + square + "; population=" + population);

        if(capitalName != null)
            System.out.println("The capital is " + capitalName
                    + " with population " + capitalPopulation);
        System.out.println();
    }

    public static void printAll(Country[] countries) {
        for(Country c: countries)
            c.print();
    }


    public static void main(String[] args) {
        Country[] countries = new Country[] {
                new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
                new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
                new Country("France", 643_800, 67_800_000, "Paris", 2_100_000),
                new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600),
                new Country("Singapore", 725, 5_700_000)
        };

        Country.printAll(countries);

    }
}
