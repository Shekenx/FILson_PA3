import java.security.SecureRandom;
import java.util.Scanner;

public class Arithmetic {


        //Start of part 1- 4
        //Parts 1 - 4 are shown as Comments only.
        {/*
    //Part 1 Filson_PA3
    /*public static int multiply(int num1, int num2) {

        int sum = 0;

        sum =  num1 * num2;
        return sum;
    }
    public static int userAnswer(Scanner scn){
        int userAns = scn.nextInt();
        return userAns;
    }

    public static void printSum(int num1, int num2) {

        System.out.println("How much is " + num1 + "times" + num2 + "?");


    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int answerUser = 0;
        int answer = 0;
        int num_1 =  rand.nextInt(10);
        int num_2 =  rand.nextInt(10);


        answer = multiply(num_1, num_2);
        printSum(num_1, num_2);

        do{
            answerUser = userAnswer(scn);

            if (answer != answerUser) {

                System.out.println("No, try again");
                printSum(num_1, num_2);

            } else {
                System.out.println("Correct!");
                while ((answer == answerUser)){
                    num_1 = rand.nextInt(10);
                ;
                num_2 = rand.nextInt(10);
                ;
                answer = multiply(num_1, num_2);
                printSum(num_1, num_2);
                do {
                    answerUser = userAnswer(scn);

                    if (answer != answerUser) {

                        System.out.println("No, try again");
                        printSum(num_1, num_2);

                    } else {
                        System.out.println("Correct!");
                    }


                }
                while (answer != answerUser);
            }
            }


        }
        while (answer != answerUser);

    }*/
            //Part 2
    /*public static int Multiply(int num1, int num2) {

        int product = 0;

        product = num1 * num2;
        return product;
    }

  public static int userAnswer(Scanner scn) {
        int userAns = scn.nextInt();
        return userAns;
    }

     public static void Printproduct(int num1, int num2) {


        System.out.println("How much is " + num1 + " times " + num2 + "?");

    }

    public static int ResponseCorrectAns(int response) {
        switch (response) {
            case 1:
                System.out.println("Very Good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work");
                break;
            default:
                break;
        }
        return response;

    }

    public static int ResponseWrongAns(int respond) {
        switch (respond) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try again.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
            default:
                break;
        }
        return respond;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int answerUser = 0;
        int answer = 0;
        int num_1 = rand.nextInt(10);
        int num_2 = rand.nextInt(10);


         Printproduct(num_1, num_2);
        answer = multiply(num_1, num_2);

        int responses = rand.nextInt(4);

        do {
            answerUser = userAnswer(scn);

            if (answer != answerUser) {

                ResponseWrongAns(responses);
                 Printproduct(num_1, num_2);

            } else {
                ResponseCorrectAns(responses);

                while (answer == answerUser) {
                    num_1 = rand.nextInt(10);
                    num_2 = rand.nextInt(10);
                    responses = rand.nextInt(4);

                    Printproduct(num_1, num_2);
                    answer = Multiply(num_1, num_2);

                    do {
                        answerUser = userAnswer(scn);

                        if (answer != answerUser) {
                            responses = rand.nextInt(4);
                            ResponseWrongAns(responses);
                            Printproduct(num_1, num_2);

                        } else {
                            responses = rand.nextInt(4);
                            ResponseCorrectAns(responses);
                        }
                    }
                    while (answer != answerUser);
                }
            }

        }
        while (answer != answerUser);

    }*/
            //part3
    /*
    public static int Multiply(int num1, int num2) {

        int product = 0;

        product = num1 * num2;
        return product;
    }

    public static int userAnswer(Scanner scn) {
        int userAns = scn.nextInt();
        return userAns;
    }

    public static void Printproduct(int num1, int num2) {


        System.out.println("How much is " + num1 + " times " + num2 + "?");

    }
    public static double Percentage(double right, double total){

        double avg;
        double percent;

        avg = right / total;
        percent = avg * 100;
        System.out.printf("Total percentage: %.1f\n", percent);
        return percent;
    }
    public static void Message(double percentAvg) {
        if (percentAvg < 75.0) {
            System.out.println("Please ask your teacher for extra help.");
        } else if (percentAvg > 75.0) {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }
        System.out.println();
        System.out.println("Next student please.");
        System.out.println();
    }


    public static void main(String[] args) {
        final double TOTAL = 10.0;
        Scanner scn = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int answerUser = 0;
        int answer = 0;
        int num_1 = rand.nextInt(10);
        int num_2 = rand.nextInt(10);
        boolean done = true;


        while (done) {
            int i = 0;
            int r = 0;
            int w = 0;
            double totalPercent = 0;
            for (i = 0; i < 10; ++i) {
                Printproduct(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                answer = Multiply(num_1, num_2);
                answerUser = userAnswer(scn);
                if (answerUser == answer) {
                    r++;
                } else if (answerUser != answer) {
                    w++;
                }

            }
            System.out.println("Correct answer(s): " + r);
            System.out.println("Wrong answer(s): " + w);
            totalPercent = Percentage((double) r, TOTAL);
            Message(totalPercent);
        }


    }
*/

            // part4
    /*public static int Multiply(int num1, int num2) {

        int product = 0;

        product = num1 * num2;
        return product;

    }
    public static int userAnswer(Scanner scn) {
        int userAns = scn.nextInt();
        return userAns;
    }

    public static void Printproduct(int num1, int num2) {


        System.out.println("How much is " + num1 + " times " + num2 + "?");

    }

    public static double Percentage(double right, double total) {

        double avg;
        double percent;

        avg = right / total;
        percent = avg * 100;
        System.out.printf("Total percentage: %.1f\n", percent);
        return percent;
    }

    public static void Message(double percentAvg) {
        if (percentAvg < 75.0) {
            System.out.println("Please ask your teacher for extra help.");
        } else if (percentAvg > 75.0) {
            System.out.println("Congratulations, you are ready to go to the next level!");

        }
        System.out.println();
        System.out.println("Next student please.");
        System.out.println();
    }

    public static int Levels(Scanner scn) {

        System.out.println("Please Choose the difficulty level that you want to try");
        System.out.println("Enter 1, for level 1:  One digit numbers only");
        System.out.println("Enter 2, for level 2:  two digit numbers only");
        System.out.println("Enter 3, for level 3:  three digit numbers only");
        System.out.println("Enter 4, for level 4:  four digit numbers only");
        System.out.println();


        int level = scn.nextInt();
        int j;

        switch (level) {
            case 1:
                System.out.println("Level 1: Multiply one digit numbers");

                break;
            case 2:
                System.out.println("Level 2: Multiply two digit numbers");

                break;
            case 3:
                System.out.println("Level 3:  Multiply Three digit numbers");

                break;
            case 4:
                System.out.println("Level 4:  Multiply Four digit numbers");

                break;
            default:
                break;
        }
        return level;


    }

    public static void main(String[] args) {
        final double TOTAL = 10.0;
        Scanner scn = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int answerUser = 0;
        int answer = 0;
        int num_1 = rand.nextInt(10);
        int num_2 = rand.nextInt(10);
        boolean done = true;
        int difficultlevel = 0;


        while (done) {
            int i = 0;
            int r = 0;
            int w = 0;
            double totalPercent = 0;
            difficultlevel = Levels(scn);

            for (i = 0; i < 10; ++i) {

                if (difficultlevel == 1) {
                    Printproduct(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                    answer = Multiply(num_1, num_2);
                    answerUser = userAnswer(scn);
                    if (answerUser == answer) {
                        r++;
                    } else if (answerUser != answer) {
                        w++;
                    }
                }
                if (difficultlevel == 2) {

                        Printproduct(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                        answer = Multiply(num_1, num_2);

                        answerUser = userAnswer(scn);
                        if (answerUser == answer) {
                            r++;
                        } else if (answerUser != answer) {
                            w++;
                        }

                    }
                    if (difficultlevel == 3) {
                        Printproduct(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                        answer = Multiply(num_1, num_2);
                        answerUser = userAnswer(scn);
                        if (answerUser == answer) {
                            r++;
                        } else if (answerUser != answer) {
                            w++;
                        }
                    }
                    if (difficultlevel == 4) {
                        Printproduct(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                        answer = Multiply(num_1, num_2);
                        answerUser = userAnswer(scn);
                        if (answerUser == answer) {
                            r++;
                        } else if (answerUser != answer) {
                            w++;
                        }
                    }
                }
                System.out.println("Correct answer(s): " + r);
                System.out.println("Wrong answer(s): " + w);
                totalPercent = Percentage((double) r, TOTAL);
                Message(totalPercent);
            }
        }

}

     */

        }//End of parts 1 through 4


