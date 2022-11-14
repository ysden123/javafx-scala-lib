/*
 * Copyright (c) 2022. StulSoft
 */

plugins {
    application
    id("com.stulsoft.java-application-conventions")
    id("org.openjfx.javafxplugin") version ("0.0.13")
    id("extra-java-module-info")
}

dependencies {
    implementation(project(":lib"))
}

application {
    mainModule.set("com.stulsoft.app")
    mainClass.set("com.stulsoft.app.App")
}

javafx {
    version = "19"
    modules("javafx.controls", "javafx.fxml")
}

tasks.jar{
    manifest{
        attributes(
            "Implementation-Version" to archiveVersion
        )
    }
}

extraJavaModuleInfo {
    automaticModule("lib-${version}.jar", "com.stulsoft.lib")
}
