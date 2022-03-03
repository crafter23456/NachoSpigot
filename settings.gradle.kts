pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
		maven("https://maven.elmakers.com/repository/")
        maven("https://nexus.velocitypowered.com/repository/maven-public/")
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    }
}

rootProject.name = "parent"
include(":NachoSpigot-API")
include(":NachoSpigot-Server")