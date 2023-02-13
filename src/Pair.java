public class Pair implements Comparable<Pair> {
    public String s;
    public int number;

    public Pair(String s, int number) {
        this.s = s;
        this.number = number;
    }

    @Override
    public int compareTo(Pair pair) {
        return pair.number - number;
    }

    public String toString() {
        return s + ": " + number;
    }
}
