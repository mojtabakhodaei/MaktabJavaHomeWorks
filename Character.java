package HomeWork4;

public class Character {
    private char charactor;
    private static int codeNumber;

    public Character(char charactor, int codeNumber) {
        this.charactor = charactor;
        this.codeNumber = codeNumber;
    }

    public char encrypt(char charactor, int codeNumber) {
        return (char)((int) charactor+ codeNumber);
    }

}
