# Android-NumPad

<img src="https://img.shields.io/badge/API-18%2B-brightgreen.svg" style="max-width:100%;"> [![](https://jitpack.io/v/wRorsjakz/Android-NumPad.svg)](https://jitpack.io/#wRorsjakz/Android-NumPad) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A simplistic and easy to use number pad for Android.

<img src="https://user-images.githubusercontent.com/39665412/51075695-3fbbfc00-16ca-11e9-9d0f-e1b511716f19.png" width="35%">

<br>

## Prerequisites
Add this in your root build.gradle file:
```java
allprojects {
    repositories {
     	...
        maven { url 'https://jitpack.io' }
    }
}
```

## Dependency
Add this to your module's build.gradle file:

```java
dependencies {
	...
		implementation 'com.github.wRorsjakz:Android-NumPad:1.0.1'
}
```

## Usage

Include the widget in your `xml` layout file:

```xml
<com.example.numpad.NumPad
        android:id="@+id/numpad_id"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```

Instantiate the numpad widget:

```java
NumPad numPad = findViewById(R.id.my_numpad);
numPad.setOnNumPadClickListener(new NumPadClick(new numPadClickListener() {
	@Override
	public void onNumpadClicked(ArrayList<Integer> nums) {
		Log.d("MYTAG", "onNumpadClicked: " + nums);
	}
}));
```

`onNumpadClicked(ArrayList<Integer> nums)` returns a `ArrayList<Integer>` of numbers that the user has entered till then. If the user presses delete when the arraylist is already empty, then it returns an empty arraylist.

## Configuration

Change the color of the button text:
```java
numpad.setButtonTextColor(@NonNull Context context, @NonNull int colorId);
```

Change color of numpad background
```xml
 <com.example.numpad.NumPad
 		...
        android:background="..."
     />

```

## Changelog

* 1.0.1
	* Initial Release


## License

```txt
Copyright 2019 Nicholas Gan

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```