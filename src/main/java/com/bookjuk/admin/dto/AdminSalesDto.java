package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminSalesDto {
	private long today_sales;
	private long today_refund;
	private long tmonth_sales;
	private long tmonth_refund;	
	private long total_sales;
	private long total_refund;
	private Date sales_date;
	public long getToday_sales() {
		return today_sales;
	}
	public void setToday_sales(long today_sales) {
		this.today_sales = today_sales;
	}
	public long getToday_refund() {
		return today_refund;
	}
	public void setToday_refund(long today_refund) {
		this.today_refund = today_refund;
	}
	public long getTmonth_sales() {
		return tmonth_sales;
	}
	public void setTmonth_sales(long tmonth_sales) {
		this.tmonth_sales = tmonth_sales;
	}
	public long getTmonth_refund() {
		return tmonth_refund;
	}
	public void setTmonth_refund(long tmonth_refund) {
		this.tmonth_refund = tmonth_refund;
	}
	public long getTotal_sales() {
		return total_sales;
	}
	public void setTotal_sales(long total_sales) {
		this.total_sales = total_sales;
	}
	public long getTotal_refund() {
		return total_refund;
	}
	public void setTotal_refund(long total_refund) {
		this.total_refund = total_refund;
	}
	public Date getSales_date() {
		return sales_date;
	}
	public void setSales_date(Date sales_date) {
		this.sales_date = sales_date;
	}
	@Override
	public String toString() {
		return "AdminSalesDto [today_sales=" + today_sales + ", today_refund=" + today_refund + ", tmonth_sales="
				+ tmonth_sales + ", tmonth_refund=" + tmonth_refund + ", total_sales=" + total_sales + ", total_refund="
				+ total_refund + ", sales_date=" + sales_date + "]";
	}
	
	
	
}

