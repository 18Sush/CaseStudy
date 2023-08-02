package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Order {
	private String orderId;
    private User user;
    private List<Book> books;

    public Order(String orderId, User user, List<Book> books) {
        this.orderId = orderId;
        this.user = user;
        this.books = books;
    }
}
