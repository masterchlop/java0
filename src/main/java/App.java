import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * app
 *
 * @author karol
 *
 * version 1.0
 */
public class App   {
    /**
    @funkcja pisze zart i wita system
     */
        public static void main(final String[] args){
        final String t = Klasa2.systemos();
        final String s = Klasa3.powitanie();
        System.out.println(s + " " + t);
        final ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());

    }
}
