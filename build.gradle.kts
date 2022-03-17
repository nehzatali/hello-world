plugins {
    application
    kotlin("jvm") version "1.3.70"
    `maven-publish`
}

application {
    mainClassName = "samples.HelloWorldKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