        //Part 5
        public static int Multiply(int num1, int num2) {

            int product = 0;

            product = num1 * num2;
            return product;
        }
        public static int Division(int num1, int num2) {

            int quotient = 0;

            quotient = num1 / num2;
            return quotient;
        }
        public static int Addition(int num1, int num2) {

            int sum = 0;

            sum = num1 + num2;
            return sum;
        }
        public static int Subtraction(int num1, int num2) {

            int difference = 0;

            difference = (num1 - num2);
            return difference;
        }

        public static int userAnswer(Scanner scn) {
            int userAns = scn.nextInt();
            return userAns;
        }

        public static void Printproduct(int num1, int num2) {


            System.out.println("How much is " + num1 + " times " + num2 + "?");

        }
        public static void PrintSum(int num1, int num2) {


            System.out.println("How much is " + num1 + " plus " + num2 + "?");

        }
        public static void ResponseCorrectAns() {
            int response;
            SecureRandom randomized = new SecureRandom();
            response = randomized.nextInt(5);
            if(response == 0){
                response++;
            }
            switch (response) {
                case 1:
                    System.out.println("Very Good!");
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Excellent!");
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Nice work!");
                    System.out.println();

                    break;
                case 4:
                    System.out.println("Keep up the good work");
                    System.out.println();
                    break;
                default:
                    break;

            }
            response = randomized.nextInt(5);
            if(response == 0) {
                response++;
            }

        }

