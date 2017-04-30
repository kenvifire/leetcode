//Definition for singly-linked list.
function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
	var head;
	var p;
	var car = 0;
    while(l1 !== null || l2 !== null){
		var v1,v2;
		if(l1 !== null) {
			v1 = l1.val;
			l1 = l1.next;	
		}else{
			v1 = 0;
		}

		if(l2 !== null) {
			v2 = l2.val;
			l2 = l2.next;
		}else {
			v2=0;
		}

		var result = v1 + v2 + car;
		console.log("v1:" + v1 +" v2:" + v2 +" car:"+car);
		if(result >= 10) {
			result = result - 10;
			car = 1;
		}else {
			car = 0;
		}

		if(head === undefined) {
			head = new ListNode(result);
			p = head;
		}else {
			p.next = new ListNode(result);
			p = p.next;
		}
	}	

	if(car > 0) {
		p.next = new ListNode(1);
	}
	return head;
    
};

var l1 = new ListNode(9);
l1.next = new ListNode(8);
//l1.next.next = new ListNode(3);

var l2 = new ListNode(1);
//l2.next = new ListNode(6);
//l2.next.next = new ListNode(4);

var l3 = addTwoNumbers(l1,l2);

console.log(toStr(l1));
console.log(toStr(l2));
console.log(toStr(l3));

function toStr(l) {
	var str= '';
	while(l != null) {
		str += l.val + '->' ;
        l = l.next;
    }
	return str;
}

