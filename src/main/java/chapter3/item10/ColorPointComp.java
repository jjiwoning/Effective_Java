package chapter3.item10;

public class ColorPointComp {
    private final Point point;
    private final Color color;

    public ColorPointComp(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointComp)) {
            return false;
        }
        ColorPointComp cp = (ColorPointComp) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    public Point getPoint() {
        return point;
    }

    public Color getColor() {
        return color;
    }
}
