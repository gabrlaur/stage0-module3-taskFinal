package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstNumber = number / 100;
        int secondNumber = (number - firstNumber * 100) / 10;
        int thirdNumber = number - firstNumber * 100 - secondNumber * 10;
        int reversed = thirdNumber * 100 + secondNumber * 10 + firstNumber;
        System.out.println(reversed);
    }
}
