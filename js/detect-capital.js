/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
	var capCount = 0;
	var pos=-1;
	for(var i = 0; i < word.length; i++){
   		if(isUpper(word[i])) {
			capCount +=1;
			pos = i;
		}
	}
	if(capCount === word.length || capCount === 0) return true;
	else if(capCount === 1 && pos === 0) return true;
	return true;
};

function isUpper(c){
	return c == c.toUpperCase();
}

console.log(detectCapitalUse("USA"));
console.log(detectCapitalUse("leetcode"));
console.log(detectCapitalUse("Google"));
console.log(detectCapitalUse("AirBnb"));
console.log(detectCapitalUse("A"));
console.log(detectCapitalUse("a"));
console.log(detectCapitalUse("FlaG"));


