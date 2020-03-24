import java.util.Comparator;

public class PriceComporator implements Comparator<Sweet> {

    @Override
    public int compare(Sweet o1, Sweet o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        if (o1.getPrice() > o2.getPrice()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
