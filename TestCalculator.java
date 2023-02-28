
public class TestCalculator {

    public static void main(String[] args){

        Calculator c = new Calculator(12,10);
        System.out.println("12 + 10 = "+ c.calcSum());
        System.out.println("12 - 10 = "+ c.calcSub());
        System.out.println("12 *  10 = "+ c.calcMul());
        System.out.println("12 / 10 = "+ c.calcDiv());

    }    
}
