plugins {
    `java-library`
}

dependencies {
    implementation(project(":NachoSpigot-API"))
    implementation("io.netty:netty-all:4.1.68.Final")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("net.sf.trove4j:trove4j:3.0.3")
    implementation("it.unimi.dsi:fastutil:8.5.8")
    implementation("net.jafama:jafama:2.3.2")
    implementation("net.sf.jopt-simple:jopt-simple:5.0.4")
    implementation("jline:jline:2.12.1")
    implementation("org.apache.logging.log4j:log4j-core:2.17.1")
    implementation("org.slf4j:slf4j-api:1.7.32")
    implementation("org.mockito:mockito-core:1.10.19")
    implementation("com.eatthepath:fast-uuid:0.2.0")
    implementation("com.velocitypowered:velocity-native:1.1.0-SNAPSHOT")
    implementation("org.spigotmc:minecraft-server:1.8.8-SNAPSHOT")
    runtimeOnly("org.xerial:sqlite-jdbc:3.7.2")
    runtimeOnly("mysql:mysql-connector-java:5.1.14")
    testImplementation("org.ow2.asm:asm:9.2")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.hamcrest:hamcrest-library:1.3")
}

description = "NachoSpigot-Server"