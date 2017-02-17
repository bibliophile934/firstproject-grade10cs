//Ruju Jambusaria
//April 1st, 2014
//Project 1: RPG

public class trappedintartarus
{
    public static void main (String args[])
    {
        new trappedintartarus ();
    }


    public trappedintartarus ()  // CONSTRUCTOR
    {
        char playAgain = 'y';
        while (playAgain == 'y')
        {
            char intro = IBIO.inputChar ("Would you like the introduction (y/n)? ");
            if (intro == 'y')
                Intro1 ();
            int p = 0;
            printSlow ("You must choose a secret code so that if you get lost, you can prove your identity to Annabeth.");
            printSlow ("It can be anything, just make sure you remember it!");
            String secret = IBIO.inputString ("Enter a password: ");
            Intro2 ();
            p = scj (p);
            pointssofar (p);
            p = afterempousai (p); // first multiple choice - has the chance to earn points
            p = beforebob (p, secret); // second multiple choice. If the user chooses to lie, they die.
            playAgain = IBIO.inputChar ("Play again? (y/n) >> ");
        }
        System.out.println ("Thank you for playing Heroes of Olympus: Trapped in Tartarus!");
        System.out.println ("Have a good day.");
    } //END OF CONSTRUCTOR


    public void pointssofar (int p)  //gives updates on points when called
    {
        if (p == 1)
            System.out.println ("You have earned 1 point.");
        else
            System.out.println ("You have earned " + p + " points.");
    }


    public void printSlow (String s)
    {
        for (int i = 0 ; i < s.length () ; i++)
        {
            System.out.print ("" + s.charAt (i));
            try
            {
                Thread.sleep (20);
            }
            catch (InterruptedException m)
            {
                ;
            }
        }
        System.out.println ();
    }


    public void confirmPass (String secret)  //password method
    {
        String guess = IBIO.inputString ("Enter your secret code >> ");
        while (!guess.equals (secret))
        {
            System.out.println ("\tSorry please try again.");
            guess = IBIO.inputString ("Secret code >> ");
        }
        System.out.println ("Correct! You have successfully confirmed your identity.");
    }


    public void Intro1 ()  //Intro (first half)
    {
        title ();
        printSlow ("You play a demigod who goes by the name of Percy Jackson, son of Poseidon (god of the sea) and a hero of Olympus!");
        printSlow ("");
        printSlow ("Recently, you have fallen into Tartarus, with Annabeth Chase, daughter of Athena (goddess of wisdom).");
        printSlow ("Just a normal day as a half-blood, right? ");
        printSlow ("Wrong.");
        printSlow ("");
        printSlow ("Tartarus is the lowest level of the Underworld where monsters go when they die to regenerate. ");
        printSlow ("It is described as a dark, gloomy pit and it is beyond dangerous for you to be here.");
        printSlow ("Your only chance of getting out of this horrible place is to get to the Doors of Death.");
    }


    public void title ()  // ascii words - Heroes of Olympus: Trapped in Tartarus
    {
        printSlow ("Welcome to ");
        System.out.println ("                                         __     ___ _                                    ");
        System.out.println ("  /\\  /\\___ _ __ ___   ___  ___    ___  / _|   /___\\ |_   _ _ __ ___  _ __  _   _ ___ _  ");
        System.out.println (" / /_/ / _ \\ '__/ _ \\ / _ \\/ __|  / _ \\| |_   //  // | | | | '_ ` _ \\| '_ \\| | | / __(_) ");
        System.out.println ("/ __  /  __/ | | (_) |  __/\\__ \\ | (_) |  _| / \\_//| | |_| | | | | | | |_) | |_| \\__ \\_  ");
        System.out.println ("\\/ /_/ \\___|_|  \\___/ \\___||___/  \\___/|_|   \\___/ |_|\\__, |_| |_| |_| .__/ \\__,_|___(_) ");
        System.out.println ("                                                      |___/          |_|                 ");
        System.out.println ("");
        System.out.println ("");
        System.out.println (" _____                                _   _         _____           _                       ");
        System.out.println ("/__   \\_ __ __ _ _ __  _ __   ___  __| | (_)_ __   /__   \\__ _ _ __| |_ __ _ _ __ _   _ ___ ");
        System.out.println ("  / /\\/ '__/ _` | '_ \\| '_ \\ / _ \\/ _` | | | '_ \\    / /\\/ _` | '__| __/ _` | '__| | | / __|");
        System.out.println (" / /  | | | (_| | |_) | |_) |  __/ (_| | | | | | |  / / | (_| | |  | || (_| | |  | |_| \\__ \\");
        System.out.println (" \\/   |_|  \\__,_| .__/| .__/ \\___|\\__,_| |_|_| |_|  \\/   \\__,_|_|   \\__\\__,_|_|   \\__,_|___/");
        System.out.println ("                |_|   |_|                                                                   ");
    }



