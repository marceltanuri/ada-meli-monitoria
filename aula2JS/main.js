function main(){
    const nomes = ["Marcel", "Marcos", "Luiza"]
    listarArray(nomes)
}

function sayHello(nome){
    if(typeof nome === "string")
        console.log(nome)
    else
        console.log("deve ser uma string")
}

function listarArray(array){
    if(Array.isArray(array)){
        array.forEach(i=>console.log(i))
    }
}

main()

//nodejs javascript, python, scala

// porque nao é uma linguagem compilada