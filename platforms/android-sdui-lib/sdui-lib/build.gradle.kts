plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.cg.android.sdui.lib"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_21.toString()
    }
}

val libVersion = "1.0.0" // Define your library version, can be dynamic
val libGroupId = "com.cg.android.sdui" // Or your GitHub organization name
val libArtifactId = "sdui-lib"

afterEvaluate {
    // Ensures Android components are created before publishing setup
    publishing {
        publications {
            create<MavenPublication>("release") { // Or any name you prefer
                groupId = libGroupId
                artifactId = libArtifactId
                version = libVersion

                // Publish the AAR file from the 'release' build type
                from(components["release"]) // "release" is the name of the software component for Android libraries

                // Optional: Add sources and Javadoc JARs
                // artifact(sourcesJar) // Assuming sourcesJar task is defined
                // artifact(javadocJar) // Assuming javadocJar task is defined

                // POM metadata (optional but recommended)
                pom {
                    name.set(libArtifactId)
                    description.set("My Server-Driven UI Library for Android")
                    url.set("https://github.com/sanjiv-patel/sdui-poc-project") // Link to your repo
                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("sanjiv-patel")
                            name.set("Sanjivkumar Patel")
                            email.set("sanjivpatel.us@gmail.com")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/sanjiv-patel/sdui-poc-project.git")
                        developerConnection.set("scm:git:ssh://github.com:sanjiv-patel/sdui-poc-project.git")
                        url.set("https://github.com/sanjiv-patel/sdui-poc-project/tree/main")
                    }
                }
            }
        }
        repositories {
            maven {
                name = "GitHubPackages"
                // The URL format is: https://maven.pkg.github.com/OWNER/REPOSITORY_NAME
                // OWNER is your GitHub username or organization name.
                // REPOSITORY_NAME is the name of the repository where the package will be hosted.
                url = uri("https://maven.pkg.github.com/${System.getenv("sanjiv-patel")}/${System.getenv("sdui-poc-project")?.substringAfter('/')}")
                credentials {
                    // GITHUB_ACTOR is generally used for username with GITHUB_TOKEN for password
                    username = System.getenv("sanjiv-patel")
                    password = System.getenv("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")
                }
            }
        }
    }
}
dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    api(libs.connect.kotlin.okhttp)
    api(libs.connect.kotlin.google.java.ext)
    implementation(libs.kotlin.reflect)
    implementation(libs.protobuf.java)
    runtimeOnly(libs.connect.rpc.kotlin)

     implementation("com.google.protobuf:protobuf-kotlin:4.31.1")

}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
