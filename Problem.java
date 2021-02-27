package main;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double tf = input.nextDouble();
        double tr = input.nextDouble();
        double PreviousSpeed = input.nextDouble();
        System.out.println((int)PreviousSpeed);
        
        while(input.hasNext())
        {
            double CurrentSpeed = input.nextDouble();
            if(CurrentSpeed > 0 && CurrentSpeed < 1)
            {
                System.out.println(1);
            }
            else if(CurrentSpeed > PreviousSpeed && CurrentSpeed < ((int)CurrentSpeed + tf))
            {
                System.out.println((int)CurrentSpeed);
            }
            else if(CurrentSpeed > PreviousSpeed && CurrentSpeed > ((int)CurrentSpeed + tf) && CurrentSpeed < ((int)CurrentSpeed + tr))
            {
                System.out.println((int)CurrentSpeed);
            }
            else if(CurrentSpeed > PreviousSpeed && CurrentSpeed > ((int)CurrentSpeed + tr))
            {
                System.out.println((int)CurrentSpeed + 1);
            }
            
            else if(CurrentSpeed < PreviousSpeed && CurrentSpeed > ((int)CurrentSpeed + tf) && CurrentSpeed < ((int)CurrentSpeed + tr))
            {
                System.out.println((int)CurrentSpeed + 1);
            }
            else if(CurrentSpeed < PreviousSpeed && CurrentSpeed < ((int)CurrentSpeed + tf))
            {
                System.out.println((int)CurrentSpeed);
            }
            else if(CurrentSpeed < PreviousSpeed && CurrentSpeed > ((int)CurrentSpeed + tr))
            {
                System.out.println((int)CurrentSpeed + 1);
            }
            PreviousSpeed = CurrentSpeed;
        }
        
        
    }
    
}
