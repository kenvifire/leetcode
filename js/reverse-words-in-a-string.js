/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
	var start = 0;
	var end = 0;
	var result = [];
	
	for(var i = 0; i < s.length;) {
		while(i < s.length && s[i] !== ' ') i++;
		end = i-1;
		swap(result,s,start,end);
		if(i < s.length) result[i]=' ';
		i++;
		start = i;
		end = i;
	}

	swap(result,s,end,s.length-1);
	return result.join("");
		   
};
function swap(r,s, start, end) {
	for(var i = end; i >= start; i-- ){
		r[start + end - i] = s[i];	
	}
}

console.log(reverseWords("Let's take LeetCode contest"));
//console.log(reverseWords(" Let's take LeetCode contest "));
//console.log(reverseWords("  "));
//console.log(reverseWords(" a b"));
//console.log(reverseWords("abc"));
//console.log(reverseWords("  contest "));


