# Quick start

- Include GitHub package repository in gradle

```groovy
repositories {
    // ...
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/ru-random-walk/event-exchange-contract")
        credentials {
            username = project.findProperty("user") ?: System.getenv("GITHUB_ACTOR")
            password = project.findProperty("token") ?: System.getenv("GITHUB_TOKEN")
        }
    }
}
```

- Add dependency in gradle

```groovy
dependencies {
    // ...
    implementation 'ru.random.walk:event-exchange-contract:0.0.1'
}
```

- Add your GitHub user login and token in local gradle.properties file

```properties
user=YourGithubLogin
token=YourGithubToken
```