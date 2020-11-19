package lab4;

public class Main {

    public static void main(String[] args) {

        var input = FileReaderAndWriter.reader();

        var counter = Algorithm.startGame("crates", input);

        FileReaderAndWriter.writer(counter);
    }
}
