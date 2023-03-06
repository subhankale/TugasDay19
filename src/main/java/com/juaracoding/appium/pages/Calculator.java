package com.juaracoding.appium.pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @AndroidBy(id = "com.google.android.calculator:id/digit_1")
    private MobileElement btnSatu;
    @AndroidBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;
    @AndroidBy(id = "com.google.android.calculator:id/op_add")
    private MobileElement btnTambah;
    @AndroidBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;
    @AndroidBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;

    //Method
    public void calcAdd() {
        btnSatu.click();
        btnTambah.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public String getTxtResult() {
        return hasil.getText();
    }
}
