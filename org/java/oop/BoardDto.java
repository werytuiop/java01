package org.java.oop;

import java.util.Date;

public class BoardDto {

	private int no;
	private String title;
	private String memo;
	private Date day;

	public void setNo(int no) {
		this.no = no;
	}

	public int getNo() {
		return this.no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public Date getDay() {
		return this.day;
	}

	@Override
	public String toString() {
		return "BoardDto\n [no=" + no + ",\n title=" + title + ",\n memo=" + memo + ",\n day=" + day + "]";
	}

}