        public static void ResponseWrongAns() {
            int respond;
            SecureRandom randomized = new SecureRandom();
            respond = randomized.nextInt(5);
            if(respond == 0){
                respond++;
            }

            switch (respond) {
                case 1:
                    System.out.println("No. Please try again.");
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Wrong. Try again.");
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Don't give up!");
                    System.out.println();

                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    System.out.println();

                    break;
                default:
                    break;
            }
            respond = randomized.nextInt(5);
            if(respond == 0){
                respond++;
            }

        }
        public static int Levels(Scanner scn) {

            System.out.println("Please Choose the difficulty level that you want to try");
            System.out.println("Enter 1, for level 1:  One digit numbers only");
            System.out.println("Enter 2, for level 2:  two digit numbers only");
            System.out.println("Enter 3, for level 3:  three digit numbers only");
            System.out.println("Enter 4, for level 4:  four digit numbers only");
            System.out.println();


            int level = scn.nextInt();
            switch (level) {
                case 1:
                    System.out.println("Level 1: one digit numbers only.");

                    break;
                case 2:
                    System.out.println("Level 2: two digit numbers only.");

                    break;
                case 3:
                    System.out.println("Level 3: Three digit numbers only.");

                    break;
                case 4:
                    System.out.println("Level 4: Four digit numbers only.");

                    break;
                default:
                    System.out.println("Please enter a number from 1 - 4");
                    break;
            }
            return level;
        }


        public static void Printdifference(int num1, int num2) {


            System.out.println("How much is " + num1 + " minus " + num2 + "?");

        }
        public static void Printqoutient(int num1, int num2) {


            System.out.println("How much is " + num1 + " divided by " + num2 + "?");

        }

        public static double Percentage(double right, double total) {

            double avg;
            double percent;

            avg = right / total;
            percent = avg * 100;
            System.out.printf("Total percentage: %.1f\n", percent);
            return percent;
        }

        public static void Message(double percentAvg) {
            if (percentAvg < 75.0) {
                System.out.println("Please ask your teacher for extra help.");
            } else if (percentAvg > 75.0) {
                System.out.println("Congratulations, you are ready to go to the next level!");

            }
            System.out.println();
            System.out.println("Next student please.");
            System.out.println();
        }

        public static int Questions(Scanner scn) {

            System.out.println("Please pick a type of arithmetic to study.");
            System.out.println("Enter 1 for addition.");
            System.out.println("Enter 2 for multiplication.");
            System.out.println("Enter 3 for subtraction.");
            System.out.println("Enter 4 for division.");
            System.out.println("Enter 5 for mixture of arithmetic problems.");
            System.out.println();


            int type = scn.nextInt();

            switch (type) {
                case 1:
                    System.out.println("You chose to practice with addition questions.");
                    System.out.println();

                    break;
                case 2:
                    System.out.println("You chose to practice with multiplication questions.");
                    System.out.println();

                    break;
                case 3:
                    System.out.println("You chose to practice with subtraction questions.");
                    System.out.println();

                    break;
                case 4:
                    System.out.println("You chose to practice with division questions.");
                    System.out.println();

                    break;
                case 5:
                    System.out.println("You chose to practice with mixture of arithmetic questions.");
                    System.out.println();

                    break;
                default:
                    System.out.println("Please enter a number from 1 to 5 only.");
                    System.out.println();
                    break;
            }
            return type;


        }

