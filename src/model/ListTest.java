package model;

import java.io.Serializable;

public class ListTest implements Serializable {
	private String moji;
	private int number;

	public ListTest() {}

	public String getMoji() {
		return this.moji;
	}
	public void setMoji(String moji) {
		this.moji = moji;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
