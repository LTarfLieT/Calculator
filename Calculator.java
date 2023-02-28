package College.OOM_Prac2;

import java.util.Scanner;
public class Calculator {

    private double val1;
    private double val2;

    public Calculator(double v1, double v2){

        val1 = v1;
        val2 = v2;

    }

    public double calcSum(){
            
       double sum = val1 + val2;
       return sum;

    }

    public double calcSub(){

        double sub = val1 - val2;
        return sub;
    } 

    public double calcMul(){

        double mul = val1 * val2;
        return mul;
    } 

    public double calcDiv(){

        double div = val1 / val2;

        if(val2 == 0){
            
            String Message = "Please enter a valid number other than 0";
            div = 0.0;
            System.out.println(Message);
        }
        
        return div;     
        
    }  
    
}
