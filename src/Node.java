public class Node {

    char letter;
    int index;

    public Node(char letter, int index) {
        this.letter = letter;
        this.index = index;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(index);
        return sb.toString();
    }
}
