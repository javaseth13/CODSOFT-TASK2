import java.util.Scanner;
class studentgradecal 
{
    public static void main(String arg[]) 
    
    {
        System.out.println("_______________");  
        System.out.println("STUDENT GRADE CALCULATOR");                
        System.out.println("_______________");
        int totalmarks, subject, sumofmarks = 0;                       
        float avgpercent = 0.0f;                                   
        Scanner sc = new Scanner(System.in);                         
        System.out.print("HOW MANY SUBJECT YOU HAVE=");              
        subject = sc.nextInt();                                    
        
        for (int i = 1; i <= subject; i++) 
        
        {
            System.out.print("ENTER THE MARK OF " + i + " SUBJECT= "); 
            totalmarks = sc.nextInt();                                
            sumofmarks += totalmarks;                               
            System.out.println("TOTAL MARKS= " + sumofmarks);       
        }
        avgpercent = sumofmarks / subject;                                 
        System.out.println("AVERAGE PERCENTAGE= " + avgpercent);
      
        if (avgpercent >= 90) 
        {
            System.out.println("A1 GRADE");
        } 
        else if (avgpercent >= 80) 
        {
            System.out.println("A2 GRADE");
        } 
        else if (avgpercent >= 70) 
        {
            System.out.println("B1 GRADE");
        } 
        else if (avgpercent >= 60) 
        {
            System.out.println("B2 GRADE");
        }
        else if (avgpercent >= 50) 
        {
            System.out.println("C1 GRADE");
        }
        else if (avgpercent >= 40 ) 
        {
            System.out.println("C2 GRADE");
        } 
        else if (avgpercent >= 33) 
        
        {
            System.out.println("D1 GRADE");
        } 
   
        else if(avgpercent < 33)
        
        {
            System.out.println("FAIL");
        } 
        
        else 
       
        {
            System.out.println("NOT VALID FOR FOR MARKS");
        } 
    }
}