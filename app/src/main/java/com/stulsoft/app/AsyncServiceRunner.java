/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.app;

import com.stulsoft.lib.async.AsyncService;
import com.stulsoft.lib.utils.SystemUtils;

public class AsyncServiceRunner {

    public static void main(String[] args) {
        System.out.println("==>main");

        var asyncService = new AsyncService();
        asyncService.show(result -> {
            System.out.printf("result: %s%n", result);
            SystemUtils.shutdown();
        });
    }
}
