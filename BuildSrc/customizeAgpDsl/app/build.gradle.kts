            plugins {
                    id("com.android.application")
                    kotlin("android")
            }

            apply<ExamplePlugin>()

            android { 
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }
                buildTypes {
    debug {
        the<BuildTypeExtension>().invocationParameters = "-debug -log"
    }
}
            }