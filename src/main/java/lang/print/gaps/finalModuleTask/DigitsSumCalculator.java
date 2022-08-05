package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstDigit = number / 1000;
        int secondDigit = (number - firstDigit * 1000) / 100;
        int thirdDigit = (number - firstDigit * 1000 - secondDigit * 100) / 10;
        int fourthDigit = number - firstDigit * 1000 - secondDigit * 100 - thirdDigit * 10;
        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println(sum);
    }
}
