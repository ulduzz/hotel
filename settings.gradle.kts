pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Hotels"
include(":app")
include(":entities")
include(":data")
include(":common")
include(":domain")
include(":network")
include(":features")
include(":features:accounts")
include(":features:hotels")
