function TitleCase(Str) {

    let words = Str.split(' ');

    for (let word of words) {

        if (word.length > 0 && word[0] !== word[0].toUpperCase()) {

            return false;
        }

        return true;
    }
}

let sm = TitleCase("This Is A Title Case");
console.log(sm);