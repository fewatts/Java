package testes_processo_seletivo;

import java.util.Random;

public class CwPhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int ran = random.nextInt(i + 1);

            int rand = numbers[i];
            numbers[i] = numbers[ran];
            numbers[ran] = numbers[rand];
        }
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(");
        for (int i = 0; i < 3; i++) {
            phoneNumber.append(numbers[i]);
        }
        phoneNumber.append(") ");
        for (int i = 3; i < 6; i++) {
            phoneNumber.append(numbers[i]);
        }
        phoneNumber.append("-");
        for (int i = 6; i < 10; i++) {
            phoneNumber.append(numbers[i]);
        }

        return phoneNumber.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }));
    }

}
