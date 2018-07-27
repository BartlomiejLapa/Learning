class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inQb = new Inner ( );

        System.out.println ("Min: " + inQb.min ( ) +
                "\nMax: " + inQb.max ( ) +
                "\nSrednia: " + inQb.avg ( ));
    }

    class Inner {
        int m = nums[0];

        int min() {
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int sum = 0;
            for (int i = 0; i < nums.length; i++)
                sum += nums[i];

            return sum / nums.length;
        }
    }
}



class NestedClassDemo {
        public static void main (String args[]){
            int x[] = { 3, 2, 1, 11, 23, 515 ,11, 111 ,230 ,-33, -1, 0 };
            Outer outer = new Outer (x);
            outer.analyze ();
        }
}
