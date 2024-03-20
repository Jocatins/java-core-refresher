// ************* Objects || Classes **************

class Desktop {
    String model;
    int price;

    // public String toString() {
    // return "hey";
    // }

    @Override
    public String toString() {
        return "Desktop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Desktop other = (Desktop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Desktop obj2) {
    // return this.model.equals(obj2.model) && this.price == obj2.price;

    // }

}

public class Lesson10 {
    public static void main(String[] args) {
        Desktop obj = new Desktop();

        obj.model = "Dell";
        obj.price = 900;

        Desktop obj2 = new Desktop();

        obj2.model = "Dell";
        obj2.price = 900;

        boolean result = obj.equals(obj2);

        System.out.println(result);
    }
}
