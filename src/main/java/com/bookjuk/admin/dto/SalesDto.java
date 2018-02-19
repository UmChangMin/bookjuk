package com.bookjuk.admin.dto;

import java.util.Date;

public class SalesDto {
	private long td_sales;
	private long td_refund;
	private long tm_sales;
	private long tm_refund;	
	private Date sales_date;
	
	public SalesDto(){}

	public long getTd_sales() {
		return td_sales;
	}

	public void setTd_sales(long td_sales) {
		this.td_sales = td_sales;
	}

	public long getTd_refund() {
		return td_refund;
	}

	public void setTd_refund(long td_refund) {
		this.td_refund = td_refund;
	}

	public long getTm_sales() {
		return tm_sales;
	}

	public void setTm_sales(long tm_sales) {
		this.tm_sales = tm_sales;
	}

	public long getTm_refund() {
		return tm_refund;
	}

	public void setTm_refund(long tm_refund) {
		this.tm_refund = tm_refund;
	}

	public Date getSales_date() {
		return sales_date;
	}

	public void setSales_date(Date sales_date) {
		this.sales_date = sales_date;
	}

	@Override
	public String toString() {
		return "SalesDto [td_sales=" + td_sales + ", td_refund=" + td_refund
				+ ", tm_sales=" + tm_sales + ", tm_refund=" + tm_refund
				+ ", sales_date=" + sales_date + "]";
	};
	
	
}

