package com.imooc.homework;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Car_person p1 = new Car_person();
		p1.setId(1);
		p1.setName("奥迪");
		p1.setR_money(500.0);
		p1.setP_number(4);
		
		Car_person p2 = new Car_person();
		p2.setId(2);
		p2.setName("马自达");
		p2.setR_money(400.0);
		p2.setP_number(4);
		
		Car_person p3 = new Car_person();
		p3.setId(4);
		p3.setName("金龙");
		p3.setR_money(800.0);
		p3.setP_number(20);
		
		
		Car_stuff sf1 = new Car_stuff();
		sf1.setId(5);
		sf1.setName("松花江");
		sf1.setR_money(400.0);
		sf1.setWeight(4);
		
		Car_stuff sf2 = new Car_stuff();
		sf2.setId(6);
		sf2.setName("依维柯");
		sf2.setR_money(1000.0);
		sf2.setWeight(20);
		
		Car_per_stuff psf = new Car_per_stuff();
		psf.setId(3);
		psf.setName("皮卡雪");
		psf.setR_money(450.0);
		psf.setP_number(4);
		psf.setWeight(2);
		
		System.out.println("欢迎光临...");
		System.out.println("租车请输入1，输入0离开");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		if( i == 1 ) {
			System.out.println("车辆和租金信息如下: ");
			
			System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t\t"+"容量");
			System.out.printf(p1 +"\n"+ p2 +"\n"+psf+"\n"+p3+"\n"+sf1+"\n"+sf2+"\n");
		
			System.out.println("请输入租车的数量：");
			Scanner sc2 = new Scanner(System.in);
			int j = sc2.nextInt();
			
			double sum = 0; //总金额
			int person = 0; //载人总数目
			double weight = 0; //载货总重量
			int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
			//n1..n6,分别代表每辆车的出现次数
			
			for(int k = 1;k<=j ;k++) {
				System.out.println("请输入第 "+ k + "辆车的序号 ");
				Scanner sc3 = new Scanner(System.in);
				int m = sc3.nextInt();
				if(m==1) {
					n1++;
				}else if( m==2) {
					n2++;
				}else if( m==3) {
					n3++;
				}else if(m ==4) {
					n4++;
				}else if( m==5 ) {
					n5++;
				}else {
					n6++;
				}
			}
			System.out.println("请输入租借天数：");
			Scanner sc4 = new Scanner(System.in);
			int n = sc4.nextInt();
			//sum...
			sum = n*(n1*p1.getR_money()+n2*p2.getR_money()+n3*psf.getR_money()
			+n4*p3.getR_money()+n5*sf1.getR_money()+n6*sf2.getR_money());
			
			person = n1*p1.getP_number()+n2*p2.getP_number()+n4*p3.getP_number()+n3*psf.getP_number();
			weight = n3*psf.getWeight()+n5*sf1.getWeight()+n6*sf2.getWeight();
			
			System.out.println("账单如下所示 ... ");			
			System.out.println("载人的车有...");
			if(n1 > 0) System.out.println(p1.getName() + n1 );
			if(n2 > 0) System.out.println(p2.getName() + n2 );
			if(n3 > 0) System.out.println(psf.getName() + n3 );
			if(n4 > 0) System.out.println(p3.getName() + n4 );
			
			System.out.println("可载人数：" + person+"人");
			
			System.out.println("载货车有...");
			if(n3 > 0) System.out.println(psf.getName() + n3 );
			if(n5 > 0) System.out.println(sf1.getName() + n5 );			
			if(n6 > 0) System.out.println(sf2.getName() + n6 );
			System.out.println("可载货量..." + weight +"吨");
			
			System.out.println("总价格为..." + sum + "元");
			
		}else {
			System.out.println("Bye...");
		}
		
				
		
		
		
		
		
	}
}
