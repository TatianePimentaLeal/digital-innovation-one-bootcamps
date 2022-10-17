/* let totalItems = gets();
let items = [];

for (let i = 0; i < totalItems; i++) {
  itens.push(parseInt(gets()));
}
*/

/*let totalItems = gets();

let items = [10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98];

let itemsPares = items.filter((items) => {
  return items % 2 === 0;
})

console.log(items);*/

//Correto vide exemplo

let num = 0;
let index = 0;

num = parseInt(gets());

let numeros = Array(num);

while (index < num ) {
  numero = parseInt(gets());
  if (numero >= 0 ) {
    numeros[index] = numero;
    index++;
  }
};

pares = numeros.filter(value => value % 2 == 0);
impares = numeros.filter(value => value % 2 != 0);
pares.sort((a, b) => a-b);
impares.sort((a, b) => b-a);

pares.forEach(i => console.log(i));
impares.forEach(i => console.log(i));