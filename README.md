## 地味Tips

### queryDSLのQナントカEntityを自動生成する最低限のbuild.gradle.kts

```
plugins {
    kotlin("kapt") //kotlin用アノテーションプロセッサ(annotationからクラス自動生成したりする)
    //入れてビルドするとbuild/generated/フォルダが映える
    //dependencies内でkaptするのに必須
}

apply(plugin = "kotlin-kapt") //QEntity生成に必須

dependencies {
    implementation("com.h2database:h2:1.3.148")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    kapt("com.querydsl:querydsl-apt:5.0.0:jpa") //ここがQEntity生成のため必須
    implementation("com.querydsl:querydsl-jpa:5.0.0") //com.querydsl.jpa.impl.JPAQueryFactory利用のため必須

    // 略
}
```

参考


## ディレクトリ構成など
[テンプレートリポジトリ参考に](https://github.com/kannna5296/SpringBoot-OnionArchitecture-MultiModule-Template)
