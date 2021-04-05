package com.genericutility;

import java.util.Random;

public class JavaUtils {
public int rannum()
{
	Random ran = new Random();
	int RANNUM = ran.nextInt(1000);
	return RANNUM;
}
}
