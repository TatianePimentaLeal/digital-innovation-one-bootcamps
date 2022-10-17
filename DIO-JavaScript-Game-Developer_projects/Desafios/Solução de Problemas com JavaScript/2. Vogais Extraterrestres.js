/*Escreva um programa que, dado uma sequência de vogais, em um determinado alfabeto alienígena, contabilize, em um texto escrito com o mesmo alfabeto, quantas vogais o mesmo possui.*/

//let cases = parseInt(gets());
let alienVowels = ["a", "e", "i", "o", "u"];

function countingVowels (alienVowels) {
	for (i = 0; i <= alienVowels; i++) {
				if (alienVowels[i] === "a") {
			if (alienVowels[i] === "e") {
				if (alienVowels[i] === "i") {
					if (alienVowels[i] === "o") {
						if (alienVowels[i] === "u") {
							return true;
						} else {
							return false;
						}
					}
				}
			}
		}
	}
}


console.log(countingVowels(alienVowels));