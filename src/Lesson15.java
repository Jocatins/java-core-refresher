// ********** ENUMS *************
// It extends an ENUM class
enum Status {
    Running, Completed, InProgress
}

enum Sphinx {
    MacBook(2000), Surface, LG(2300), Dell(2000);

    // Default constructor
    private Sphinx() {

    }

    private Sphinx(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

}

public class Lesson15 {

    public static void main(String[] args) {
        // Status s = Status.Running;
        // System.out.println(s.ordinal());

        // Status[] ss = Status.values();

        // for (Status s : ss) {
        // System.out.println(s);
        // }

        // Status s = Status.Completed;

        // With Switch Statements

        // switch (s) {
        // case Running:
        // System.out.println("Status running");
        // break;
        // case Completed:
        // System.out.println("Status completed");
        // break;
        // default:
        // System.out.println("Status InProgress");
        // break;
        // }

        // if (s == Status.Completed)
        // System.out.println("Status Completed...");
        // else if (s == Status.InProgress)
        // System.out.println("Status In Progress");
        // else
        // System.out.println("Status Running");

        // Sphinx sphinx = Sphinx.MacBook;
        // System.out.println(sphinx + ": " + sphinx.getPrice());
        for (Sphinx sphinx : Sphinx.values()) {
            System.out.println(sphinx + " :" + sphinx.getPrice());
        }
    }

}
