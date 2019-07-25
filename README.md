[![](https://jitpack.io/v/ggjjack/jlog.svg)](https://jitpack.io/#ggjjack/jlog)

# JLog
Android Simple Log Library


Download
--------
This library use gradle


Project gradle
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

App gradle
```
dependencies {
  ...
  implementation 'com.github.ggjjack:jlog:1.0.1'
  ...
}
```

Use it
--------
Just log

```
  JLog.v("HJ", "Verbose Hello World");
  JLog.d("HJ", "Debug Hello World");
  JLog.i("HJ", "Info Hello World");
  JLog.w("HJ", "Warning Hello World");
  JLog.e("HJ", "Error Hello World");
```
