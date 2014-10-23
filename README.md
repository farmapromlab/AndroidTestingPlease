#AndroidTestingPlease
[![Build Status](https://travis-ci.org/farmapromlab/AndroidTestingPlease.svg?branch=master)](http://travis-ci.org/farmapromlab/AndroidTestingPlease)

AndroidTestingPlease is an Android project that uses Robolectric and Espresso for testing and Gradle to build. Project uses several jars:
- espresso-1.1.jar
- testrunner-1.1.jar
- testrunner-runtime-1.1.jar
- robolectric-2.4-SNAPSHOT-jar-with-dependencies.jar 

Robolectric is added as a jar because we had to compiled Robolectric repo with one shadow added. It had to be done because of robolectric issue:
https://github.com/robolectric/robolectric/issues/898

##Setup

Setup required [Java 1.6](http://www.oracle.com/technetwork/java/javase/downloads/index.html), [Android SDK](http://developer.android.com/sdk/index.html), [Gradle 2.1](http://gradle.org/downloads) and git.

1. Clone AndroidTestingPlease

  ```bash
  git clone https://github.com/farmapromlab/AndroidTestingPlease.git
  ```

2. Build project

  ```bash
  ./gradlew clean build
  ```

3. Run robolectric tests

  ```bash
  ./gradlew clean test
  ```

4. Run espresso tests (Make sure that your phone or emulator is connected)

  ```bash
  ./gradlew clean connectedAndroidTest
  ```

##You can also fire your test in [IntelliJ IDEA 14 EAP](https://www.jetbrains.com/idea/nextversion/)
