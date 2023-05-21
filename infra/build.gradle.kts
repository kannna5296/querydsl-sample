plugins {
    kotlin("kapt") //kotlin用アノテーションプロセッサ(annotationからクラス自動生成したりする)
    //入れてビルドするとbuild/generated/フォルダが映える
}

apply(plugin = "kotlin-kapt")
apply(plugin = "org.jetbrains.kotlin.plugin.spring")

dependencies {
    implementation("com.h2database:h2:1.3.148")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // https://mvnrepository.com/artifact/com.querydsl/querydsl-jpa
    kapt("com.querydsl:querydsl-jpa:4.1.3")
    ("com.querydsl:querydsl-core:4.1.3")
// // // https://mvnrepository.com/artifact/com.querydsl/querydsl-kotlin-codegen
//    implementation("com.querydsl:querydsl-kotlin-codegen:5.0.0")
//    // https://mvnrepository.com/artifact/com.querydsl/querydsl-apt
//    implementation("com.querydsl:querydsl-apt:5.0.0")
    // infraはドメインに依存
    implementation(project(":domain"))
    implementation(project(":usecase"))
}
