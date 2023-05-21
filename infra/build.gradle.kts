plugins {
    kotlin("kapt") //kotlin用アノテーションプロセッサ(annotationからクラス自動生成したりする)
    //入れてビルドするとbuild/generated/フォルダが映える
}

apply(plugin = "kotlin-kapt")
apply(plugin = "org.jetbrains.kotlin.plugin.spring")

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Table")
}

dependencies {
    implementation("com.h2database:h2:1.3.148")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.hibernate:hibernate-core:5.6.12.Final")
    // https://mvnrepository.com/artifact/com.querydsl/querydsl-jpa
    kapt("com.querydsl:querydsl-apt:5.0.0:jpa") //ここがQEntity生成のため必須
    implementation("com.querydsl:querydsl-jpa:5.0.0") //queryDSLのインポート
//    kapt("com.querydsl:querydsl-core:4.1.3")
//    "https://mvnrepository.com/artifact/com.querydsl/querydsl-kotlin-codegen")
    kapt("com.querydsl:querydsl-kotlin-codegen:5.0.0")
//    // https://mvnrepository.com/artifact/com.querydsl/querydsl-apt
//    implementation("com.querydsl:querydsl-apt:5.0.0")
    // infraはドメインに依存
    implementation(project(":domain"))
    implementation(project(":usecase"))
}
