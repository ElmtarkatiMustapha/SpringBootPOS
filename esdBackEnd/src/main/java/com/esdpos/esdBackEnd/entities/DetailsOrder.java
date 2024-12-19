package com.esdpos.esdBackEnd.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "detailsOrders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailsOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float price;
	private int qnt;
	private float margin=0;
	private float discount=0;
	private String status="pending";
	private Long order_id;
	private Long product_id;
	private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at = LocalDateTime.now();
	
	
}
