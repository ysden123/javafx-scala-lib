module com.stulsoft.app {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.desktop;

    requires com.stulsoft.lib;

    opens com.stulsoft.app to javafx.fxml;

    exports com.stulsoft.app;
}