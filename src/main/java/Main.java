import java.util.*;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[20];
        Random random = new Random();

        System.out.println("Пирамидальная сортировка:");

        //Сортировка 20 элементов упорядоченных по возрастанию пирамидальной сортировкой
        for (int i=0; i<20; i++){
            arr[i] = i+1;
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        long startTime = System.nanoTime();
        HeapSort.sort(arr);
        long totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 20 элементов упорядоченных по возрастанию: "+totalTime +" наносекунд.");

        //Сортировка 20 элементов упорядоченных по убыванию пирамидальной сортировкой
        arr = new double[20];
        for (int i=19; i>=0; i--){
            arr[i] = i+1;
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.nanoTime();
        HeapSort.sort(arr);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 20 элементов упорядоченных по убыванию: "+totalTime +" наносекунд.");

        //Сортировка 20 элементов случайно упорядоченных пирамидальной сортировкой
        arr = new double[20];
        for (int i=0; i<20; i++){
            arr[i] = (random.nextInt(100)+1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.nanoTime();
        HeapSort.sort(arr);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 20 элементов случайно упорядоченных: "+totalTime +" наносекунд.");

        //Сортировка 5000 элементов упорядоченных по возрастанию пирамидальной сортировкой
        arr = new double[5000];
        for (int i=0; i<5000; i++){
            arr[i] = i+1;
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.nanoTime();
        HeapSort.sort(arr);
        totalTime = System.nanoTime() - startTime;
        //System.out.println(Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 5000 элементов упорядоченных по возрастанию: "+totalTime +" наносекунд.");

        //Сортировка 5000 элементов упорядоченных по убыванию пирамидальной сортировкой
        arr = new double[5000];
        for (int i=4999; i>=0; i--){
            arr[i] = i+1;
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.nanoTime();
        HeapSort.sort(arr);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 5000 элементов упорядоченных по убыванию: "+totalTime +" наносекунд.");

        //Сортировка 5000 элементов случайно упорядоченных пирамидальной сортировкой
        arr = new double[5000];
        for (int i=0; i<5000; i++){
            arr[i] = (random.nextInt(5000)+1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.nanoTime();
        HeapSort.sort(arr);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 5000 элементов случайно упорядоченных: "+totalTime +" наносекунд.");

        //Сортировка 50 000 элементотв упорядоченных по возрастанию пирамидальной сортировкой
        arr = new double[50000];
        for (int i=0; i<50000; i++){
            arr[i] = i+1;
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        HeapSort.sort(arr);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 50 000 элементов упорядоченных по возрастанию: "+totalTime +" миллисекунд.");

        //Сортировка 50 000 элементотв упорядоченных по убыванию пирамидальной сортировкой
        arr = new double[50000];
        for (int i=49999; i>=0; i--){
            arr[i] = i+1;
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        HeapSort.sort(arr);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 50 000 элементов упорядоченных по убыванию: "+totalTime +" миллисекунд.");

        //Сортировка 50 000 элементов случайно упорядоченных пирамидальной сортировкой
        arr = new double[50000];
        for (int i=0; i<50000; i++){
            arr[i] = (random.nextInt(50000)+1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        HeapSort.sort(arr);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr));
        System.out.println("Время пирамидальной сортировки для 50 000 элементов случайно упорядоченных: "+totalTime +" миллисекунд.");

        System.out.println("Блочная сортировка:");

        Double[] arr2 = new Double[20];

        //Сортировка 20 элементов упорядоченных по возрастанию блочной сортировкой
        for (int i=0; i<20; i++){
            arr2[i] = (double) (i + 1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.nanoTime();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 20 элементов упорядоченных по возрастанию: "+totalTime +" наносекунд.");

        //Сортировка 20 элементов упорядоченных по убыванию блочной сортировкой
        arr2 = new Double[20];
        for (int i=19; i>=0; i--){
            arr2[i] = (double) (i + 1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.nanoTime();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 20 элементов упорядоченных по убыванию: "+totalTime +" наносекунд.");

        //Сортировка 20 элементов случайно упорядоченных блочной сортировкой
        arr2 = new Double[20];
        for (int i=0; i<20; i++){
            arr2[i] = (double)(random.nextInt(100)+1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.nanoTime();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.nanoTime() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 20 элементов случайно упорядоченных: "+totalTime +" наносекунд.");

        //Сортировка 5000 элементов упорядоченных по возрастанию блочной сортировкой
        arr2 = new Double[5000];
        for (int i=0; i<5000; i++){
            arr2[i] = (double) (i + 1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 5000 элементов упорядоченных по возрастанию: "+totalTime +" миллисекунд.");

        //Сортировка 5000 элементов упорядоченных по убыванию блочной сортировкой
        arr2 = new Double[5000];
        for (int i=4999; i>=0; i--){
            arr2[i] = (double) (i + 1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 5000 элементов упорядоченных по убыванию: "+totalTime +" миллисекунд.");

        //Сортировка 5000 элементов случайно упорядоченных блочной сортировкой
        arr2 = new Double[5000];
        for (int i=0; i<5000; i++){
            arr2[i] = (double)(random.nextInt(5000)+1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 5000 элементов случайно упорядоченных: "+totalTime +" миллисекунд.");

        //Сортировка 50 000 элементотв упорядоченных по возрастанию блочной сортировкой
        arr2 = new Double[50000];
        for (int i=0; i<50000; i++){
            arr2[i] = (double) (i + 1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время  блочной сортировки для 50 000 элементов упорядоченных по возрастанию: "+totalTime +" миллисекунд.");

        //Сортировка 50 000 элементотв упорядоченных по убыванию блочной сортировкой
        arr2 = new Double[50000];
        for (int i=49999; i>=0; i--){
            arr2[i] = (double) (i + 1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 50 000 элементов упорядоченных по убыванию: "+totalTime +" миллисекунд.");

        //Сортировка 50 000 элементов случайно упорядоченных блочной сортировкой
        arr2 = new Double[50000];
        for (int i=0; i<50000; i++){
            arr2[i] = (double)(random.nextInt(50000)+1);
        }
        //System.out.println("Исходный набор данных: \n"+Arrays.toString(arr2));
        startTime = System.currentTimeMillis();
        arr2 = BucketSort.sort(arr2, arr2.length);
        totalTime = System.currentTimeMillis() - startTime;
        //System.out.println("Набор данных после сортировки: \n"+Arrays.toString(arr2));
        System.out.println("Время блочной сортировки для 50 000 элементов случайно упорядоченных: "+totalTime +" миллисекунд.");
    }
}
