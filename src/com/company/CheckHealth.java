package com.company;

// 老板:小王、小李开会,约定接口:只有定义的接口，只有方法的签名，但没有实现
// 你们分头去同时开发，按标准协作，调用
public interface CheckHealth {
    // 小王和小李只能写Checkup, int, double, age, height
    String CheckUp(int age, double height);
}
