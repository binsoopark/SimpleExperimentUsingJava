package net.letsgogo.exp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyPrettyPrint {
    public static void main(String[] args) throws IOException {
        int count=1;
        // 입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input what you want: ");
        String input = br.readLine();
        int inputEndOfMultiply = 0;
        try {
            inputEndOfMultiply = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid input number.");
            System.exit(1);
        }

        // 계산 및 출력부
        int countLimit = ((inputEndOfMultiply - 2) / 4 + 1) * 2;
        int endLimit = 3 - (inputEndOfMultiply - 2) % 4;
        while(count < countLimit) {
            int endNumber = (count + 1) * 2 + 1;
            int startNumber = endNumber - 3;
            if(!(count+2 < countLimit)) { // 다음 카운트가 유효하지 않다면(맨 끝이므로) 뒤를 자름
                endNumber = endNumber - endLimit;
            }
            for(int i=1; i<=9; i++) {
                for (int j = startNumber; j <= endNumber; j++) {
                    int result = j*i;
                    System.out.print(j + " * " +i+" = "+result);
                    if(result < 100) System.out.print("\t\t\t");
                    else if(result < 1000) System.out.print("\t\t");
                    else if(result < 10000) System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println();
            count=count+2;
        }
    }
}
