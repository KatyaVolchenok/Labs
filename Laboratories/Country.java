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
    
   
    public Country(String name, int square, int population) {
        setName(name);
        setSquare(square);
        setPopulation(population);
        this.capitalName = "данные отсутсвуют";
    }
    public Country(String name, int square, int population, String capitalName) {
        this(name, square, population);
         setCapitalName(capitalName);
        
    }
        public Country(String name, int square, String capitalName) {
        setName(name);
        setSquare(square);
        setCapitalName(capitalName);
    }
    public Country(String name, int square,  String capitalName, int capitalPopulation) {
        this(name, square, capitalName);
        setCapitalPopulation(capitalPopulation);
    }
    public Country(String name, int square, int population, String capitalName, int capitalPopulation) {
        this(name, square, population, capitalName);
        setCapitalPopulation(capitalPopulation);
    }
    
    public String getName() {
        return name;
    }
    public int getSquare() {
        return square;
    }
    public int getPopulation() {
        return population;
    }
    public int getPopulationDensity() {
        return population / square;
    }
    
    public String getCapitalName() {
        return capitalName;
    }
    public int getCapitalPopulation() {
        return capitalPopulation;
    }
    
    
    
    public void setName(String name) {
        if(name != null && ! name.equals("")) {  
        this.name = name;
    } else {
           throw new IllegalArgumentException("Название страны не должно быть пустым!");
        }
    }

    
    public void setSquare(int square) {
        if(square > 0) {
            this.square = square;
        } else {
            throw new IllegalArgumentException("Площадь страны должна быть строго больше нуля.");
        }
    }

    
    public void setPopulation(int population) {
        if(population > 0) {
            this.population = population;
        } else {throw new IllegalArgumentException("Население страны должно быть строго больше нуля.");
        }
    }

    public void setCapitalName(String capitalName) {
        if(capitalName != null && !capitalName.equals("")){
        this.capitalName = capitalName;
    } else { 
           throw new IllegalArgumentException();
    }
    }
    
    public void setCapitalPopulation(int capitalPopulation) {
        this.capitalPopulation = capitalPopulation;
    }
    
    public void print() {
        if(population == 0 && capitalPopulation == 0) {
            System.out.println("Название страны: " + name + "; Площадь: " + square + " ; Население: данные отсутсвуют.  Столица: " + capitalName + " с населением: отсутсвуют.");
        }
        else if(population == 0) {
            System.out.println("Название страны: " + name + "; Площадь: " + square + "; Население: данные отсутсвуют.  Столица: " + capitalName  + " с населением:" + capitalPopulation + ".");
        }
        else if(capitalPopulation == 0) {
            System.out.println("Название страны: " + name + "; Площадь: " + square + "; Население: " + population + ". Столица: " + capitalName  + " с населением: данные отсутсвуют.");
        }
        else {
            System.out.println("Название страны: " + name + "; Площадь: " + square + "; Население: " + population + ". Столица: " + capitalName  + " c населением: " + capitalPopulation + ".");
        }
        
    }
           
  
    public static void printAll(Country[] countries) {
        for(Country country : countries)
            country.print();
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

