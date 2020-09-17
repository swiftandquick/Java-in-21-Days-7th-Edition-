package d8p8_Alternative;

import java.util.HashMap;

public class ComicBooks {

    public ComicBooks() {
    }

    public static void main(String[] arguments) {
        HashMap quality = new HashMap();
        /* Rather than String, the HashMap's key contains Condition variable.  */
        quality.put(Condition.PRISTINE_MINT, 5.00F);
        quality.put(Condition.MINT, 3.00F);
        quality.put(Condition.NEAR_MINT, 2.00F);
        quality.put(Condition.VERY_FINE, 1.50F);
        quality.put(Condition.FINE, 1.00F);
        quality.put(Condition.GOOD, 0.50F);
        quality.put(Condition.POOR, 0.25F);
        quality.put(Condition.COVERLESS, 0.10F);
        // set up collection
        Comic[] comix = new Comic[5];
        /* Third argument is Condition type.  */
        comix[0] = new Comic("Amazing Spider-Man", "1A", Condition.VERY_FINE,
            12_000.00F);
        comix[0].setPrice( (Float) quality.get(comix[0].condition) );
        comix[1] = new Comic("Incredible Hulk", "181", Condition.NEAR_MINT,
            680.00F);
        comix[1].setPrice( (Float) quality.get(comix[1].condition) );
        comix[2] = new Comic("Cerebus", "1A", Condition.GOOD, 190.00F);
        comix[2].setPrice( (Float) quality.get(comix[2].condition) );
        comix[3] = new Comic("Prez", "1", Condition.PRISTINE_MINT, 30.00F);
        comix[3].setPrice( (Float) quality.get(comix[3].condition) );
        comix[4] = new Comic("Night Nurse", "1", Condition.COVERLESS, 22.00F);
        comix[4].setPrice( (Float) quality.get(comix[4].condition) );
        for (Comic comix1 : comix) {
            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");
        }
    }
}
