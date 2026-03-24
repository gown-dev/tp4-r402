package cook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(final String[] args) throws IOException {
        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        final String s = r.readLine();
        System.out.println(s);
    }

}
