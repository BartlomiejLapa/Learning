public class test {
    public static void main(String args[]){
    double array1[] = {2.20, 1.5, 1.1, 2.8, 10,2 ,0.9, 1.1, 20.4, 21.5};

    double sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];

        }
        System.out.println("Srednia artytmetyczna: " + (sum/ array1.length));


    }
}