        public static void main(String[] args) {
            final double TOTAL = 10.0;
            final int LOOP = 10;
            Scanner scn = new Scanner(System.in);
            SecureRandom rand = new SecureRandom();
            int answerUser = 0;
            int answer = 0;
            int num_1 = rand.nextInt(10);
            int num_2 = rand.nextInt(10);
            boolean done = true;
            int questionType = 0;
            int operation = 0;
            int loop = 0;
            int responseMessage;
            int diffLevel = 0;


            while (done) {

                int i = 0;
                double r = 0.0;
                double w = 0.0;
                double totalPercent = 0;
                int j = 0;

                diffLevel = Levels(scn);
                questionType = Questions(scn);

                for (i = 0; i < LOOP; ++i) {
                    if (diffLevel == 1) {

                        if (questionType == 1) {
                            PrintSum(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                            answer = Addition(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 2) {
                            Printproduct(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                            answer = Multiply(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 3) {
                            Printdifference(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                            answer = Subtraction(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 4) {
                            Printqoutient(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                            answer = Division(num_1, num_2 + 1);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 5) {

                            operation = rand.nextInt(5);
                            if (operation == 0) {
                                operation++;
                            }

                            if (operation == 1) {
                                PrintSum(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                                answer = Addition(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 2) {
                                Printproduct(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                                answer = Multiply(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 3) {
                                Printdifference(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                                answer = Subtraction(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 4) {

                                Printqoutient(num_1 = rand.nextInt(10), num_2 = rand.nextInt(10));
                                if (num_2 == 0) {
                                    num_2++;
                                }
                                answer = Division(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }

                        }
                    }
                    if (diffLevel == 2) {
                        if (questionType == 1) {
                            PrintSum(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                            answer = Addition(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 2) {
                            Printproduct(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                            answer = Multiply(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 3) {
                            Printdifference(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                            answer = Subtraction(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 4) {
                            Printqoutient(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                            answer = Division(num_1, num_2 + 1);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 5) {

                            operation = rand.nextInt(5);
                            if (operation == 0) {
                                operation++;
                            }

                            if (operation == 1) {
                                PrintSum(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                                answer = Addition(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 2) {
                                Printproduct(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                                answer = Multiply(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 3) {
                                Printdifference(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                                answer = Subtraction(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 4) {

                                Printqoutient(num_1 = rand.nextInt(90) + 10, num_2 = rand.nextInt(90) + 10);
                                if (num_2 == 0) {
                                    num_2++;
                                }
                                answer = Division(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }

                        }
                    }
                    if (diffLevel == 3) {
                        if (questionType == 1) {
                            PrintSum(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                            answer = Addition(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 2) {
                            Printproduct(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                            answer = Multiply(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 3) {
                            Printdifference(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                            answer = Subtraction(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 4) {
                            Printqoutient(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                            answer = Division(num_1, num_2 + 1);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 5) {

                            operation = rand.nextInt(5);
                            if (operation == 0) {
                                operation++;
                            }

                            if (operation == 1) {
                                PrintSum(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                                answer = Addition(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 2) {
                                Printproduct(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                                answer = Multiply(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 3) {
                                Printdifference(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                                answer = Subtraction(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 4) {

                                Printqoutient(num_1 = rand.nextInt(900) + 100, num_2 = rand.nextInt(900) + 100);
                                if (num_2 == 0) {
                                    num_2++;
                                }
                                answer = Division(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }

                        }
                    }
                    if (diffLevel == 4) {
                        if (questionType == 1) {
                            PrintSum(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                            answer = Addition(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 2) {
                            Printproduct(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                            answer = Multiply(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 3) {
                            Printdifference(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                            answer = Subtraction(num_1, num_2);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 4) {
                            Printqoutient(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                            answer = Division(num_1, num_2 + 1);
                            answerUser = userAnswer(scn);
                            if (answer == answerUser) {
                                r++;
                                ResponseCorrectAns();
                            }
                            if (answer != answerUser) {
                                w++;
                                ResponseWrongAns();
                            }
                        }
                        if (questionType == 5) {

                            operation = rand.nextInt(5);
                            if (operation == 0) {
                                operation++;
                            }

                            if (operation == 1) {
                                PrintSum(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                                answer = Addition(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 2) {
                                Printproduct(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                                answer = Multiply(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 3) {
                                Printdifference(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                                answer = Subtraction(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                            if (operation == 4) {

                                Printqoutient(num_1 = rand.nextInt(9000) + 1000, num_2 = rand.nextInt(9000) + 1000);
                                if (num_2 == 0) {
                                    num_2++;
                                }
                                answer = Division(num_1, num_2);
                                answerUser = userAnswer(scn);
                                if (answer == answerUser) {
                                    r++;
                                    ResponseCorrectAns();
                                }
                                if (answer != answerUser) {
                                    w++;
                                    ResponseWrongAns();
                                }
                            }
                        }
                    }

                }
                System.out.println("Correct answer(s): " + r);
                System.out.println("Wrong answer(s): " + w);
                totalPercent = Percentage(r, TOTAL);
                Message(totalPercent);
            }

        }
}
