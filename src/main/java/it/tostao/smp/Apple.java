package it.tostao.smp;

/**
 * Created by Slawomir Leski <slawomir.leski@buschgroup.com> on 17.06.2015.
 */
public class Apple {

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    private int weight = 0;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weigth) {
        this.weight = weigth;
    }

    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
