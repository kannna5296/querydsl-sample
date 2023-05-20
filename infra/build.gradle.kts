dependencies {
    implementation("com.h2database:h2:1.3.148")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // https://mvnrepository.com/artifact/com.querydsl/querydsl-jpa
    implementation("com.querydsl:querydsl-jpa:4.1.3")
//// https://mvnrepository.com/artifact/com.querydsl/querydsl-kotlin-codegen
//    implementation("com.querydsl:querydsl-kotlin-codegen:5.0.0")
    // infraはドメインに依存
    implementation(project(":domain"))
    implementation(project(":usecase"))
}
