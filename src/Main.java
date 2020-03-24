public class Main {

    public static void main(String[] args) {

        GiftBox box = new GiftBox();
        box.add(new Chocolate(95.0, 55.5, "Milka", "Mondelez"));
        box.add(new Candy(250.0,199.0,"MERCI","Ferrero"));
        box.add(new Waffle(300.0,46.7,"Яшкино","КДВ Яшкино"));
        box.add(new Cookie(90.0,54.0,"Oreo","Mondelez"));
        box.add(new Cookie(90.0,54.0,"Oreo","Mondelez"));
        box.add(new Candy(50.0,65.9,"Kinder","Ferrero"));
        box.add(new Cookie(90.0,54.0,"Oreo","Mondelez"));
        box.add(new Candy(300, 160, "Raffaello","Ferrero"));
        box.add(1, new Candy(300, 160, "Raffaello","Ferrero"));
        box.remove(4);
        box.remove();
        box.printWeightBox();
        box.printPriceBox();
        box.printStuff();
        box.reducePrice(450.0);
        box.printWeightBox();
        box.printPriceBox();
        box.printStuff();
    }
}
