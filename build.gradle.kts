plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.7.1"
    id("org.jetbrains.grammarkit") version "2022.3.2.2"
}

group = "github.enotvtapke"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure IntelliJ Platform Gradle Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        create("IC", "2025.1.4.1")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)

        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "251"
        }

        changeNotes = """
            Initial version
        """.trimIndent()
    }
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
}

sourceSets {
    main {
        java {
            srcDirs("src/main/gen")
        }
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}


tasks {
    generateLexer {
        sourceFile.set(file("src/main/kotlin/github/enotvtapke/cobolsyntax/Cobol.flex"))
        targetOutputDir.set(file("src/main/gen/github/enotvtapke/cobolsyntax"))
        purgeOldFiles.set(true)
    }

    generateParser {
        sourceFile.set(file("src/main/kotlin/github/enotvtapke/cobolsyntax/Cobol.bnf"))
        targetRootOutputDir.set(file("src/main/gen"))
        pathToParser.set("github/enotvtapke/cobolsyntax/psi/parser/CobolParser.java")
        pathToPsiRoot.set("github/enotvtapke/cobolsyntax/psi")
        purgeOldFiles.set(true)
    }
}
