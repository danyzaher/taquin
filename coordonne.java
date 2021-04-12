package taquin;

public class coordonne {
    int x,y;
    public coordonne (int xx, int yy) {
        this.setX(xx);this.setY(yy);
    }
    public void setX(int p) {
        x = p;
    }
    public void setY(int p) {
        y = p;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
