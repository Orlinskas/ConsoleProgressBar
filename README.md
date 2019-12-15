# ConsoleProgressBar
## How to

### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
  
### Step 2. Add the dependency

```java
dependencies {
	        implementation 'com.github.Orlinskas:ConsoleProgressBar:Tag'
	}
```  

## Version stable Tag: 1.1

##  Usage

```kotlin
 val progressBar = findViewById<ConsoleProgressBar>(R.id.activity_main_console_progress_bar)

        //settings
        progressBar.setColor(resources.getColor(R.color.colorAccent))
        progressBar.setStrokeWidth(15f)

        // active management
        progressBar.start()
        progressBar.stop()

        //or
        progressBar.intermediate(true)
```  

### XML

```java
 <com.orlinskas.consoleprogressbar.ConsoleProgressBar
        android:id="@+id/activity_main_console_progress_bar"
        android:layout_width="190dp"
        android:layout_height="187dp"
        android:layout_centerInParent="true"
        app:color="@color/colorAccent"
        app:intermediate="true"
        app:strokeWidth="20sp" />
```  	


