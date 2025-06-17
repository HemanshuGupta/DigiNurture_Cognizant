public class pt2 {
    private static int objectCount = 0;
    public pt2() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        pt2 obj1 = new pt2();
        pt2 obj2 = new pt2();
        pt2 obj3 = new pt2();
        int count = pt2.getObjectCount();
        System.out.println("Number of objects created: " + count);
    }
}
