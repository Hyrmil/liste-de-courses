package fr.projet.android.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author BODIN_2019-07-10
 * Generated 5 ao�t 2019 19:35:01 by Hibernate Tools 4.3.5.Final
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "category", catalog = "product_db")
public class Category implements Serializable {

	private Integer idCategory;
	private String categoryName;
	private Set<Product> products = new HashSet<Product>(0);

	//Constructors
	public Category() {
	}

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category(String categoryName, Set<Product> products) {
		this.categoryName = categoryName;
		this.products = products;
	}

	//Getters & Setters
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_category", unique = true, nullable = false)
	public Integer getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	@Column(name = "category_name", nullable = false, length = 45)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	//Method toString()
	@Override
	public String toString() {
		String result;
		System.out.print("Category " + idCategory + " : " + categoryName);
		for (Product product : products) {
			result = product.toString();
			System.out.println(result);
		}
		return "";
	}
}
