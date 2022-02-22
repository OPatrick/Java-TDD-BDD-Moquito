package org.cefim;

/**
 * Ecrire un programme qui retourne les entiers de 1 à 100
 * A prendre en compte :
 * Pour les multiples de 3, remplacer le nombre pas "Fizz"
 * Pour les multiples de 5, remplacer le nombre pas "Buzz"
 * Pour les multiples de 15, remplacer le nombre pas "FizzBuzz"
 *
 * Exemple : "12Fizz4BuzzFizz78FizzBuzz...FizzBuzz... Buzz"
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String generate(int from, int to) {
        StringBuilder result = new StringBuilder();
        for (int i=from; i<=to; i++) {
            getOneResult(result, i);
        }
        return result.toString();
    }

    private void getOneResult(StringBuilder result, int i) {
        if (i %15 == 0) {
            result.append("FizzBuzz");
            return;
        }
        if (i %5 == 0) {
            result.append("Buzz");
            return;
        }
        if (i %3 == 0) {
            result.append("Fizz");
            return;
        }
        result.append(Integer.valueOf(i));
    }
}
