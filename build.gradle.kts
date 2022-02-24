val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val exposed_version: String by project
val hikari_version: String by project
val postgresql_version: String by project
val koin_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.0"
}

group = "fr.alefaux"
version = "0.0.1"
application {
    mainClass.set("fr.alefaux.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    // Exposed & Postgresql
    implementation("org.jetbrains.exposed:exposed:$exposed_version")
    implementation("com.zaxxer:HikariCP:$hikari_version")
    implementation("org.postgresql:postgresql:$postgresql_version")

    // Koin
    implementation("io.insert-koin:koin-core:$koin_version")
    implementation("io.insert-koin:koin-ktor:$koin_version")
    implementation("io.insert-koin:koin-logger-slf4j:$koin_version")
}