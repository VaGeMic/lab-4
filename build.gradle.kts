plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.21" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
