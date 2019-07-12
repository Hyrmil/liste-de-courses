package fr.projet.android.entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.projet.android.entities.Product;

/**
 * 
 * @author BODIN_2019-07-10
 *
 */

@Entity
@Table(name = "category")
public abstract class Category {

	private Integer idCategory;
	private String nameCategoory;
	private ArrayList<Product> products = new ArrayList<Product>();
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategory")
	public Integer getIdCategory() {
		return idCategory;
	}


	@Column(name = "category_name")
	public String getNameCategoory() {
		return nameCategoory;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catProduct")
	public ArrayList<Product> getProducts() {
		return products;
	}


	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return nameCategoory + " : " + products;
	}

}