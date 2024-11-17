
/* Write a piece of code that finds out at least 
how many individuals in a group are needed so that 
the probability of two people's sharing the 
same birthday is more than 69%.*/

public class BirthdayParadox{
    /* This method will calculate the number of people 
     * needed for a probability of at least 2 people sharing 
     * the same birthday
     */

     public static int calPeople (double tarProbability){
        int numOfpeople= 0; // we want to start at 0 people 
        double probabilityNotShare=1.0; // we want to people that don't share Bdays

        // Creating a while loop to get the probability of at least 2 people
        // sharing a birthfay that is less than the target probability so lets 
        // keep adding people
        while(true){
            numOfpeople++; 
            probabilityNotShare *=(365 - (numOfpeople-1))/365.0; //updating probability

            // calculating the probability that at least 2 share a birthday
            double sharedProbability = 1- probabilityNotShare;

            //Check if we have reached the target or passed it
            if(sharedProbability >= tarProbability){
                break; // if target is reached exit loop
            }
        }
        return numOfpeople; //return the total num of people needed
     }


     // main method 
     public static void main(String[] args){
        double requiredProbability = 0.69; // set the required probability to 69%

        //call the method calPeople to calculate the num of people 
        int numOfpeople = calPeople(requiredProbability);

        // printing the probability of people needed for at least 69%
        System.out.println ("Number of people needed for a probability of " + requiredProbability + ": " + numOfpeople);

     }
}