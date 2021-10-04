package com.JavaTraining;

public class Partha implements Ragavan,Kumar{


	// calling Ragavan interface , Kumar interface, here for implementing.

	public void ooi() {
		moto();
		samsung();
		android();
		arun();
		love();
		bulb();

	}

	public static void main(String[]Args) {

		Partha ok=new Partha();
		ok.ooi();

	}

	@Override
	public void bulb() {
		System.out.println("bulb");

	}

	@Override
	public void arun() {
		System.out.println("arun");

	}

	@Override
	public void love() {
		System.out.println("love");

	}

	@Override
	public void moto() {
		System.out.println("moto");

	}

	@Override
	public void samsung() {
		System.out.println("samsung");

	}

	@Override
	public void android() {
		System.out.println("android");

	}}




