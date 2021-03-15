package com.example.demo.dto;


public class OrderStatus {
    private Order order;
    private String status;//progress,completed
    private String message;
	public OrderStatus(Order order, String status, String message) {
		this.order=order;
		this.status=status;
		this.message=message;
		
	}
	public OrderStatus() {
		
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
    public String toString() { 
        return "msg-->"+this.order.getOrderId()+"---"+this.status+"---"+this.message;
    } 
    
}
