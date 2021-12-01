plugins {
    kotlin("jvm") version "1.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies { }

tasks.withType<Test> {
    dependencies {
        testImplementation("org.jetbrains.kotlin:kotlin-test")
    }
}