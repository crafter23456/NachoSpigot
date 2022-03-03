plugins {
    `java-library`
}

dependencies {
    implementation("commons-lang:commons-lang:2.6")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("org.avaje:ebean:2.8.1")
    implementation("org.yaml:snakeyaml:1.15")
    implementation("net.md-5:bungeecord-chat:1.8-SNAPSHOT")
    implementation("org.jetbrains:annotations:23.0.0")
    implementation("org.checkerframework:checker-qual:3.21.2")
    implementation("net.kyori:adventure-key:4.9.3")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.hamcrest:hamcrest-library:1.3")
    compileOnly("net.sf.trove4j:trove4j:3.0.3")
}

description = "NachoSpigot-API"
