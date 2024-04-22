val name: String by settings
rootProject.name = name

pluginManagement {
	repositories {
		maven("https://maven.fabricmc.net/")
		maven("https://repo.legacyfabric.net/repository/legacyfabric/")
		gradlePluginPortal()
	}
}
