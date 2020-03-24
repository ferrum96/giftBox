import java.util.Comparator;

public class WeightComporator implements Comparator<Sweet> {

    public int compare(Sweet o1, Sweet o2) {
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }
        if (o1.getWeight() > o2.getWeight()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
