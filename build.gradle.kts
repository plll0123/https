plugins {
	kotlin("jvm")
	kotlin("kapt")
	kotlin("plugin.spring") apply false
	kotlin("plugin.jpa") apply false
	id("org.springframework.boot") apply false
	id("io.spring.dependency-management")
}

java.sourceCompatibility = JavaVersion.valueOf("VERSION_${property("javaVersion")}")

allprojects {
	group = "${property("projectGroup")}"
	version = "${property("applicationVersion")}"

	repositories {
		mavenCentral()
	}
}

subprojects {
	apply(plugin = "org.jetbrains.kotlin.jvm")
	apply(plugin = "org.jetbrains.kotlin.kapt")
	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "org.jetbrains.kotlin.plugin.jpa")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")

	dependencyManagement {
		imports {
			mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudDependenciesVersion")}")
		}
	}

	dependencies {
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("com.ninja-squad:springmockk:${property("springMockkVersion")}")
		annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	}

	tasks.getByName("bootJar") {
		enabled = false
	}

	tasks.getByName("jar") {
		enabled = true
	}

}