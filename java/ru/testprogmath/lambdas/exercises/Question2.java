package ru.testprogmath.lambdas.exercises;

import ru.testprogmath.lambdas.Artist;

import java.util.List;

public class Question2 {

/*  Переписать следующий код, используя внутреннее итерирование
 int totalMembers = 0;
for (Artist artist : artists) {
        Stream<Artist> members = artist.getMembers();
        totalMembers += members.count();
    }*/
    public static int countBandMembersInternal(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }
}
