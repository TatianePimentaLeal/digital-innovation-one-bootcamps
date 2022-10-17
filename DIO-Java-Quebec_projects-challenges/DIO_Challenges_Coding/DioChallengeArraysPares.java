import java.util.*;
import java.lang.*;
import java.io.*;

public class DioChallengeArraysPares {

    public static void main (String[] args) throws java.lang.Exception
    {
        //TODO: Criar um Array de números inteiros:
        int[] array = {2, 3, 5, 7, 11, 13, 18, 34};

        //TODO: Implemente um laço de repetição que verifique apenas números pares
        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

}
