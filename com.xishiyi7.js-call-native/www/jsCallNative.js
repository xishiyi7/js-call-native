var exec = require('cordova/exec');

var JsCallNative = function(){};

// load into jsCallNative plugin
JsCallNative.prototype.run = function(success,error){
	exec(success,error,'JsCallNative','run',[]);
};

var jsCallNative = new JsCallNative();

module.exports = jsCallNative;