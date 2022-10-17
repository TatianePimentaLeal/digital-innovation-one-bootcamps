import java.util.Scanner;

public class DioChallengeCountingEven {

    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;

        for (var i = 1; i <=  num ; i++) { //OK
            var strNum = String.valueOf(i);
            if (strNum.length() == num) { //OK
                if (i % 2 == 0 ) {
                    count++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j < vs.length ; j++) { //i
                sum += (int)Character.getNumericValue(vs[ j ]); //
            }
            if (sum %  2  ==  0 ) { //OK
                count++;
            }
        }
        System.out.println(count); //
    }
}
