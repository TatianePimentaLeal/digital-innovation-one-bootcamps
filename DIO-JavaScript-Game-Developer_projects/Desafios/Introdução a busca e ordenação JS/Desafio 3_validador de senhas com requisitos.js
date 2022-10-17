let stop = 0;

  do {
    let password = gets(),
    upperCase = password.toLocaleUperCase(),
    lowerCase = password.loLocaleLowerCase(),
    lengthVerification = password.length >= 6 && password.length <=32,
    numberCheck = password.match(/(\d)/i),
    specialChar = password.normalize('NFD').replace(/[\u0300-\u036f]/g, "");

    if (password.length === 0) {

      } else {
        if (password !== upperCase && 
          password !== lowerCase && 
          password !== specialChar && 
          numberCheck && lengthVerification) {
          console.log("Senha válida.");
        } else {
          console.log("Senha inválida.");
      }
    }
        if (password.length === 0) stop = 1;
  } while (stop !== 1)



