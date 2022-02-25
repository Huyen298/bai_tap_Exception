public class Triangle {
    private int a,b,c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        if (a<=0|| b<=0||c<=0){
            throw new IllegalTriangleException("Chiều dài cạnh không thể âm");
        }
        if (a+b<=c||b+c<=a||a+c<=b){
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
