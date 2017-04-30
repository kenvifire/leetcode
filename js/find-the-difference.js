/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
	return compareMap(getMap(s), getMap(t));
    
};

function getMap(s){
	var map = new Object();
	for(var i = 0; i < s.length; i++){
		var key = s[i];
		var value = map[key];
		if(value === undefined){
			value = 1;
		}else{
			value += 1;
		}
		map[key] = value;
	}
	return map;
}

function compareMap(m1, m2){
	for(var key in m2) {
		var v2 = m2[key];
		var v1 = m1[key];
		if(v1 === undefined || v1 < v2) return key;
	}
}
		
console.log(findTheDifference("abcd", "abcde"));
console.log(findTheDifference("", "a"));
console.log(findTheDifference("a", "aa"));
console.log(findTheDifference("ab", "abb"));

			

