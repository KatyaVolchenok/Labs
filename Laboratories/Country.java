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
        if(name != null && ! name.equals("Название страны не должно быть пустым."))  
        this.name = name;
    }

    public int getSquare() {
        return square;
    }
    public void setSquare(int square) {
        if(square > 0) {
        } else {
            throw new IllegalArgumentException("Площадь страны должна быть строго больше нуля.");
        }
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
        System.out.println(name + "; Площадь= " + square + "; Население= " + population
                + "."); {
        if (population == 0){
            System.out.println(name + "; Площадь= " + square + "; Население= " + population
                + ".");
        }
          else if (capitalPopulation == 0){
            System.out.println("Столица  " + capitalName + " с населением " + capitalPopulation);
        }
        else if(capitalName != null) {
            System.out.println("Столица  " + capitalName + " с населением " + capitalPopulation);   
       }
        else System.out.println();
        }
    }


    public static void printAll(Country[] countries) {
        for(Country c: countries)
            c.print();
    }


    public static void main(String[] args) {
        Country[] countries = new Country[] {
                new Country("Россия", 17_100_000, 146_700_000, "Москва", 12_600_000),
                new Country("Финляндия", 338_000, 5_500_000, "Хельсинки", 655_000),
                new Country("Франция", 643_800, 67_800_000, "Париж", 2_100_000),
                new Country("Андора", 467, 85_400, "Андорра да Велла", 22_600),
                new Country("Сингапур", 725, 5_700_000)
        };

        Country.printAll(countries);

    }
}