    public void Intro2 ()  // Intro (second half) - leads up to task 1
    {
        printSlow ("");
        printSlow ("You know the Doors are located in the heart of Tartarus, but you can only hope you are moving in the right direction.");
        printSlow ("There will definitely be monsters in your way.");
        printSlow ("You must destroy any monsters that try to prevent you from reaching the doors. \nEvery task you do will earn (or lose) you points.");
        printSlow ("It all depends on Poseidon's mood.");
        printSlow ("If you reach the end, your total number of points will decide what new powers Poseidon will give you.");
        printSlow ("");
        printSlow ("Tired and hungry, you start walking in a random direction when you suddenly see a group of Empousai. ");
        printSlow ("In their natural form, they have flaming hair and fangs (but they look human otherwise).");
        empousa ();
        printSlow ("");
        printSlow ("You overhear them say that they are going to the Doors of Death so you follow them. ");
        printSlow ("As you reach the bottom of a cliff, you realize that you have lost them.");
        printSlow ("");
        printSlow ("They jump out at you from behind a rock and surround you. ");
        printSlow ("You have been ambushed and must destroy them before they eat you alive.");
        printSlow ("");
        printSlow ("You have 3 options:");
        printSlow ("1) Slash");
        printSlow ("2) Claw");
        printSlow ("3) Jump (on the empousa)");
        printSlow ("");
        printSlow ("Slash beats claw, claw beats jump, and jump beats slash. ");
        printSlow ("It's like a messed up, life threatening Tartarus version of rock, paper, scissors! ");
        printSlow ("You must destroy 3 monsters to get past and continue on your way to the Doors (Annabeth will destroy the rest).\n");
    }


    public void empousa ()  // ascii art of monster's head
    {
        System.out.println ("");
        System.out.println ("         .....,.7.... ~.. .....         ");
        System.out.println ("         ... ..::,..,=....~......       ");
        System.out.println ("          .,....7....?....:~......      ");
        System.out.println ("       ....I.....+~...+:~...+..... ..   ");
        System.out.println ("..........,$.....+~.....=7.,:..,?~....  ");
        System.out.println ("..........,7:...,:+~....,+.,=..Z:~....  ");
        System.out.println ("..........,+O,.,.II.....,,.+$.,$,....,  ");
        System.out.println ("......~.....I:.,.,.....,::.I~.,=,.......");
        System.out.println ("............Z+,,,:=?Z?::7:,.I,.+~.......");
        System.out.println ("......=....+Z~,::,I+::~O?,.~,,,......,, ");
        System.out.println (".......+,.:I::=:,=Z:~?$~,...~::,........");
        System.out.println ("....,,:I...:$+I=.~I~:,~,...:=~,Z....,...");
        System.out.println ("......~:.,.=I=I=.,~:II,,..:?~+Z7....=...");
        System.out.println ("....?==I,.?7=:=I,7I++=I?ZZ?~++Z....7?...");
        System.out.println (".....II:+..,::~+:=I+:~~?7ZO+~Z?,=~......");
        System.out.println ("....,.,$$,.,+~=?+$?7=:,I$$ZZ~7O+:+?.....");
        System.out.println ("....,,+:I$$7=~=7IZ++?~~$O$=?~+I~O=?7....");
        System.out.println (".....II+ZZ7~~~?77$+++~~7O?Z+~+$=OO~+....");
        System.out.println ("....,::$IO7~=~+$$Z7=~~~O7$?+~7ZZ==..,...");
        System.out.println (".....,:I?ZZ7+?$77?7~~~?7?ZZI=$$+OZ......");
        System.out.println (".......=~?O$I??7Z77=~~II$$?$+Z7~7,,.....");
        System.out.println (".......D==ZZZ78$ZZI$II?$ZZIIII?=8+......");
        System.out.println (".....,IZ+~+?$Z7?ZZ$?777OZ=Z?Z7~+OI,.....");
        System.out.println (".....?Z$7I+8+Z,.:+ZZZZI::?I8ZZ=IO$~.,.. ");
        System.out.println (".......8$I7O~=ON?~~~~=~~??==I$7?+I....  ");
        System.out.println (".......,$8+8~=~=~DM+~?MI===~77?I:,....  ");
        System.out.println (" ........,IZ+MZ788:+:+:DOONMZ8I.......  ");
        System.out.println ("...........+88888D7:,:?8O8DZ8,........  ");
        System.out.println ("    ........:~=+==:~,~~====+..........  ");
        System.out.println ("        .. ..$=~,,7I$7I::=+$.........   ");
        System.out.println ("        .....=++~:,:~~~~:=$,..........  ");
        System.out.println ("        ......I$~$$DD?+=+$.... ..       ");
        System.out.println ("        ........+.:+$I~+$.....          ");
        System.out.println ("        .........7ZI+?D......           ");
        System.out.println ("        .....,..$=:,=~+.......  .       ");
        System.out.println ("     . ......:7I,,,=:::?M:...           ");
        System.out.println ("     ......$DO877?~,:+?IDOZ,,, .        ");
    }


    public int scj (int p)  //slash, claw, jump (constructor) - task 1
    {
        System.out.println ("Poseidon has decided that you will lose 1 point for every time the empousa wins.");
        System.out.println ("Your points will increase in some way every time you kill the monster.");
        //tPoint = 0;
        int uPoint = 0;
        int game = 1;
        while (uPoint < 3)
        {
            char user = userChoice ();
            System.out.println ("You have selected: " + user);
            char comp = compChoice ();
            System.out.println ("The empousa has selected: " + comp);
            char win = winner (user, comp);
            if (win == 'e')
            {
                System.out.println ("\n\tThe empousa has won this round, but you can still go on. You must try again.");
                p--;
                pointssofar (p);
            }
            else if (win == 'u')
            {
                uPoint++;
                System.out.println ("\n\tThe empousa has vaporized! You have been successful :)");
                if (p < 0)
                    p *= -1;
                else if (p == 0)
                    p += 2;
                else
                    p *= 2;
                pointssofar (p);
            }
            else
                System.out.println ("\n\tNothing has happened. The empousa made the same move as you. You must try again.");
            System.out.println ("\tTotal Empousai Killed: " + uPoint);
            System.out.println ("");
        }
        System.out.println ("You may continue on your quest to find the Doors of Death!");
        return p;
    }


