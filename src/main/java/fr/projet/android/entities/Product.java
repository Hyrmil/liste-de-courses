package fr.projet.android.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author BODIN_2019-07-10
 *
 */

@Entity
@Table(name = "product")
public class Product {

	private Integer idproduct;
	private String nameProduct;
	private Category catProduct;

	// Getters and Setters

	@Column(name = "product_name")
	public String getNameProduct() {
		return nameProduct;
	}

	@Column(name = "product_name")
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCategory", nullable = false, foreignKey = @ForeignKey(name = "idcategoryFK"))
	public Category getCatProduct() {
		return catProduct;
	}

	public void setCatProduct(Category catProduct) {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduct")
	public Integer getIdproduct() {
		return idproduct;
	}

	// Constructor

	public Product() {
		super();
	}

	public Product(String nameProduct, Category catProduct) {
		this.nameProduct = nameProduct;
		this.catProduct = catProduct;
	}

	// Methods

	@Override
	public String toString() {
		return "Product : " + nameProduct +  catProduct;
	}

}