package com.springlec.base.model;

public class MDto {
	
	int seqno;
	String image;
	String title;
	
	public MDto() {
		
	}
	
	public MDto(int seqno, String image, String title) {
		super();
		this.seqno = seqno;
		this.image = image;
		this.title = title;
	}
	
	public int getSeqno() {
		return seqno;
	}
	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}