    //slash, claw, jump
    public boolean isValid (String c)
    {
        if (c.equalsIgnoreCase ("slash") || c.equalsIgnoreCase ("s"))
            return true;
        else if (c.equalsIgnoreCase ("claw") || c.equalsIgnoreCase ("c"))
            return true;
        else if (c.equalsIgnoreCase ("jump") || c.equalsIgnoreCase ("j"))
            return true;
        else
            return false;
    }


    public char userChoice ()  // slash claw jump
    {
        String user = IBIO.inputString ("Choose either slash, claw, or jump >> ");
        while (!isValid (user))
        {
            System.out.println ("\tThat is invalid.");
            user = IBIO.inputString ("Choose either slash, claw, or jump >> ");
        }
        if (user.equalsIgnoreCase ("slash") || user.equalsIgnoreCase ("s"))
            return 's';
        else if (user.equalsIgnoreCase ("claw") || user.equalsIgnoreCase ("c"))
            return 'c';
        else
            return 'j';

        //print options: slash, claw, jump

        //Loop: if invalid input, error message + ask again
        //stopping condition is the isValid method
    }


    public char compChoice ()  // slash claw jump
    {
        int comp = ((int) (Math.random () * 3)) + 1;
        if (comp == 1)
            return 's';
        else if (comp == 2)
            return 'c';
        else
            return 'j';
    }


    public char winner (char comp, char user)  // slash claw jump
    {
        if (comp == 's' && user == 's' || comp == 'c' && user == 'c' || comp == 'j' && user == 'j')
            return 'b';
        else if (user == 's' && comp == 'j')
            return 'u';
        else if (user == 'j' && comp == 'c')
            return 'u';
        else if (user == 'c' && comp == 's')
            return 'u';
        else
            return 'e';
    } //jump, slash, claw - end


    public int afterempousai (int p)  // after task 1 (slash, claw, jump) & first multiple choice
    {
        System.out.println ("You have beat the empousai, but your quest is not yet finished. You don't know where to go now.");
        printSlow ("Annabeth says, \"Percy, let's just keep going in the direction the empousai were going in. That's our best chance.\"");
        System.out.println ("Choose what to say:");
        printSlow ("\ta) You're right, Annabeth. We should keep going.");
        printSlow ("\tb) Maybe we should look around for something that might help us.");
        char afterempch = IBIO.inputChar ("Enter your choice (a/b) >> ");
        while (afterempch != 'a' && afterempch != 'b' && afterempch != 'A' && afterempch != 'B')
            afterempch = IBIO.inputChar ("\tThat is invalid. Please choose a or b >> ");
        if (afterempch == 'b' || afterempch == 'B')
        {
            printSlow ("Annabeth says, \"Alright.\"");
            System.out.println ("You look around and see that one of the empousai left behind a dagger.");
            dagger ();
            System.out.println ("Well, it's yours now, if you choose to keep it. It may help you along the way.");
            System.out.println ("Your options:");
            printSlow ("\ta) Keep the dagger.");
            printSlow ("\tb) Leave the dagger behind.");
            char sword = IBIO.inputChar ("Enter your choice (a/b) >> ");
            while (sword != 'a' && sword != 'A' && sword == 'b' && sword == 'B')
                sword = IBIO.inputChar ("\tThat is invalid. Enter a or b >> ");
            if (sword == 'a' || sword == 'A')
            {
                printSlow ("You have chosen to take the dagger along with you and Poseidon thinks that you have made a wise decision.");
                printSlow ("He has granted you 10 more points.");
                p += 10;
                pointssofar (p);
            }
        }
        return p;
    }


    public void dagger ()  // ascii art of a dagger
    {
        System.out.println ("");
        System.out.println ("                  /\\");
        System.out.println ("                 //\\\\");
        System.out.println ("                //__\\\\");
        System.out.println ("               //____\\\\");
        System.out.println ("               \\\\____//");
        System.out.println ("                \\\\__//");
        System.out.println ("                [|__|]");
        System.out.println ("                [|__|]");
        System.out.println ("                [|__|]");
        System.out.println ("                [|__|]");
        System.out.println ("                [|__|]");
        System.out.println ("     /)         [|__|]        (\\");
        System.out.println ("    //\\_________[|__|]________/\\\\");
        System.out.println ("    ))__________||__||_________((");
        System.out.println ("   <_/         [  \\/  ]        \\_>");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               || || ||");
        System.out.println ("               \\\\ || //");
        System.out.println ("                \\\\||//");
        System.out.println ("                 \\\\//");
        System.out.println ("             ____-\\/-____");
        System.out.println ("                 -__-");
        System.out.println ("                /    \\  ");
    }


