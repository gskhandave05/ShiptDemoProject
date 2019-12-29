/**
 * 
 */
package com.gk.shipt.ordersapi.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * @author gauravkhandave
 *
 */
@Embeddable
public class ProductCategoryProduct {
	
	@Column(name = "product_id")
	private Long productId;
	@Column(name = "product_category_id")
	private Long productCategoryId;
	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * @return the productCategoryId
	 */
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	/**
	 * @param productCategoryId the productCategoryId to set
	 */
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	
}
