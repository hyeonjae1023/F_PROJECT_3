package com.moviement.dto;

import java.util.Map;

import lombok.Data;

@Data
public class Seat extends Dto {
	public String seatNum;
	public String movieTitle;
	public String nickName;
	public boolean enabledSeat;
	public float price;

	public Seat(String seatNum, String movieTitle, String nickName, boolean enabledSeat,float price) {
		this.seatNum = seatNum;
		this.movieTitle = movieTitle;
		this.nickName = nickName;
		this.enabledSeat = enabledSeat;
		this.price = price;
	}

	public Seat(Map<String, Object> row) {
		super(row);
		this.seatNum = (String) row.get("seatNum");
		this.movieTitle = (String) row.get("movieTitle");
		this.nickName = (String) row.get("nickName");
		this.enabledSeat = (boolean) row.get("enabledSeat");
		this.price = (float) row.get("price");
	}
}