public class DioChallengeInterUm {

    public static void main(String[] args) {
        //int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int num = 29;
        var step = 0;

        /*while (num > 0) {
            if ((num % 2) == 0) {
                //se for par, dividir por 2
                num = num / 2;
                step++;
            }
            //se for impar, subtrair 1
            num = num - 1;
            step++;
        }*/

        while (num >  0 ) {
            if ((num & 1) == 1) { //
                num -= 1;
                step++;
            }
            num /= 2;
            step++;
        }

        if(step > 0 ){
            System.out.println(step - 1);
        }else{
            System.out.println(step);
        }

    }
}