    public int beforebob (int p, String secret)  // intro to task 2. The user goes on to task 3 if they choose to tell the truth
    {

        System.out.println ("\nYou continue on your way, and realize that the ground is vibrating, as if an earthquake is on its way.");
        System.out.println ("You turn around and see a huge man with silver hair wearing a janitor's uniform and carrying a huge broom coming towards you.");
        System.out.println ("He is a Titan, you realize with a jolt.\nHe is the same Titan that you threw into the river Lethe.");
        System.out.println ("He lost his memory because of that.");
        System.out.println ("His original name was Iapetus, but you renamed him Bob. Yes, Bob.");
        char callBob = IBIO.inputChar ("\nDo you call out to Bob (y/n)? ");
        while (callBob != 'y' && callBob != 'n')
            callBob = IBIO.inputChar ("That input is invalid. Do you call out to Bob? (y/n) >> ");
        if (callBob == 'y')
            printSlow ("\nAs the man approaches you, you call out to him, \"Hey, Bob! It's nice to see you again!\"");
        else
            printSlow ("Annabeth recognizes Bob and calls him over.");
        printSlow ("Bob nods at you and says, \"Bob heard you fighting with the empousai and came down to help, but it looks like you are okay.\"");
        printSlow ("\"May Bob join you on your expedition to ... where exactly are you going? Bob would like to help.\" Bob questioned.");
        System.out.println ("You can either tell Bob where you are going or keep it a secret.");
        printSlow ("\ta) Tell Bob about where you are going.");
        printSlow ("\tb) Lie to Bob.");
        char tellbob = IBIO.inputChar ("Enter a/b >> ");
        while (tellbob != 'a' && tellbob != 'b')
            tellbob = IBIO.inputChar ("\tThat is invalid. Please enter a or b to make your decision >> ");
        if (tellbob == 'b')
        {
            System.out.println ("You lied to Bob and he is no longer with you.");
            System.out.println ("You have run into some vicious flesh-eating monsters.");
            death ();
        }
        else //ensures that after death method, it does not go back to this method
        {
            System.out.println ("You tell Bob about your quest to find the Doors of Death.");
            printSlow ("He nods thoughtfully and says, \"But you do not know where the Doors are. Bob will help you! Bob knows where they are!\"");
            System.out.println ("You gratefully accept Bob's help and continue on your way. It's a good thing you told him the truth.");
            printSlow ("You walk in silence for a while when Bob suddenly says, \"Percy, Bob has lost track of where he is going.\"");
            printSlow ("\"Bob needs you to answer some math questions so that Bob knows where he is. Bob cannot do math.");
            printSlow ("\"Bob needs you to answer 5 questions correctly,\" he says.\n");
            math (p, secret); //goes on to task 3 if successful in task 2
        }
        return p;
    }


    public void math (int p, String secret)  // task 2
    {
        System.out.println ("Poseidon has decided to grant you points because you are helping Bob.");
        System.out.println ("For every correct answer, you will earn 7 points.");
        System.out.println ("For every incorrect answer, you will lose a point.");
        System.out.println ("You have 2 tries to answer each question.");
        System.out.println ("If you answer too many questiosn wrong, Bob will become confused.");
        int points = 0;
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        while (count <= 4 && p >= 0) // less than 0 points automatically quits the loop & sends user to death
        {
            num1 = ((int) (Math.random () * 20)) + 1;
            num2 = ((int) (Math.random () * 20)) + 1;
            int ans = IBIO.inputInt ("\nAnswer this question: " + num1 + " + " + num2 + " = ");
            while (ans <= 0)
                ans = IBIO.inputInt ("That is invalid. Answer the following question: " + num1 + " + " + num2 + " = ");
            if (ans == (num1 + num2))
            {
                System.out.println ("\tAnnabeth says, \"That is correct!\"");
                count++;
                p += 7;
            }
            else
            {
                System.out.println ("\tAnnabeth says, \"That doesn't sound right. Try once more.\"");
                p--;
                ans = IBIO.inputInt ("\n" + num1 + " + " + num2 + " = ");
                if (ans == (num1 + num2))
                {
                    System.out.println ("\tAnnabeth says, \"That is correct! Great job.\"");
                    count++;
                    p += 5;
                }
                else
                {
                    System.out.println ("\tAnnabeth says, \"Sorry, but " + (num1 + num2) + " is the correct answer.\"");
                    p--;
                }
            }

        }
        if (p < 0)
        {
            System.out.println ("You have answered too many questions wrong. You confused Bob and got lost. You ran into some vicious flesh-eating monsters.");
            System.out.println ("Your bones now lie at the bottom of a pit.");
            death ();
        }
        else
        {
            System.out.println ("\nHooray! You've correctly solved 5 of Bob's questions!");
            pointssofar (p);
            afterbob ();
            oracle (p, secret);
        }
    }


    public void afterbob ()  // intro to task 3
    {
        printSlow ("\nAs you continue on your way, you come across a shrine of Hermes, the messenger god.");
        printSlow ("Bob assures you that it will be safe and you trust him.");
        printSlow ("You remember that back at Camp Half-Blood, shrines like these could be found in the dining hall.");
        printSlow ("Demigods use these to make sacrifices to their parents.");
        printSlow ("\nAnnabeth asks, \"Is this where the sacrifices to Hermes end up?\" as if she was reading your thoughts.");
        printSlow ("\"Percy! Try writing Connor Stoll a message!\" she says excitedly.");
        printSlow ("Connor Stoll is a son of Hermes and is likely to receive the message you send him.");
        printSlow ("You uncap Riptide, your faithful pen/sword and realize that you cannot write with a sword.");
        printSlow ("Every time you take its cap off, it transforms into a sword.");
        printSlow ("Annabeth suggests, \"Percy, what would happen if you put the pen lid on the end of Riptide?\"");
        printSlow ("\nYou try this and it works!");
        printSlow ("Annabeth says, \"We should ask the Connor to take it to the Oracle of Delphi.\"");
        printSlow ("\"We can ask her any question we want!\"");
        printSlow ("You agree to Annabeth's suggestion and start writing out a message.");
    }


