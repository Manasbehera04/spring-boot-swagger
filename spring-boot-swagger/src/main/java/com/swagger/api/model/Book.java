package com.swagger.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5072062017315712232L;
	@Id
	@GeneratedValue
	private int bookId;
	private String bookName;
	private double price;
}
