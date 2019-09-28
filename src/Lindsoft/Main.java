package Lindsoft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlanetList listOfPlanets = new PlanetList("Discovered by TESS");

        String tempString = "";
        String tempRa = "";
        String tempDec = "";
        int counter = 0;

            try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("planetsfoundbytess.txt")))) {
                scanner.useDelimiter(",");
                while(scanner.hasNextLine())
                {
                    tempString = scanner.next();
                    tempRa = scanner.next();
                    tempDec = scanner.next();
                    Planet tempPlanet = new Planet(tempString, tempRa, tempDec);
                    listOfPlanets.addPlanet(tempString, tempPlanet);
                    scanner.nextLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        tempString = listOfPlanets.toString();
        System.out.println(tempString);



    }
}
