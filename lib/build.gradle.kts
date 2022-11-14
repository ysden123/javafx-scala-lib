/*
 * Copyright (c) 2022. StulSoft
 */

plugins {
    scala
    id("com.stulsoft.java-library-conventions")

}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.10")
}