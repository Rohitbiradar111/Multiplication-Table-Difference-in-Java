//This program shows the difference between two multiplication tables of two numbers

public class TableDifference {
    public static void main(String args[])
    {
        int number1 = 9;       
        int number2 = 4;
        for(int i=1;i<=10;i++)
        {
            System.out.println(number1*i +" - "+ number2*i+" = "+((number1*i) - (number2*i)));
        }

        System.out.println();

        int n =1;
        while(n<=10)
        {
            System.out.println(number1*n +" - "+ number2*n+" = "+((number1*n) - (number2*n)));
            n++;
        }
    }
}