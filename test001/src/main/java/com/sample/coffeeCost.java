package com.sample;

public class coffeeCost {
    int age;
    int isCard;//  1：isCard
	int isBir;// 1：isBir
    int type;//0 : A 1：B
    
	public coffeeCost(int age, int isCard, int isBir, int type) {
		super();
		this.age = age;
		this.isCard = isCard;
		this.isBir = isBir;
		this.type = type;
	}
	public int getIsBir() {
		return isBir;
	}
	public void setIsBir(int isBir) {
		this.isBir = isBir;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIsCard() {
		return isCard;
	}
	public void setIsCard(int isCard) {
		this.isCard = isCard;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
		
	int getPrice(coffeeCost coffeeCost ){
		int initPrice = 20;
		int price =(coffeeCost.getAge()-20)*2+initPrice;//取模
		price = judgeType(coffeeCost, price);
		price = judgeCrad(coffeeCost, price);
		price = judgeBirthday(coffeeCost, price);
		return price;
	}
	
	int judgeType(coffeeCost coffeeCost, int price) {
		if (coffeeCost.getType() ==2 ) {
			price = price+5;
		}
		return price;
	}
	
	int judgeCrad(coffeeCost coffeeCost, int price){
		if (coffeeCost.getIsCard() == 1) {
			price=price-5;
		}
		return price;
	}
	int judgeBirthday(coffeeCost coffeeCost, int price){
		if(coffeeCost.getIsBir() == 1){
			price=price-5;
		}
		return price;
	}
	 
	 public static void main(String[] args) {
		 coffeeCost  cost = new coffeeCost(30,1,1,1);
		 int price = cost.getPrice(cost);
		 System.out.println(price);
	}
}
