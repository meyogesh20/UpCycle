package com.upcycle.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodid;
	private String pname;
	private String brand;
	private String category;
	private String subcat;
	private int price;
	private String photo;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_timestamp", insertable = false, updatable = false)
	private Date createdTimestamp;
	@ManyToOne
	@JoinColumn(name="sellerId")
	private Seller seller;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getSubcat() {
		return subcat;
	}
	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		System.out.println("set photo");
		this.photo = photo;
	}
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	@Transient
	public String getProductPhotoPath() {
		if(photo == null) return null;
		System.out.println("/proudct-images/"+prodid+"/"+photo);
		return "/proudct-images/"+prodid+"/"+photo;
		
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", pname=" + pname + ", category=" + category + ", subcat=" + subcat + ", price="
				+ price + ", photo=" + photo + ", createdTimestamp=" + createdTimestamp + "]";
	}
}
