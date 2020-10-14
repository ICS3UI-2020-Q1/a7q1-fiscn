import java.util.Scanner;

/**
 * Create a procedure-type method called examGrade that will take an exam percentage as a parameter and print out the associated letter grade.
 * @author Neil Fischer  
 */
public class Main { 

  //Assigns a letter based on number mark 
  public static int examGrade(int examMark){
    if(examMark < 50){
      System.out.println("Your grade is F");
    }else if(examMark >= 50 && examMark <= 59){
      System.out.println("Your grade is D");
    }else if(examMark >= 60 && examMark <= 69){
      System.out.println("Your grade is C"); 
    }else if(examMark >= 70 && examMark <= 79){
      System.out.println("Your grade is B");
    }else if(examMark >= 80){
      System.out.println("Your grade is A");
    } 
    return examMark; 
  } 




  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    //Prompt user to enter in mark from exam 
    System.out.println("Please enter your exam mark"); 

    //obtain mark from user 
    int examMark = input.nextInt(); 

    int FinalMark = examGrade(examMark); 

    
    
  }
}
