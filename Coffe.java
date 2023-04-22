public class Coffe {

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    private Integer cost;

    public  String getName() {
        return name;

    }
    public Integer getCost() {
        return cost;
    }

    public Integer getDegrees() {
        return degrees;
    }

    public Integer getVolume() {
        return volume;
    }

    private Integer volume;

    private  Integer degrees;
    private String name;

    public Coffe(String name, Integer cost, Integer degrees, Integer volume){
        this.name = name;
        this.cost = cost;
        this.degrees = degrees;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s,%d",name, cost);
    }
}
