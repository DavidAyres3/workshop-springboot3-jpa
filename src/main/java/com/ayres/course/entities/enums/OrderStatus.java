package com.ayres.course.entities.enums;

public enum OrderStatus {
	// Lista dos possíveis estados de um pedido, cada um com um valor inteiro associado
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//campo para armazenar o código associado a cada estado de pedido
	private int code;
	
	//construtor que recebe o código e associa ao estado do pedido
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//método get para obter o código associado a um estado do pedido
	public int getCode() {
		return code;
	}
	
	//método que permite obter o estado de pedido com base no código
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code!");
	}
}
