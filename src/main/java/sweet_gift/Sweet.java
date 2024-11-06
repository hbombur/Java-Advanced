package sweet_gift;

class Sweet {

    private final String name;
    private final int weight;
    private final double price;
    private final String uniqueParameter;

    public Sweet(String name, int weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    public void getInfoSweet(){
        System.out.printf(" - %s (%dg, %.2f$)%nОсобенность данной сладости - %s\n",
                this.getName(),
                this.getWeight(),
                this.getPrice(),
                this.getUniqueParameter());
    }
}
