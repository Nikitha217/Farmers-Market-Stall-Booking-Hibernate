package com.market.bean;

import javax.persistence.*;

@Entity
@Table(name="VENDOR_TBL")
public class VendorBean {

    @Id
    @Column(name="VENDOR_ID")
    private String vendorID;

    @Column(name="VENDOR_NAME")
    private String vendorName;

    @Column(name="FARM_OR_SHOP_NAME")
    private String farmOrShopName;

    @Column(name="PRODUCT_CATEGORY")
    private String productCategory;

    private String mobile;
    private String email;

    @Column(name="CITY_OR_VILLAGE")
    private String cityOrVillage;

    private String status;

	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getFarmOrShopName() {
		return farmOrShopName;
	}

	public void setFarmOrShopName(String farmOrShopName) {
		this.farmOrShopName = farmOrShopName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCityOrVillage() {
		return cityOrVillage;
	}

	public void setCityOrVillage(String cityOrVillage) {
		this.cityOrVillage = cityOrVillage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}

