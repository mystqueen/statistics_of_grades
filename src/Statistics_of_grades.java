import java.util.Arrays;
import java.util.Scanner;

public class Statistics_of_grades {
    public static int checkRange(int score){
        int mod = score/10;
        int n = score%10;
        if (n > 0)
            return mod +1;
        return mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Allow the user to enter the size of the array
        System.out.println("Enter the number of students' scores you want to work with");
        int arraySize = scanner.nextInt();
//      Check and ensure that the array size is above 0 if not the user enters a new array size
        while (arraySize <= 0){
            System.out.println("Invalid arraySize. Please enter a size above 0  NOTE:You cannot have a negative arraySize");
            arraySize = scanner.nextInt();
        }

//      Declare array based on given arraySize.
//      Take input of the students' scores into the array
        int [] scores = new int[arraySize];

        System.out.println("Enter students' scores");
        for (int i = 0; i < arraySize; i++) {
            scores[i] = scanner.nextInt();
        }

//      Finding the minimum, maximum and average grades in the class using streams in arrays
        int minGrade = Arrays.stream(scores).min().getAsInt();
        int maxGrade = Arrays.stream(scores).max().getAsInt();
        double avgGrade = Arrays.stream(scores).average().getAsDouble();

        System.out.println("\nThe maximum grade is " + maxGrade);
        System.out.println("The minimum grade is " + minGrade);
        System.out.println("The average grade is " + avgGrade + "\n");

//      Declare stats array
        int [] stats = new int[5];

//      Loop through scores array and group the scores in the 4 score ranges


//
//        for (int score : scores)
//            if(score >= 0 && score <= 20){
//                stats[0]++;
//            } else if(score >= 21 && score <= 40){
//                stats[1]++;
//            } else if(score >= 41 && score <= 60){
//                stats[2]++;
//            } else if(score >= 61 && score <= 80){
//                stats[3]++;
//            } else {
//                stats[4]++;
//            }


        for( int grade : scores)
            switch (checkRange(grade)){
            case 10,9 -> stats[4]++;
            case 8,7 -> stats[3]++;
            case 6,5 -> stats[2]++;
            case 4,3 -> stats[1]++;
                default -> stats[0]++;
            }


//        Store the maximum value of the stats array in a variable for the vertical axis height of the graph
        int maxCount = 0;
        for (int count : stats){
            if(count > maxCount){
                maxCount = count;
            }
        }

//        Displaying the graph
        System.out.println("Graph:\n");

//      Printing the vertical axis
//      Print the vertical axis from top(highest value in the stats array) to down
        for (int row = maxCount; row>0; row--){
            System.out.printf("%2d >", row);
//           Draw the graph from left to right one line at a time
            for (int i = 0; i < stats.length; i++) {
                int k = maxCount - stats[i];
                if (k > 0)
                    System.out.print("             ");
                else
                    System.out.print("   #######   ");
//              Jump to the next line
            }System.out.print("\n");
//          Decrease the maximum count for printing the vertical axis by 1
            maxCount --;
        }

//     Printing the horizontal axis
        System.out.println("   +-----------+-------------+-------------+-------------+-------------+");
        System.out.println("   I    0-20   I     21-40   I     41-60   I     61-80   I     81-100  I");


    }

}


