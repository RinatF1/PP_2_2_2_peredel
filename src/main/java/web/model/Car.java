package web.model;

public class Car {
    private String modelCar;
    private String colorCar;
    private int series;

    public Car(String modelCar, String colorCar, int series) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.series = series;
    }

    public Car() {
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                ", series=" + series +
                '}';
    }
}
