/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function(s) {
	var result = [];
	var start = 0, end = s.length - 1;
	
	while(start <= end) {
		result[start] = s[end];
		result[end] = s[start];
		start++;
		end--;
	}    
	return result.join("");
};

console.log(reverseString("abc"));
