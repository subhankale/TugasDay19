package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;

public class Calculator2 {
    private AndroidDriver<MobileElement> driver;

    public Calculator2(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @AndroidBy(id = "com.google.android.calculator:id/digit_3")
    private MobileElement btnTiga;
    @AndroidBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;
    @AndroidBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnKali;
    @AndroidBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;
    @AndroidBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;

    //Method
    public void calcAdd() {
        btnTiga.click();
        btnKali.click();
        btnEmpat.click();
        btnSamaDengan.click();
    }

    public String getTxtResult() {
        return hasil.getText();
    }
}
