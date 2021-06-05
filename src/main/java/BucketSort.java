import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {
    //Блочная сортировка(первый аргумент - сортируемый набор данных, второй аргумент - количество блоков)
    public static Double[] sort(Double[] arr, int n){
        //Если длина массива мньше двух возвращаем массив
        if(arr.length<2){
            return arr;
        }

        //Создаём массив списков(блоков), в данном варианте был выбран массив списков, поскольку мы заранее не знаем,
        // сколько элементов попадёт в каждый блок, а список легко позволяет добавлять новые элементы
        List<Double>[] buckets = new List[n];

        //Находим наибольший и наименьший элемент в массиве
        double max = arr[0], min=arr[0];

        for(int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        //Если наибольший элемент равен наименьшему возвращаем массив данных
        if(min==max){
            return arr;
        }

        //Распределяем входной массив по блокам(ячейкам), используя следующую формулу numOfBucket = n*(arr[i]-min)/(max - min),
        // где numOfBucket - номер блока, arr[i] - текущий элемент, требующий размещения в блоке,  max и min соответственно максимум и минимум функции
        for(int i=0; i<arr.length; i++){
            int numOfBucket = (int) (n*(arr[i]-min)/(max-min));
            //Если numOfBucket равен n(длине массива), то размещаем этот элемент в предпоследнем блоке
            if(numOfBucket == n){
                buckets[numOfBucket-1].add(arr[i]);
            }
            else {
                buckets[numOfBucket].add(arr[i]);
            }
        }

        //Сортируем каждый из полученных блоков рекурсивно до тех пор пока в блоке не останутся только одинаковые эелементы
        for(int j = 0; j< buckets.length; j++){
            if(!isElementsEqual(buckets[j])){
                buckets[j] = Arrays.asList(BucketSort.sort(buckets[j].toArray(new Double[0]), buckets[j].size()));
            }
        }

        //Инициализируем счётчик и массив для записи в него отсортированных элментов
        arr = new Double[arr.length];
        int count =0;

        //Записываем последовательно отсортированные блоки элементов в массив, если они не пустые
        for (int i = 0; i<buckets.length; i++){
            if(!buckets[i].isEmpty()){
                for(int j = 0; j<buckets[i].size(); j++) {
                    arr[count] = buckets[i].get(j);
                    count++;
                }
            }
        }
        //Возвращаем отсортированный массив
        return arr;
    }

    //Метод для проверки равности всех элементов(первый аргумент - список, в котором необходимо проверить равность всех элементов)
    public static boolean isElementsEqual(List<Double> list){
        boolean elementsEqual = true;

        //Проходим циклом по списку, и если  текущий элемент не равен первому присваиваем переменной elementsEqual = false
        // и прерываем выполнение цикла оператором break
        for(int i=0; i<list.size(); i++){
            if(list.get(0).compareTo(list.get(i))!=0){
                elementsEqual = false;
                break;
            }
        }
        return elementsEqual;
    }
}
