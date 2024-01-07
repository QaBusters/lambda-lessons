package ru.testprogmath.lambdas.lesson;

import static ru.testprogmath.lambdas.SampleData.membersOfTheBeatles;

public class Main {
    public static void main(String[] args) {
        Iteration iteration = new Iteration();
        iteration.filterArtistsFromLondonPrinted(membersOfTheBeatles);
    }
}