    public void oracle (int p, String secret)  // tasks 3 (ask a question) & 4 (unscrambling)
    {
        System.out.println ("You have the chance to ask the Oracle of Delphi a yes/no question.");
        String ques = IBIO.inputString ("Enter your question >> ");
        while (ques.equals ("") || ques.equals (" "))
            ques = IBIO.inputString ("You must ask a question >> ");
        int num = ((int) (Math.random () * 4)) + 1;
        String msg = "";
        String unscrambled = "";
        if (num == 1)
        {
            msg = "I dn'to tihnk os.";
            unscrambled = "I don't think so.";
        }
        else if (num == 2)
        {
            msg = ("n'Dot cotun no ti.");
            unscrambled = "Don't count on it.";
        }
        else if (num == 3)
        {
            msg = ("yM srocues yas sey.");
            unscrambled = "My sources say yes.";
        }
        else
        {
            msg = ("tI lliw penhap.");
            unscrambled = "It will happen.";
        }

        //start of task 4
        System.out.println ("\nThe oracle has sent an unscrambled message as a backup in case the message was intercepted.");
        System.out.println ("Poseidon has decided that if you guess correctly, your points will double.");
        System.out.println ("Every time you guess incorrectly, your points will be cut in half and you will lose 1 additional point.");
        System.out.println ("Be careful with your guesses. If you have less than 0 points at the end, the parchment will burn up.");
        System.out.println ("You must unscramble the message (with the period - Annabeth values punctuation a lot):");
        printSlow (msg);

        String oracleguess = IBIO.inputString ("\nYour guess >> ");
        int countguess = 1;
        while (!oracleguess.equalsIgnoreCase (unscrambled) && p >= 0)
        {
            printSlow ("\tAnnabeth says, \"That doesn't sound right.\"");
            System.out.println ("\tIt's not correct if there is no period at the end.");
            if (p % 2 == 0)
                p /= 2;
            else
                p -= 5;
            p--;
            printSlow (msg);
            oracleguess = IBIO.inputString ("Try again >> ");
            countguess++;
        }
        if (p < 0)
            death ();
        else
        {
            printSlow ("\tAnnabeth says, \"Great job! I think you unscrambled it correctly!\"");
            p *= 2;
            System.out.println ("Remembering that the Oracle's words are only a guide and that they may not actually mean anything, you walk on in silence.");
            pointssofar (p);
            beforearai ();
            p = arai (p, secret);
        }
    }


    public void beforearai ()  // intro to task 5
    {
        printSlow ("You are walking through a dark forest when you realize that you are being watched.");
        printSlow ("Slowly, you see some winged monsters coming out of the tree branches.");
        araipic ();
        System.out.println ("There are an awful lot of them.");
        printSlow ("As if all of them were talking in unison, they hiss, \"We are the arai.\"");
        printSlow ("Annabeth says, \"I remember reading about those at camp! If you kill one, it will curse you. If you don't kill it, it will kill you.\"");
        System.out.println ("Great. Just great. So either way, there isn't much benefit.");
        printSlow ("You ask Annabeth, \"So is there a way to kill them without being cursed?\"");
        printSlow ("She pauses for a moment and says, \"Yes, but we have to guess a certain number.");
        printSlow ("If we stab them it number of times, it will die without cursing us.\"");
        System.out.println ("\"Great - how are you supposed to guess that?\" you say.");
        printSlow ("She grins, \"Don't worry, I'm an expert at this. This is exactly what I trained for!\"");
    }


    public void araipic ()  // ascii art of a winged monster (arai)
    {
        System.out.println ("");
        System.out.println ("                                            ... . .?Z+..    ");
        System.out.println ("                                          NDD88DDDDNNNNNOO. ");
        System.out.println ("                                     7DNNND8O8OOOOOO88O8  . ");
        System.out.println ("                                    ,DNND$O8D8ZZII????+     ");
        System.out.println ("            .D                     .OZNONNDD8OZ$??ZZZI~     ");
        System.out.println ("      .+$OD$Z8                     8D$NNZNDNND88$$77?~?.    ");
        System.out.println ("      +IDD8DD8D                   .O8ZON8ZDNDND8DD87Z       ");
        System.out.println ("    I$O888NODD8Z                  88OZ$D88OINNDD8DN:        ");
        System.out.println ("  $II7$Z8D8O8OOO~                7DD8OO8DDOZ7DDNDNN         ");
        System.out.println (".$?++IZZZ8$ZO8OZO          .    .ND8O8Z8OD8OZINDDM          ");
        System.out.println ("+==??IZ$II7ZZOOOO8.  .+.?OD 8.NMNND8OOO888DOO$INN.          ");
        System.out.println (" ~=++?$+I+$$OOODDOZ..DMNNDO8OD8NNZ8OZ$DDDOD8DD$IN           ");
        System.out.println (" :?+=I?7=II7OOO8DZ7$DDMMDDOZONMDO8D8O$MMND8DDDO$D           ");
        System.out.println (" =?~=+77?I77Z8ZD8N=:?+~?=I7Z$8NDIN8MNNNNND88ODDO+           ");
        System.out.println (" ?I~=?7==IZ$OOZ88NNNZ?$=$OO8OZZND8NM8?7777$.    $           ");
        System.out.println (" ?   .Z:?$7$ZZ888D8DNIIDIO$7ZZ7$ZO8NDO7~7$?~77              ");
        System.out.println ("      $~I$$$$O8DMDN$Z?O?8OD8IONN8DONMN.+ ,O+.++.            ");
        System.out.println ("      .=Z$OZZZ88Z8N$NN?ZI+?I$8Z8DDN=M     ?.+ ..            ");
        System.out.println ("      .=88888OD87MZDDD8ODZ88+78N88DNN:     $+..             ");
        System.out.println ("       +    $DD+IZD8OZ$ODD7II?IZ8$OZZI+                     ");
        System.out.println ("              8?NOD       DDO$I?ZDIOO$,?.                   ");
        System.out.println ("             ZZZN8D        .$7$7+:$OO877 ,.                 ");
        System.out.println ("        .$.$I7OO .I7        ?78MNNNMMNOI,...                ");
        System.out.println ("        .8.$.. .            OMNNZODNMNM=:....               ");
        System.out.println ("          ~ +  +           O$DMIZD8D8                       ");
        System.out.println ("                          .?8ZZ8NDMD                        ");
        System.out.println ("                          7DOZN8D                           ");
        System.out.println ("                         $OZ$ZMN                            ");
        System.out.println ("                         DNMZ78O                            ");
        System.out.println ("                         N8M78DO.                           ");
        System.out.println ("                          .MMNMDD?. ..                      ");
        System.out.println ("                             87O~8Z$D8+                     ");
        System.out.println ("                            .88ZD.D$ZO.                     ");
        System.out.println ("                             O8ZZ. OZO                      ");
        System.out.println ("                             O8Z7D8DM");
    }


