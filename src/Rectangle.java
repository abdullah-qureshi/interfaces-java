public class Rectangle implements Sorter<Rectangle> {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int compare(Rectangle r1, Rectangle r2) {
        return Integer.compare(r1.calculateArea(), r2.calculateArea());
    }
}