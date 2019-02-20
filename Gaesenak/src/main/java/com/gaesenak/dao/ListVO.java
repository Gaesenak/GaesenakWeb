package com.gaesenak.dao;

import java.util.Date;

public class ListVO {

	private int listNum;
	private String listTitle;
	private String listWriter;
	private String listContent;
	private Date listDate;
	private String listFileName;
	private String listFilePath;
	private int readNum;
	
	public int getListNum() {
		return listNum;
	}
	public void setListNum(int listNum) {
		this.listNum = listNum;
	}
	public String getListTitle() {
		return listTitle;
	}
	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}
	public String getListWriter() {
		return listWriter;
	}
	public void setListWriter(String listWriter) {
		this.listWriter = listWriter;
	}
	public String getListContent() {
		return listContent;
	}
	public void setListContent(String listContent) {
		this.listContent = listContent;
	}
	public Date getListDate() {
		return listDate;
	}
	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}
	public String getListFileName() {
		return listFileName;
	}
	public void setListFileName(String listFileName) {
		this.listFileName = listFileName;
	}
	public String getListFilePath() {
		return listFilePath;
	}
	public void setListFilePath(String listFilePath) {
		this.listFilePath = listFilePath;
	}
	public int getReadNum() {
		return readNum;
	}
	public void setReadNum(int readNum) {
		this.readNum = readNum;
	}
	
	@Override
	public String toString() {
		return "ListVO [listNum=" + listNum + ", listTitle=" + listTitle + ", listWriter=" + listWriter
				+ ", listContent=" + listContent + ", listDate=" + listDate + ", listFileName=" + listFileName
				+ ", listFilePath=" + listFilePath + ", readNum=" + readNum + "]";
	}
	
	
}
