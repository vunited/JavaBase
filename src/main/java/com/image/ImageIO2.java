package com.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageIO2 {

	public static String fileName = "d:/1.bmp";
	static File originalFile = new File(fileName);
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedImage bi = ImageIO.read(originalFile);
		
		int width = 100;
		int height = 200;
		BufferedImage binarized = new BufferedImage(width, 200, BufferedImage.TYPE_BYTE_BINARY);
		File files = new File(fileName);
		ImageIO.write(binarized, "bmp", files);
		
		
		
	}

}
