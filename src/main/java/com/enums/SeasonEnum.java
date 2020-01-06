package com.enums;

/**
 * 
 * @author geekjason
 *
 */
public enum SeasonEnum {
	//spring春天
	SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);
	private int seq;
	SeasonEnum(int seq){
		this.seq = seq;
	}
	public int getSeq()
	{
		return seq;
	} 
	
	
}
