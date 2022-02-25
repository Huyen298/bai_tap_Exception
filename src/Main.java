public class Main {
    public static void main(String[] args) {
        try {
            Triangle a= new Triangle(6, 2, 7);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
