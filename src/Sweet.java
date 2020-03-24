

abstract class Sweet{

    private String name;
    private double weight;
    private double price;
    private String maker;


    public Sweet(double weight, double price, String name, String maker){
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.maker = maker;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString()
    {
        return "Вес: " + weight + " , " + "Цена: " + price + " , " + "Название: " + name  + " , " + "Производитель: " + maker;
    }
}
