package com.imooc.homework;

public class Car_per_stuff {
	private int id;
	private String name;
	private double r_money;
	private int p_number;
	private double weight;
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getR_money() {
		return r_money;
	}
	public void setR_money(double r_money) {
		this.r_money = r_money;
	}
	public int getP_number() {
		return p_number;
	}
	public void setP_number(int p_number) {
		this.p_number = p_number;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + r_money + "元/天 \t 载人：" + p_number
				+ "人\t载货：" + weight + "吨";
	}
	
}