    public int arai (int p, String secret)  // task 5
    {
        System.out.println ("\nThe arai you are facing have to be stabbed anywhere between 1 and 100 times.");
        System.out.println ("Try to guess the number! Annabeth will help you.\nGood luck!");
        System.out.println ("For every correct answer, Poseidon has decided to double your points.");
        System.out.println ("Poseidon knows how hard it is to guess an arai's number in one try, so he will be merciful.");
        System.out.println ("For every incorrect guess, you will lose only 1 point.");
        int countnum = 0;
        while (countnum <= 4)
        {
            int num = ((int) (Math.random () * 100)) + 1;
            int gotit = 1;
            int numguess = IBIO.inputInt ("\nGuess #" + gotit + " >> ");
            while (numguess != num)
            {
                if (numguess > num)
                {
                    System.out.println ("Annabeth says, \"Too high. Try again!\"");
                    gotit++;
                    p--;
                    if (p < 0)
                        death ();
                }
                else
                {
                    System.out.println ("Annabeth says, \"Too low. Try again!\"");
                    gotit++;
                    p--;
                }
                numguess = IBIO.inputInt ("\nGuess #" + gotit + " >> ");
            }
            countnum++;
            System.out.println ("\nThe Arai has crumbled to dust!");
            System.out.println ("You have killed " + countnum + " arai.");
            if (p > 0)
                p *= 2;
            else
                p++;
            if (countnum != 5)
                System.out.println ("Only " + (5 - countnum) + " to go!");
            else
            {
                System.out.println ("You have killed enough arai to get past and continue your quest!");
                pointssofar (p);
                System.out.println ("\nYou lost Annabeth while you were fighting the Arai. You can still hear her voice, but it is faint.");
                System.out.println ("You see her and rush to her side.");
                System.out.println ("Please enter your secret code so that Annabeth will know that you are truly you. ");
                System.out.println ("Unless you're not you, that is ...");
                confirmPass (secret);
                System.out.println ("You can continue on your way.");
                nimintro ();
                nim (p);
            }
        }
        return p;
    }


    public void nimintro ()  // intro to task 6
    {
        printSlow ("You have come across a centaur.");
        centaur ();
        char c = IBIO.inputChar ("Enter anything to continue: ");
        System.out.println ("He stops you and challenges you to the mighty Game of Nim.");
        System.out.println ("If you say no, he will kill you.");
        System.out.println ("He promises that he won't do anything if you play with him.");
        System.out.println ("He says that it gets very lonely in Tartarus and he never has anyone to play with.");
        System.out.println ("Hesitantly, you agree. After all, you have Bob to save you if you need to be saved.");
    }


    public void centaur ()
    {
        System.out.println ("");
        System.out.println ("                             =*===");
        System.out.println ("                           $$- - $$$");
        System.out.println ("                           $ <    D$$");
        System.out.println ("                           $ -   $$$");
        System.out.println ("                     ,     $$$$  |");
        System.out.println ("                    ///; ,---' _ |----.");
        System.out.println ("                     \\ )(           /  )");
        System.out.println ("                     | \\/ \\.   '  _.|  \\              $");
        System.out.println ("                     |  \\ /(   /    /\\_ \\          $$$$$");
        System.out.println ("                      \\ /  (       / /  )         $$$ $$$");
        System.out.println ("                           (  ,   /_/ ,`_,-----.,$$  $$$");
        System.out.println ("                           |   <----|  \\---##     \\   $$");
        System.out.println ("                           /____/      \\\\\\         |    $");
        System.out.println ("                          '                        |");
        System.out.println ("                          |                 \\      /");
        System.out.println ("                          /  \\_|    /______,/     /");
        System.out.println ("                         /   / |   /    |   |    /");
        System.out.println ("                        (   /--|  /.     \\  (\\  (_");
        System.out.println ("                         `----,( ( _\\     \\ / / ,/");
        System.out.println ("                               | /        /,_/,/");
        System.out.println ("                              _|/        / / (");
        System.out.println ("                             / (        ^-/, |");
        System.out.println ("                            /, |          ^-    ");
        System.out.println ("                            ^-");
    }


    public void nim (int p)  //task 6 (game of nim)
    {
        System.out.println ("The centaur, whose name is Akakios, explains how to play the game:");
        System.out.println ("\nThere are 15 stones in the pile. You take turns picking up stones from the pile.");
        System.out.println ("On each turn, you can take one or two stones.");
        System.out.println ("The player who takes the last stone loses.");
        System.out.println ("Poseidon has decided that if you win, your points will be tripled.");
        System.out.println ("If you lose, you will lose half of your points and lose an additional 5.");
        {
            int left = 15;
            int player = 2;
            String name1 = "Percy";
            String name2 = "Akakios";

            while (left > 0)
            {
                if (player == 1)
                    player = 2;
                else
                    player = 1;
                drawLeft (left);
                whoseturn (player, name1, name2);
                left = turn (left, player);
            }
            whosewon (player, name1, name2, p);
        }
        if (p < 0)
            death ();
        else
        {
            pointssofar (p);
            choice (p);
        }
    }


