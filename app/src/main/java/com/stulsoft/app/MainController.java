/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.app;

import com.stulsoft.lib.SomeService;
import com.stulsoft.lib.list.SomeList;
import com.stulsoft.lib.service.subservice.SubService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML
    private TextArea result;

    public void onQuit() {
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
}
