package hackerrank.interview.sorting;

import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }
        return a.name.compareTo(b.name);

    }
}
