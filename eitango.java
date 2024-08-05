// function to generate random number within a specified range
function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

// function to generate random number based on 100-unit range
function generateRandomNumber(range) {
    let min, max;
    switch(range) {
        case 0:
            min = 0;
            max = 99;
            break;
        case 1:
            min = 100;
            max = 199;
            break;
        case 2:
            min = 200;
            max = 299;
            break;
        case 3:
            min = 300;
            max = 399;
            break;
        case 4:
            min = 400;
            max = 499;
            break;
        case 5:
            min = 500;
            max = 599;
            break;
        case 6:
            min = 600;
            max = 699;
            break;
        case 7:
            min = 700;
            max = 799;
            break;
        case 8:
            min = 800;
            max = 899;
            break;
        case 9:
            min = 900;
            max = 1000;
            break;
        default:
            throw new Error('Invalid range. Range must be between 0 and 9.');
    }
    return getRandomNumber(min, max);
}

// Example usage:
let range = 5; // specify the range, e.g., 5 for numbers between 500 and 599
let randomNumber = generateRandomNumber(range);
console.log(randomNumber);