    public void drawLeft (int left)  //task 6
    {
        System.out.println (" ");
        System.out.println ("Stones Remaining: " + left);
        //loop to draw one star for each stone left
        for (int i = 0 ; i < left ; i++)
            System.out.print ("*");
    }


    public void whoseturn (int player, String name1, String name2)  //task 6
    { //if player is 1, it prints your turn (for the user)
        if (player == 1)
            System.out.println ("\nIt is your turn.");
        else
            System.out.println ("\nIt is " + name2 + "'s turn.");
    }


    public boolean isValid (int num, int left)  //task 6
    { //returns false if num is greater than left
        if (num > left)
            return false;
        //returns true if num is 1 or 2
        else if (num == 1 || num == 2)
            return true;
        //returns false otherwise
        else
            return false;
    }


    public int turn (int left, int player)  //task 6
    {
        int amt = 1;
        if (player == 1)
        {
            amt = IBIO.inputInt ("How many stones do you want to remove? ");
            while (!isValid (amt, left))
            {
                System.out.println ("\tThat amount is invalid. You may only enter 1 or 2.");
                amt = IBIO.inputInt ("How many stones do you want to remove? ");
            }
        }
        else
        {
            amt = ((int) (Math.random () * 2)) + 1;
            if (amt == 1)
                System.out.println ("Akakios has taken out 1 stone.");
            else
                System.out.println ("Akakios has taken out 2 stones.");
        }
        return (left - amt);
    }


    public int whosewon (int player, String name1, String name2, int p)  //task 6
    {
        if (player == 1)
        {
            System.out.println ("You have lost. " + name2 + " forced you to take the last stone.");
            if (p % 2 == 0)
                p /= 2;
            else
                p -= 15;
            p -= 5;
        }
        else
        {
            System.out.println (name2 + " has lost. You forced " + name2 + " to take the last stone.");
            p *= 3;
        }
        return p;
    }



    public void choice (int p)  // final multiple choice
    {
        System.out.println ("\nYou have defeated everything in your way without losing too many points!");
        System.out.println ("Congratulations!");
        System.out.println ("You may have completed all of your tasks, but the real challenge is up ahead.");
        System.out.println ("You will come across a crossroads and must make a choice that will decide your fate.");
        System.out.println ("You finally reach the Doors of Death, but to your shock, you see a monster standing in front of them.");

        System.out.println ("\n\"No,\" says Bob, as if reading your thoughts. \"This is no monster. This is Tartarus himself.\"");
        System.out.println ("Bob suggests, \"Percy, you go through the Doors. Bob will distract Tartarus until you are through.\"");
        System.out.println ("You try to reason with Bob, but he will not allow you to sacrifice yourself when you have come so far.");

        System.out.println ("\nYou walk inside the Doors, but start having second thoughts.");
        System.out.println ("You hear Bob fighting with Tartarus and so badly want to go back and help.");
        System.out.println ("Do you go back and help or turn your back on your friend?");
        System.out.println ("Going back to help means certain death. You cannot fight Tartarus.");
        System.out.println ("Turning your back on Bob means living a life full of guilt.");
        System.out.println ("Make your choice.");

        printSlow ("a) Go back and help Bob.");
        printSlow ("b) Escape through the Doors.");
        char helpbob = IBIO.inputChar ("Enter a/b >> ");
        while (helpbob != 'a' && helpbob != 'b')
            helpbob = IBIO.inputChar ("\tThat is invalid. Choose from a or b >> ");

        if (helpbob == 'a')
            death ();
        else
            trophy (p);
    }


    public void trophy (int p)  //prize at the end of the game
    {
        printSlow ("You have successfully completed your quest.");
        printSlow ("Congratulations.");
        winpic ();
        pointssofar (p);
        if (p > 20000)
            printSlow ("Poseidon has made you a god. You are now the god of waves. Congratulations! This is the highest honor you can receive.");
        else if (p > 10000)
            printSlow ("Poseidon has given you powers to control the waves that are equal to his.");
        else if (p > 7000)
            printSlow ("Poseidon has given you the power to create water at will.");
        else if (p > 4000)
            printSlow ("Poseidon has given you more control over understanding horses and sea creatures.");
        else if (p > 1000)
            printSlow ("Poseidon has given you the power to talk to horses.");
        else
            printSlow ("Poseidon has given you the power to control water from a further distance.");

        printSlow ("However, you sacrificed your friends in the process.");
        printSlow ("You will forever live with the guilt of letting your friend die for you.");
    }


