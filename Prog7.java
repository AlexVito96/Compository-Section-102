public class Prog7{

    public static void main(String args []){

        int[] numbers={3,5,7,6,3,2,9};
        int num;
        for(int position=0; position<numbers.length; position++){
            System.out.println("numbers: " + numbers[position]);

            //if find number 7 then print (moving inside of the array using the loop hi everyone) (3,5,7,6,3,2,9
            // use a loop to move inside the array and print on the console "hi everyone" when you find the 7 number.
        
           
       

        }
         //sum   
        int Result = 0;

        for(int x=0; x<numbers.length; x++){
            Result = Result + numbers[x];

        }

        System.out.println("The sum for all of the values is " + Result);
        System.out.println(" ---------------------------------------------- ");

        //loop

        for(int luckyNumber = 0; luckyNumber < numbers.length; luckyNumber++){
            System.out.println("number: " + numbers[luckyNumber]);

            if(numbers[luckyNumber] == 7){
                System.out.println("Hi Everyone you have landed on Lucky Number " + numbers[luckyNumber]);
            }
        }
        


    }
}