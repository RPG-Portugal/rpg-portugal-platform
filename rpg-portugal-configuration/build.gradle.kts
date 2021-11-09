plugins {
    kotlin("jvm") version "1.5.31"
}

group = "org.rpgportugal"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.8.9")
    implementation(project(":rpg-portugal-core"))
}