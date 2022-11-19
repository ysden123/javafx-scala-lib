/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.app;

import com.stulsoft.lib.SomeService;
import com.stulsoft.lib.async.AsyncService;
import com.stulsoft.lib.jlib.JavaLibService;
import com.stulsoft.lib.list.SomeList;
import com.stulsoft.lib.math.MathService;
import com.stulsoft.lib.service.subservice.SubService;
import com.stulsoft.lib.utils.SystemUtils;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML
    private TextArea result;

    @FXML
    private MenuItem asyncServiceMenuItem;

    public void onQuit() {
        SystemUtils.shutdown();
        Platform.exit();
    }

    public void onSomeService() {
        result.setText(Integer.toString((new SomeService(300)).sum(10, 20)));
    }

    public void onSubService() {
        var subService = new SubService();
        var text = subService.show();
        result.setText(text);
    }

    public void onShowList() {
        var someList = new SomeList();
        result.setText(String.join("\n", someList.show()));
    }

    public void onMathService() {
        var mathService = MathService.service();
        result.setText(mathService.show());
    }

    public void onJavaLibService() {
        result.setText(JavaLibService.show());
    }

    public void onAsyncService() {
        var asyncService = new AsyncService();
        result.setText("Please wait ...");
        asyncServiceMenuItem.setDisable(true);
        asyncService.show(ar -> {
            result.setText(ar);
            asyncServiceMenuItem.setDisable(false);
        });
    }
}
