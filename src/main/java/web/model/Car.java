package web.model;

public class Car {
    private String model;
    private int productionYear;
    private int distance;

    public Car (String model, int productionYear, int distance) {
        this.model = model;
        this.productionYear = productionYear;
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getDistance() {
        return distance;
    }
}
