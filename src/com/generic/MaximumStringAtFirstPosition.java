FirstPospackage com.generic;

public class MaximumStringAtFirstPosition {

        public static void main(String[] args) {
            System.out.println("...............String At First Position.............");
            System.out.println("Maximum String out Of Three String:");
            String x = "Peach", y = "Apple", z = "Banana";
            new com.generic.MaximumIntFirst(x, y, z).maximum();
        }
    public class Maximum<T extends Comparable<T>> {
        T x, y, z;

        public Maximum(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T maximum() {
            return  com.generic.MaximumIntFirst.maximum(x, y, z);
        }

        //determine max number out of three
        public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
            T max = x;  // assume x is max at initially
            if (y.compareTo(max) > 0) {
                max = y;   //y is max so far
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            System.out.println(max);
            return max;
        }
    }
}
