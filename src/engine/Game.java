package engine;

import engine.classes.Warrior;
import engine.race.Human;
import engine.race.Race;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private boolean gameIsRunning;
    private boolean activeBattle = false;

    ArrayList partyList = new ArrayList();
    Scanner input = new Scanner(System.in);
    String userInput;
    public Game(){
        gameIsRunning = true;
        intializeGameState();
    }

    private void intializeGameState() {
        while(gameIsRunning){

            System.out.println("Hello and welcome to RPG Game: ");

            if(!activeBattle){
                System.out.println("Currently out of battle");
            }

        }
    }


    private void newGame(){

        createRace();

    }



    private void loadGame(){

    }
    private void createRace(){
        System.out.println("Choose a race from the following list:");
        System.out.println("1. Human");
        System.out.println("2. Orc");
        System.out.println("3. Elf");
        System.out.print("Enter the number corresponding to the race: ");
        userInput = input.nextLine();

        switch (userInput){
            case "1":
                System.out.print("Enter a name: ");
                userInput = input.nextLine();
                Human human = new Human(userInput, "Test description");
                createClass(human);
                break;
            case "2":
                break;

            case "3":
                break;

            default:
                System.out.println("Please make sure you enter a numerical value (Ex. 1 or 2)");
        }
    }
    private void createClass(Race race) {
        System.out.println("Choose a class to play as: ");
        System.out.println("1. Warrior");
        System.out.println("2. Archer");
        System.out.println("3. Healer");
        System.out.print("Enter the number corresponding to the class: ");
        userInput = input.nextLine();

        switch (userInput){
            case "1":
                System.out.print("Enter a name: ");
                userInput = input.nextLine();
                Warrior warrior = new Warrior(race.getName(), 100, 20, race);

                break;
            case "2":
                break;

            case "3":
                break;

            default:
                System.out.println("Please make sure you enter a numerical value (Ex. 1 or 2)");
        }
    }
}
