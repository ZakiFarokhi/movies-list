/*
 * Created by omrobbie.
 * Copyright (c) 2018. All rights reserved.
 * Last modified 9/27/17 9:25 AM.
 */

package com.zaki.responsi.mvp.model.detail;

import com.google.gson.annotations.SerializedName;

public class ProductionCompaniesItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ProductionCompaniesItem{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}