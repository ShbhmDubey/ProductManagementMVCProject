package com.rk.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="pprdtab")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCode=" + prdCode + ", prdCost=" + prdCost
				+ ", prdVen=" + prdVen + ", prdNote=" + prdNote + ", prdGst=" + prdGst + ", prdDis=" + prdDis + "]";
	}
	public Integer getPrdId() {
		return prdId;
	}
	public void setPrdId(Integer prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getPrdCode() {
		return prdCode;
	}
	public void setPrdCode(String prdCode) {
		this.prdCode = prdCode;
	}
	public Double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(Double prdCost) {
		this.prdCost = prdCost;
	}
	public String getPrdVen() {
		return prdVen;
	}
	public void setPrdVen(String prdVen) {
		this.prdVen = prdVen;
	}
	public String getPrdNote() {
		return prdNote;
	}
	public void setPrdNote(String prdNote) {
		this.prdNote = prdNote;
	}
	public Double getPrdGst() {
		return prdGst;
	}
	public void setPrdGst(Double prdGst) {
		this.prdGst = prdGst;
	}
	public Double getPrdDis() {
		return prdDis;
	}
	public void setPrdDis(Double prdDis) {
		this.prdDis = prdDis;
	}
	public Product(Integer prdId, String prdName, String prdCode, Double prdCost, String prdVen, String prdNote,
			Double prdGst, Double prdDis) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCode = prdCode;
		this.prdCost = prdCost;
		this.prdVen = prdVen;
		this.prdNote = prdNote;
		this.prdGst = prdGst;
		this.prdDis = prdDis;
	}
	@Id
	@Column(name="pid")
	@GeneratedValue
	private Integer prdId;
	@Column(name="pname")
	private String prdName;
	@Column(name="pcode")
	private String prdCode;
	@Column(name="pcost")
	private Double prdCost;
	@Column(name="pven")
	private String prdVen;
	@Column(name="pnote")
	private String prdNote;
	@Column(name="pgst")
	private Double prdGst;
	@Column(name="pdis")
	private Double prdDis;
	

}
