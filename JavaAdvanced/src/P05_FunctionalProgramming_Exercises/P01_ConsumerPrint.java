package P05_FunctionalProgramming_Exercises;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
//Consumer -> Void -> accept

//Consumer<String> real = (name) -> {
//System.out.println("real")}

//Supplier - Ne priema nishto , vrushta neshto -> with return;
//Predicate -> Return boolean -> Priema samo edin parametar


public class P01_ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(reader.readLine().split("\\s+")).forEach( x -> System.out.println(x));

    }
}
