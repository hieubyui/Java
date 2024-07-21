
// class that does nothing but storing methods to print out every part of the story
    public class Story {

        public static void printIntro(){
            GameLogic.clearConsole();

            GameLogic.printHeading("Intro");

            System.out.println("A rooster call wakes you up from your sleep...\nOutside, you hear the voices of village folk and children playing in the fields. Off in the distance you see a castle that stretches above the clouds.");
            System.out.println("You see a cloud of dust growing in the distance. In the dust, you make up a banner, and multiple horses being ridden by armored knights.");
            System.out.println("...");
            System.out.println("\"Hear yee! Hear yee! A royal decree has been called by the King. To prepare for the grand tournament, each village must set fourth a representative to fight to the death.\"");
            GameLogic.enterAnythingToContinue();
            System.out.println("");
        }
        
        public static void printAct1(){
            GameLogic.clearConsole();

            GameLogic.printHeading("Act 1");

            System.out.println("The village folk corral to discuss. After a moment of whispering and talking, the group diverge to reveal a small figure in the middle. Looking closer, you see the figure turn into a frail child. It dawns a brown, desitute reminant of a tunic.");
            System.out.println("You step forward, feeling a mix of dread and determination. The frail child, barely older than you, looks terrified, eyes wide and pleading. The village elder steps forward, his face lined with age and sorrow.\r\n" + //
                                "\r\n" + //
                                "\"We must choose wisely,\" he says, voice trembling. \"Our village's future depends on it.\"\r\n" + //
                                "\r\n" + //
                                "Before anyone can react, you raise your hand. \"I will go,\" you declare, your voice steady despite the fear clawing at your heart.");
            GameLogic.enterAnythingToContinue();
        }

        public static void printAct2(){
            GameLogic.clearConsole();

            GameLogic.printHeading("Act 2");

            System.out.println("The road to the castle is long and arduous, but you push forward, driven by a sense of duty and the hope that you can make a difference. ");
            System.out.println("The arena is filled with spectators, the air thick with anticipation. You stand among the other representatives, heart pounding in your chest.");
            System.out.println("...");
            System.out.println("The battles are intense and brutal, each contestant giving their all. You fight with everything you have, your mind focused on your village and the promise you made to protect them.\r\n" + //
                                "\r\n" + //
                                "As the day progresses, the number of contestants dwindles. You find yourself in the final round, facing a towering warrior from a neighboring village. The crowd roars as you step into the ring, your body aching but your spirit unbroken.");
            GameLogic.enterAnythingToContinue();
        }

        public static void printAct3(){
            GameLogic.clearConsole();

            GameLogic.printHeading("Act 3");

            System.out.println("The King descends from the balcony, approaching you with a solemn expression. \"You have proven yourself a true warrior; Hear, I grant your village exemption from future's tournaments and you a blade - Blackfire, forged by our royal blacksmith.\" he says, his voice filled with genuine respect. \"Your village should be proud.\"\r\n" + //
                                "\r\n" + //
                                "You bow your head, feeling a mixture of pride and humility. \"Thank you, Your Majesty,\" you reply.\r\n" + //
                                "\r\n");
            GameLogic.enterAnythingToContinue();
        }

        public static void printAct4(){
            GameLogic.clearConsole();

            GameLogic.printHeading("Act 4");

            System.out.println("You travel on the road back to Walkeen's Rest. The village can be seen in the distance. You notice a figure creep towards the road. The figure seems to be a person grown, wearing a white dress. You gesture your ride to go faster towards the running girl. The rider slaps his stallions with reckless abandon.");
            System.out.println("Nearing closer the girl, you hop off your steed and run up to the girl.");
            System.out.println("\"It's me, don't you remember?\", the girl asks.");
            System.out.println("You realize she must have been the girl you replaced when you volunteered in her place. Her kept hair and dress made her unrecognizable from the last time you saw her.");
            System.out.println("*THUCK* *THUNK*\n 2 arrows appear in the dirt, inches away from your feet. Horses neigh and stomp behing you. You are being ambushed.");
            System.out.println("\nYou draw your Blackfire sword and shield the girl with your body. Bandits, arrows, and cutthroats charge at you, aiming for your chest, they want your sword and will stop at nothing to get it.");
            System.out.println("You cut the first one down, a bandit wearing homely clothes, and use him as a shield for the arrows. Your experience at the colosseum outmatches theirs. It seemed like they were moving in slow motion. You cut 3 more down before they surrender and retreat. ");
            System.out.println("\nThe sun is setting, it's fiery glow basks your chest. It has been a long day, it is time to head home. You get on the carriage and help her up. The rider snaps the horse to a simmering pace.");
            GameLogic.enterAnythingToContinue();
        }

        public static void printEnd(){
            GameLogic.clearConsole();

            GameLogic.printHeading("Ending");

            System.out.println(
                                "The village celebrates your victory, and for the first time in a long while, there is hope in the air. You have not only secured their future but also inspired them to believe in the strength and courage within themselves.\r\n" + //
                                "\r\n" + //
                                "And so, your journey ends, but the legacy of your bravery will live on, a testament to the power of selflessness and determination.");

            System.out.println("\nThe end.");
        
        }

        
    }


    