tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

java {
    version = 21
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}