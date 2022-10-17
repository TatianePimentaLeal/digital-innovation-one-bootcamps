/*let totalItems = parseInt(gets());

for (let i = 0; i < totalItems; i++) {
	let enterNewItem = (gets()).split(" ");
	let excludeDuplicate = new Set[enterNewItem];
	let orderedItems = [...excludeDuplicate].sort().toString().replace(/,/g, ' ');

	console.log(orderedItems);
};
*/

let cases = parseInt(gets()); 

for (let j = 0; j < cases; j++) {
    let enterNewItem = (gets()).split(" ");
    let excludeDuplicate = new Set(enterNewItem);
    let orderedItems = [...excludeDuplicate].sort().toString().replace(/,/g, ' '); 
    console.log(orderedItems);
};
