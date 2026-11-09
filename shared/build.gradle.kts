plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    jvm()
    sourceSets{
        named("commonMain") {
            resources.srcDir("src/commonMain/composeResources")
        }
    }
    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
            implementation(libs.compose.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
            implementation(libs.pdfkmp)
            implementation(libs.pdfkmp.compose.resources)
            implementation(libs.pdfkmp.viewer)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}