package web.model;

public class Car {
    public Long id;
    public String name;
    public int series;

    public Car(Long id) {
        this.id = id;
    }

    public Car(Long id,String name, int series) {
        this.id = id;
        this.name = name;
        this.series = series;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
