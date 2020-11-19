package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Algorithm {


    public static Integer startGame(String word, Set<String> dictionary) {
        var chain = recursiveSolve(new ArrayList<>(), word, dictionary);
        return Objects.requireNonNull(chain).size();
    }

    private static List<String> recursiveSolve(ArrayList<String> chainList, String expectedWord, Set<String> list) {
        if (!list.contains(expectedWord)) {
            return null;
        }
        chainList.add(expectedWord);
        for (int i = 0; i < expectedWord.length(); i++) {
            var nextProposedWord = expectedWord.substring(0, i) + expectedWord.substring(i + 1);
            var chain = recursiveSolve(chainList, nextProposedWord, list);
            if (chain != null) {
                return chain;
            }
        }
        return chainList;
    }
}
