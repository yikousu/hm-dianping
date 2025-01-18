package com.hmdp.utils;

import java.time.LocalDateTime;

public class SystemConstants {
    public static final String IMAGE_UPLOAD_DIR = "D:\\Code\\java\\demo\\dianping\\nginx-1.20.2\\html\\dianping\\imgs";
    public static final String USER_NICK_NAME_PREFIX = "user_";
    public static final int DEFAULT_PAGE_SIZE = 5;
    public static final int MAX_PAGE_SIZE = 10;

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }
}
