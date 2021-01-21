package com.stream;

import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 */
public class MyDemo {
    public static void main(String[] args) {
        BigDecimal length = new BigDecimal(9.99);
        BigDecimal wide = new BigDecimal(10);
        BigDecimal high = new BigDecimal(10);
        System.out.println(length.multiply(wide).multiply(high));
        System.out.println(new BigDecimal(8000));
        System.out.println(length.multiply(wide).multiply(high).divide(new BigDecimal(8000), 2, RoundingMode.UP));
        System.out.println("" + "" + "");
        System.out.println(StringUtils.isNotBlank("" + "" + ""));
    }
}
