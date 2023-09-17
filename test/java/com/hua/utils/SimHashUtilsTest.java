package com.hua.utils;


import org.junit.Test;

public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        String[] strings = {"三毛", "是", "我", "最喜欢", "的", "作家"};
        for (String string : strings) {
            String stringHash = SimHashUtils.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
    	 String str0 = TxtIOUtils.readTxt("C:\\Users\\hua'xin\\Desktop\\gongcheng\\text\\orig.txt");
	     String str1 = TxtIOUtils.readTxt("C:\\Users\\hua'xin\\Desktop\\gongcheng\\text\\orig_0.8_add.txt");
        System.out.println(SimHashUtils.getSimHash(str0));
        System.out.println(SimHashUtils.getSimHash(str1));
    }

}