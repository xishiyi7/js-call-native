## js-call-native
cordova(ionic/phonegap) plugin: "js call native"

## Usage
the plugin exposes the following method:

```javascript
cordova.plugins.jsCallNative.run(success,error);
```

```index.html
you should define a function called "sayHi()" in the "index.html"
when you call cordova.plugins.jsCallNative.run, it will call sayHi() function, also, we can do something in the native when you call the plugin.
```

## Example

```javascript
// when you do something, like demo button click event
function demoClick(){
  cordova.plugins.jsCallNative.run(success,error);
}
```

```index.html
function sayHi(){
  window.alert('Hi');
}
```

## with callbacks
in this plugin, you can do something simple in the function sayHi(), i will add more action in the future. thanks.
