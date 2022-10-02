import java.util.Scanner;


class atm
{
public static void main(String[] args) {
    int balanace=5000,withdraw,deposit;
    int pin=1234;
    System.out.println("----Welcome to ATM----");
    System.out.println("Enter you pin:");
    Scanner sc= new Scanner(System.in);
    int passoward=sc.nextInt();
    if(passoward == pin)
    {
        while(true)
        {
            System.out.println("1)To view Balance \n2)To Deposit \n3)To Withdraw \n4)Exit");
            System.out.println("Choose your Choice:");
            Scanner tc= new Scanner(System.in);
            int choose= tc.nextInt();
        if(choose ==1)
        {
            System.out.println("The balance is: "+balanace);
            
        }
        else if(choose ==2)
        {
            System.out.println("Enter the money to depsoit");
            Scanner mn = new Scanner(System.in);
            deposit = mn.nextInt();
            balanace +=deposit;
            System.out.println("Money deposit succesfuly");
            System.out.println("Balance is:"+balanace);
            
    
        }
        else if(choose ==3)
        {
            System.out.println("Enter the money to withdraw");
            Scanner mn = new Scanner(System.in);
            withdraw = mn.nextInt();
            if( balanace > withdraw)
            {
            balanace -=withdraw;
            System.out.println("money withdrawal succesfuly");
            System.out.println("Balance is:"+balanace);
            }
            else if(balanace < withdraw)
            {
                System.out.println("insufficient balance");
                
            }
            
            
    
        }
        else if(choose ==4)
        {
            break;
        }
        else
        {
            System.out.println("Invalid Choice");
        }
        
        
        }
        System.out.println("Thank you for Banking"); 
    } 
    else
    {
        System.out.println("wrong password..!!!");
    }
    
    
}
}