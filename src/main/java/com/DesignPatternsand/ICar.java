package com.DesignPatternsand;

public interface ICar {
	//严格遵守开闭原则
	 default void ss(){
			System.out.println("Ss");
		}
	public abstract void pp();
	public void repair();
	void sell();
}
