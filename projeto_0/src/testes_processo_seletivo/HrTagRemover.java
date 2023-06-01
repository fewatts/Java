package testes_processo_seletivo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HrTagRemover {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = Integer.parseInt(in.nextLine());
        String regexPattern = "(<[^>]*>)";
        Pattern stringPattern = Pattern.compile(regexPattern);
        while(testCases > 0){
            String line = in.nextLine();
            Matcher match = stringPattern.matcher(line);
            String previousHTMLTag = null;
            int previousTagPos = -1;
            boolean didFind = false;
            while(match.find()){
                String htmlTag = line.substring(match.start(), match.end());
                if(htmlTag.charAt(1) != '/'){
                    previousHTMLTag = htmlTag;
                    previousTagPos = match.end();
                }else if(htmlTag.charAt(1) == '/' && previousHTMLTag != null){
                    if(previousHTMLTag.substring(1).equals(htmlTag.substring(2)) && previousHTMLTag.length() > 2 && match.start() > previousTagPos + 1){
                        System.out.println(line.substring(previousTagPos, match.start()));
                        didFind = true;
                    }
                    previousHTMLTag = null;
                }

            }
            System.out.print(didFind ? "" : "None\n");
            testCases--;
        }

    }

}
