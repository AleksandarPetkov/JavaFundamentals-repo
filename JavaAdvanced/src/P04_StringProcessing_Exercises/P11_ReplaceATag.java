package P04_StringProcessing_Exercises;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class P11_ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true){
            String line = reader.readLine();
            if (line.equals("END")){
                break;
            }
            sb.append(line).append(System.lineSeparator());
        }

        String result = sb.toString();
        Pattern pattern = Pattern.compile("(<a)\\shref[^>]+(>)\\s*.*?(<\\/a>)");
        Matcher matcher = pattern.matcher(result);

        while (matcher.find()){

            String entryGroup = matcher.group();
            String openTag = matcher.group(1);
            String closeOpenTag = matcher.group(2);
            String closeTag = matcher.group(3);

            String replacement = entryGroup.replaceFirst(openTag , "[URL");
            replacement = replacement.replaceFirst(closeOpenTag, "]");
            replacement = replacement.replaceFirst(closeTag, "[/URL]");

            result = result.replace(entryGroup , replacement);
        }
        System.out.println(result);
    }
}
