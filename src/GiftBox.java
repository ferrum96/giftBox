import java.util.ArrayList;

public class GiftBox implements GiftBoxBuilder{

    private ArrayList<Sweet> sweets = new ArrayList<Sweet>();
    double countWeight = 0.0;
    double countPrice = 0.0;

    @Override
    public void add(int index, Sweet sweet) {
        sweets.add(index, sweet);
    }

    @Override
    public void add(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void remove(int index) {
        sweets.remove(index);
    }

    @Override
    public void remove() {
        sweets.remove(sweets.size() - 1);
    }

    @Override
    public void printWeightBox() {


        for (Sweet aSweet : sweets) {
            countWeight += aSweet.getWeight();
        }

        System.out.println("Вес подарка: " + countWeight + " гр.");
        countWeight = 0.0;
    }

    @Override
    public void printPriceBox() {

        for (Sweet aSweet : sweets) {
            countPrice += aSweet.getPrice();
        }

        System.out.println("Цена подарка: " + countPrice + " руб.");
        countPrice = 0.0;
    }

    @Override
    public void printStuff() {

        System.out.println("Содержимое подарка: ");

        for (Sweet aSweetList : sweets) {
            System.out.println(aSweetList);
        }
    }

    @Override
    public void reduceWeight(double weight) {

        for (Sweet aSweet : sweets) {
            countWeight += aSweet.getWeight();
        }

        WeightComporator myWeightComporator = new WeightComporator();
        sweets.sort(myWeightComporator);

        while (countWeight > weight) {
            remove();
            countWeight -= sweets.get(sweets.size()-1).getWeight();
        }
        countWeight = 0.0;
    }


    @Override
    public void reducePrice(double price) {

        for (Sweet aSweet : sweets) {
            countPrice += aSweet.getPrice();
        }

        PriceComporator myPriceComporator = new PriceComporator();
        sweets.sort(myPriceComporator);

        while (countPrice > price) {
            remove();
            countPrice -= sweets.get(sweets.size()-1).getPrice();
        }
        countPrice = 0.0;
    }


}
