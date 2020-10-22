package com.huawei.push.examples;

import com.huawei.push.exception.HuaweiMesssagingException;

/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
		try {

//			new SendTestMessage().sendTestMessage();
			new SendDataMessage().sendTransparent();
			new SendNotifyMessage().sendNotification();
		} catch (HuaweiMesssagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}