plugins {
    `java-library`
}

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }
}

allprojects {
    apply(plugin = "java")
	apply(plugin = "maven-publish")

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

    repositories {
        mavenLocal()
        mavenCentral()

        maven("https://papermc.io/repo/repository/maven-public/")
		maven("https://maven.elmakers.com/repository/")
        maven("https://nexus.velocitypowered.com/repository/maven-public/")
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    }

    tasks.withType<JavaCompile> {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(17)
    }

    tasks.withType<Javadoc> {
        options.encoding = Charsets.UTF_8.name()
    }

    tasks.withType<ProcessResources> {
        filteringCharset = Charsets.UTF_8.name()
    }
}