dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")  {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
    }
    implementation("org.springframework.boot:spring-boot-starter-undertow")
}