import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;


    //Story ELements
    public static int place = 0, act = 1;
    public static String[] places = {"Walkeen's Rest","Village Town Center","Hillsboro Colosseum", "The Throne Room", "Road to Walkeen's Rest"};

    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;
        
        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer.");
            }
        }while(input < 1 || input > userChoices);
        return input;
    }

    //method to start the game
    public static void startGame(){
        boolean nameSet = false;
        String name;

        //print title screen
        clearConsole();
        System.out.println("Welcome to my game!");
        System.out.println("\nCreated by Hieu Ngo");
        enterAnythingToContinue();

        //getting player name
        do{
            clearConsole();
            System.out.println("What is your name?");
            name = scanner.next();
            nameSet = true;
        }while(!nameSet);

        //print story intro
        Story.printIntro();
        
        //create new player object using name
        player = new Player(name);

        //print first story act
        // Story.printAct1();

        //before starting game loop, set isRunning to true
        isRunning = true;

        //start game loop
        gameLoop();
    }

    //method that changes the game's act 
    public static void checkAct(){
        if(act == 1){
            act = 2;
            place = 1;

            Story.printAct1();

        }else if(act == 2){
            act = 3;
            place = 2;
            
            Story.printAct2();

        }else if(act == 3){
            act = 4;
            place = 3;

            Story.printAct3();

        }else if(act == 4){
            act = 5;
            place = 4;

            Story.printAct4();

        }else if(act == 5){
            Story.printEnd();
            isRunning = false;
        }

    }

    //method to give the right story act given our current position in act
    public static void continueJourney(){
        checkAct();
    }

    public static void characterInfo(){
        clearConsole();
        System.out.println("CHARACTER INFO");
        System.out.println("Your name is: " + player.name);
        System.out.println("\nYou are at "+ places[place]);
        enterAnythingToContinue();
    }

    public static void printMenu(){
        clearConsole();
        // printHeading(places[place]);
        System.out.println("MENU");
        // System.out.println("Choose an action:");
        // System.out.println("(1) Continue on your journey");
        // System.out.println("(2) Character Info");
        // System.out.println("(3) Exit Game");

    }

    //main game loop
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("Please press (1) to continue, (2) for character sheet, or anything else to quit.", 3);
            if(input == 1)
                continueJourney();
            else if (input == 2)
                characterInfo();
            else
                isRunning = false;
            }
    }
    
    //method to print a seperator with length n
    public static void printSeperator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //method to print a heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
        System.out.println();
    }

    //method to simulate clearing the console
    public static void clearConsole(){
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    //method to stop the game until the user enters anything
    public static void enterAnythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }


}