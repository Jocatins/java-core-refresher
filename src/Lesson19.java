//  *********** Throw ************//

class SphinxException extends Exception {
    public SphinxException(String str) {
        super(str);

    }
}

public class Lesson19 {

    public static void main(String[] args) {

        int i = 25;
        int j = 0;

        try {
            j = 24 / i;
            if (j == 0)
                throw new SphinxException("Throw object displaying");

        } catch (SphinxException e) {
            System.out.println("Something went wrong " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Code ended!!!");
    }
}