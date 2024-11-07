// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}

externalNativeBuild {
    // Encapsulates your CMake build configurations.
    cmake {
        // Provides a relative path to your CMake build script.
        path "CMakeLists.txt"
    }
}