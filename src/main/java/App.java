import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * app
 *
 * @author karol
 *
 * version 1.0
 */
public final class App   {
    /**
    @funkcja pisze zart i wita system
     */
    int x=2332323;
        public static void main(final String[] args){
        final String przywitanie = Klasa2.systemos();
        final String informacja = Klasa3.powitanie();
        System.out.println(przywitanie + " " + informacja);
        final ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());
        System.out.println("Haha, zabawne");
    }
}