    public void winpic ()
    {
        System.out.println ("");
        System.out.println ("        XMMMMMMMMMMMMMMMMMMMMMMMMX         ");
        System.out.println ("        iXMMMMMMMMMMMMMMMMMMMMMMXi         ");
        System.out.println ("   ,+iiiitMMMMMMMMMMMMMMMMMMMMMMYiiiii;:   ");
        System.out.println (" +BMMRBXVBMMMMMMMMMMMMMMMMMMMMMMBBVXBMMMV, ");
        System.out.println (";MV,      RMMMMMMMMMMMMMMMMMMMMR       ;BB.");
        System.out.println ("XM:       YMMMMMMMMMMMMMMMMMMMMY        iMi");
        System.out.println ("MM        ;MMMMMMMMMMMMMMMMMMMMi        ;MY");
        System.out.println ("BM,     :YRMMMMMMMMMMMMMMMMMMMMMBi      iMi");
        System.out.println ("iMV    :RR+tMMMMMMMMMMMMMMMMMMt,tMV    .RR:");
        System.out.println (" XMi   :MB :RMMMMMMMMMMMMMMMMR: ,MB    YMi ");
        System.out.println (" .VMi   tMY tMMMMMMMMMMMMMMMMt .XM;  :XMi  ");
        System.out.println ("   YMB+  VMt.BMMMMMMMMMMMMMMB..XMi :iRRi   ");
        System.out.println ("    ,VMRBXMR ;RMMMMMMMMMMMMR; ;MRXBMRi.    ");
        System.out.println ("      :+iii,  ;RMMMMMMMMMMR;   ;iii;.      ");
        System.out.println ("               ,XMMMMMMMMX,                ");
        System.out.println ("                 ;tYMMYt;                  ");
        System.out.println ("                   :MM:                    ");
        System.out.println ("                   :MM:                    ");
        System.out.println ("                   :MM:                    ");
        System.out.println ("                   :MM:                    ");
        System.out.println ("               .;iVRMMRVi;.                ");
        System.out.println ("            :tXMMMMMMMMMMMMBt,             ");
        System.out.println ("            ;MB,,,,,,,,,,,,tMi             ");
        System.out.println ("            ;MX   PERCY    iMi             ");
        System.out.println ("            ;MX   JACKSON, iMi             ");
        System.out.println ("            ;MX   DEMIGOD  iMi             ");
        System.out.println ("            ;MB,,,,,,,,,,,,tMi             ");
        System.out.println ("            iMMMMMMMMMMMMMMMMY             ");
        System.out.println ("          .YMMMMMMMMMMMMMMMMMMX:           ");
        System.out.println ("         ;XBBBBBBBBBBBBBBBBBBBBB;");
    }


    public void death ()
    {
        //death
        printSlow ("Unfortunately for you, you have died.");
        System.out.println ("");
        System.out.println ("                            .xm*f\"\"??T?@hc.");
        System.out.println ("                          z@\"` '~((!!!!!!!?*m.");
        System.out.println ("                        z$$$K   ~~(/!!!!!!!!!Mh");
        System.out.println ("                      .f` \"#$k'`~~\\!!!!!!!!!!!MMc");
        System.out.println ("                     :\"     f*! ~:~(!!!!!!!!!!XHMk");
        System.out.println ("                     f      \" %n:~(!!!!!!!!!!!HMMM.");
        System.out.println ("                    d          X~!~(!!!!!!!X!X!SMMR");
        System.out.println ("                    M :   x::  :~~!>!!!!!!MNWXMMM@R");
        System.out.println (" n                  E ' *  ueeeeiu(!!XUWWWWWXMRHMMM>                :.");
        System.out.println (" E%                 E  8 .$$$$$$$$K!!$$$$$$$$&M$RMM>               :\"5");
        System.out.println ("z  %                3  $ 4$$$$$$$$!~!*$$$$$$$$!$MM$               :\" `");
        System.out.println ("K   \":              ?> # '#$$$$$#~!!!!TR$$$$$R?@MME              z   R");
        System.out.println ("?     %.             5     ^\"\"\"~~~:XW!!!!T?T!XSMMM~            :^    J");
        System.out.println (" \".    ^s             ?.       ~~d$X$NX!!!!!!M!MM             f     :~");
        System.out.println ("  '+.    #L            *c:.    .~\"?!??!!!!!XX@M@~           z\"    .*");
        System.out.println ("    '+     %L           #c`\"!+~~~!/!!!!!!@*TM8M           z\"    .~");
        System.out.println ("      \":    '%.         'C*X  .!~!~!!!!!X!!!@RF         .#     +");
        System.out.println ("        \":    ^%.        9-MX!X!!X~H!!M!N!X$MM        .#`    +\"");
        System.out.println ("          #:    \"n       'L'!~M~)H!M!XX!$!XMXF      .+`   .z\"");
        System.out.println ("            #:    \":      R *H$@@$H$*@$@$@$%M~     z`    +\"");
        System.out.println ("              %:   `*L    'k' M!~M~X!!$!@H!tF    z\"    z\"");
        System.out.println ("                *:   ^*L   \"k ~~~!~!!!!!M!X*   z*   .+\"");
        System.out.println ("                  \"s   ^*L  '%:.~~~:!!!!XH\"  z#   .*\"");
        System.out.println ("                    #s   ^%L  ^\"#4@UU@##\"  z#   .*\"");
        System.out.println ("                      #s   ^%L           z#   .r\"");
        System.out.println ("                        #s   ^%.       u#   .r\"");
        System.out.println ("                          #i   '%.   u#   .@\"");
        System.out.println ("                            #s   ^%u#   .@\"");
        System.out.println ("                              #s x#   .*\"");
        System.out.println ("                               x#`  .@%.");
        System.out.println ("                             x#`  .d\"  \"%.");
        System.out.println ("                           xf~  .r\" #s   \"%.");
        System.out.println ("                     u   x*`  .r\"     #s   \"%.  x.");
        System.out.println ("                     %Mu*`  x*\"         #m.  \"%zX\"");
        System.out.println ("                     :R(h x*              \"h..*dN.");
        System.out.println ("                   u@NM5e#>                 7?dMRMh.");
        System.out.println ("                 z$@M@$#\"#\"                 *\"\"*@MM$hL");
        System.out.println ("               u@@MM8*                          \"*$M@Mh.");
        System.out.println ("             z$RRM8F\"                             \"N8@M$bL");
        System.out.println ("            5`RM$#                                  'R88f)R");
        System.out.println ("            'h.$\"                                     #$x*");
    }
} //class

