public interface GiftBoxBuilder {

        void add(Sweet sweet);
        void add(int index, Sweet sweet);
        void remove(int index);
        void remove();
        void printWeightBox();
        void printPriceBox();
        void printStuff();
        void reduceWeight(double weight);
        void reducePrice(double price);
}
