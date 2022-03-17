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

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

tasks.register<Copy>("pom") {
    dependsOn("generatePomFileForMavenPublication")
    from(layout.buildDirectory.dir("publications/maven/pom-default.xml"))
    into(layout.projectDirectory)
    rename("pom-default.xml", "pom.xml")
}

tasks.named("build") {
    finalizedBy("pom")
}
