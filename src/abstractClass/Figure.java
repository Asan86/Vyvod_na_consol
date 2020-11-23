package abstractClass;

abstract class Figure {
    float x, y;

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    public abstract float getPerimeter();

    public abstract float getArea();
}
