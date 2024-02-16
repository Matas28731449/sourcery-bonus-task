import java.util.List;
import java.util.ArrayList;

class Rule {
    int divisor;
    String word;

    Rule(int divisor, String word) {
        this.divisor = divisor;
        this.word = word;
    }
}

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        List<Rule>   rules = new ArrayList<>();

        rules.add(new Rule(3, "Fizz"));
        rules.add(new Rule(5, "Buzz"));
        rules.add(new Rule(7, "Jazz")); // easily extendable with this single line

        for (int i = 1; i <= n; i ++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (Rule rule : rules) {
                if (i % rule.divisor == 0) {
                    stringBuilder.append(rule.word);
                }
            }

            if (stringBuilder.length() == 0) {
                stringBuilder.append(i);
            }

            result.add(stringBuilder.toString());
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 20;

        List<String> result = fizzBuzz(n);
        
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
