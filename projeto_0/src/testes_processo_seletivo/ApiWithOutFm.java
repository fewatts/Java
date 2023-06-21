package testes_processo_seletivo;

import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;

class ApiWithOutFm {
    public static void main(String[] args) {

        System.setProperty("http.agent", "Chrome");

        try {

            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");

            try {

                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                String l = reader.readLine();
                System.out.println(l);

                Pattern pattern = Pattern.compile("age=(\\d+)");
                Matcher matcher = pattern.matcher(l);

                int count = 0;

                while (matcher.find()) {
                    int age = Integer.parseInt(matcher.group(1));
                    if (age >= 50)
                        count++;
                }

                System.out.println(count);

            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }

        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }

    }

}
