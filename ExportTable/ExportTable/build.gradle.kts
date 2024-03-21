plugins {
    id("java")
}

group = "at.martinklestil"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")


    // https://mvnrepository.com/artifact/org.apache.poi/poi
    implementation("org.apache.poi:poi:5.2.5")

    // https://mvnrepository.com/artifact/com.opencsv/opencsv
    implementation("com.opencsv:opencsv:5.9")
    // https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
    implementation("org.apache.poi:poi-ooxml:5.2.5")

}

tasks.test {
    useJUnitPlatform()
}