public class ChocolateBar extends Product {
    private int weight;
    private String taste;

    public ChocolateBar(String brand, String taste, float price, int weight) {
        super(brand, price);
        this.taste = taste;
        this.weight = weight;
    }

    /**
     * Переопределение метода displayInfo из класса Product
     * является примером Полиморфизма
     * так же для отображения нужного количества знаков после запятой используется %.2f
     *
     * @return изменный формат строки с добавлением нового параметра из класса BottleofWater
     */
    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("Название: %-10s |Вкус: %-10s |Цена: %.2f |Нетто: %-3d", brand, taste, price, weight);
    }

    public int getWeight() {
        return weight;
    }

    public String getTaste() {
        return taste;
    }


}
