package pl.sda.bookstore;

import pl.sda.bookstore.Order;
import pl.sda.bookstore.customer.Customer;
import pl.sda.bookstore.customer.User;

import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {

    Queue<Order> orderQueue = new LinkedList<>();


    public void add(Order order) {
        orderQueue.add(order);
    }

    public int orderCount() {

        return orderQueue.size();
    }

    public Order getNextOrder() {

        return orderQueue.remove();
    }

    public void removeOrder(Customer customer) {
        //spr czy to zamowienie usera usuwamy
       boolean isUser = customer instanceof User;

        orderQueue.stream().forEach((order) -> {
            if (order.getCustomer().equals(order)) {
                orderQueue.remove(order);
            } else {
                System.out.println("Nie znaleziono zamówienia o podanych danych użytkownika");
            }
        });
        // orderQueue.removeIf(order -> order.getCustomer().equals(customer));
        // nie ma elsa, usuniecie z predicate
    }
}
