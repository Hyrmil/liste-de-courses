package fr.projet.android.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author BODIN_2019-07-10
 * Generated 5 ao�t 2019 19:35:01 by Hibernate Tools 4.3.5.Final
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "product", schema = "product_db")
public class Product implements Serializable {

	private Integer idProduct;
	private Category category;
	private String productName;

	//Constructors
	public Product() {
	}

	public Product(Integer idProduct, Category category, String productName) {
		this.idProduct = idProduct;
		this.category = category;
		this.productName = productName;
	}

	//Getters & Setters
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product", unique = true, nullable = false)
	public Integer getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id_fk", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "product_name", nullable = false, length = 45)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	// Method toString()
	@Override
	public String toString() {
		return "Product " + idProduct + ", nom : " + productName;
	}
}
