package com.hua.utils;

import org.junit.Test;

public class TxtIOUtilsTest {

    //路径存在，正常读取
    @Test
    public void readTxtTest() {
        String str = TxtIOUtils.readTxt("C:\\Users\\hua'xin\\Desktop\\gongcheng\\text\\orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtIOUtils.writeTxt(elem[i], "C:\\Users\\hua'xin\\Desktop\\gongcheng\\writer\\ans.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
    	String str = TxtIOUtils.readTxt("C:\\Users\\hua'xin\\Desktop\\gongcheng\\text\\none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
        	TxtIOUtils.writeTxt(elem[i], "C:\\Users\\hua'xin\\Desktop\\gongcheng\\writer\\none.txt");
        }
    }

}



