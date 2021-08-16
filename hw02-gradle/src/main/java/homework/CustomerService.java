package homework;


import java.util.*;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    public TreeMap<Customer, String> map = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        Map.Entry<Customer, String> data = map.firstEntry();
        if (data != null) {
            return Map.entry(new Customer(data.getKey().getId(), data.getKey().getName(), data.getKey().getScores()), data.getValue());
        }
        return null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> data = map.higherEntry(customer);
        if (data != null) {
            return Map.entry(new Customer(data.getKey().getId(), data.getKey().getName(), data.getKey().getScores()), data.getValue());
        }
        return null;
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}
