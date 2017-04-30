/**
 * @param {string[]} words
 * @return {string[]}
 */
var keyboard = {
'q':1,'w':1,'e':1,'r':1,'t':1,'y':1,'u':1,'i':1,'o':1,'p':1,
'a':2,'s':2,'d':2,'f':2,'g':2,'h':2,'j':2,'k':2,'l':2,
'z':3,'x':3,'c':3,'v':3,'b':3,'n':3,'m':3};

var findWords = function(words) {
	var result = [];
	for(var i = 0; i < words.length; i++) {
		var key = keyboard[words[i][0].toLowerCase()];
		var flag = true;
		for(var j = 0; j < words[i].length; j++) {
			var cur_key = keyboard[words[i][j].toLowerCase()];
			console.log(words[i][j],cur_key, key);
			if(cur_key !== key) { flag = false; break;}
		}		
		if(flag)
			result.push(words[i]);
	}

	return result;
};

console.log(findWords(["asdfghjkl","qwertyuiop","zxcvbnm"]));
