// exercice 1


const number = (busarret)  => {
    
    let personnedanslebus = 0;

   
    for (let i = 0; i < busarret.length; i++) {
       
        personnedanslebus += busarret[i][0];
       
        personnedanslebus -= busarret[i][1];
    }

    
    return personnedanslebus;
}


console.log(number([[10,0],[3,5],[5,8]])); 
console.log(number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]])); 
console.log(number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]));

// exercice 2

const maskify = (caractere) => {

   caractere = 0;
   
   for(i=0; i<caractere.length; i++){

    hashtagcaractere = "#"
    caracteremasquer =  hashtagcaractere.repeat(12);
    
   }

   return caracteremasquer;
};


console.log(maskify('4556364607935616'));
    
