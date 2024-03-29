const player1 = {
    id: 1,
    char: 'x',
    iconClass: 'fa-times',
    scoreClass: '#score-player-1 .score-text'
};

const player2 = {
    id: 2,
    char: 'o',
    iconClass: 'fa-circle',
    scoreClass: '#score-player-2 .score-text'
};

let currentPlayer = player1;

// Lecture Code starts Here***************************
function onTileClicked(e) {
    
}


function togglePlayAgain() {
   
}

function resetGame() {
   
}

function isAWin() {
    const icons = document.querySelectorAll('.fa');

    // horizontal check

    // top row
    if (icons[0].classList.contains(currentPlayer.iconClass) &&
        icons[1].classList.contains(currentPlayer.iconClass) &&
        icons[2].classList.contains(currentPlayer.iconClass)) {
        return true;
    }

    // middle row
    if (icons[3].classList.contains(currentPlayer.iconClass) &&
        icons[4].classList.contains(currentPlayer.iconClass) &&
        icons[5].classList.contains(currentPlayer.iconClass)) {
        return true;
    }

    // bottom row
    if (icons[6].classList.contains(currentPlayer.iconClass) &&
        icons[7].classList.contains(currentPlayer.iconClass) &&
        icons[8].classList.contains(currentPlayer.iconClass)) {
        return true;
    }

    // vertical check

    // left column
    if (icons[0].classList.contains(currentPlayer.iconClass) &&
        icons[3].classList.contains(currentPlayer.iconClass) &&
        icons[6].classList.contains(currentPlayer.iconClass)) {
        return true;
    }
    // middle column  
    if (icons[1].classList.contains(currentPlayer.iconClass) &&
        icons[4].classList.contains(currentPlayer.iconClass) &&
        icons[7].classList.contains(currentPlayer.iconClass)) {
        return true;
    }
    // right column
    if (icons[2].classList.contains(currentPlayer.iconClass) &&
        icons[4].classList.contains(currentPlayer.iconClass) &&
        icons[8].classList.contains(currentPlayer.iconClass)) {
        return true;
    }

    // diagonals
    
    // top left - bottom right
    if (icons[0].classList.contains(currentPlayer.iconClass) &&
        icons[4].classList.contains(currentPlayer.iconClass) &&
        icons[8].classList.contains(currentPlayer.iconClass)) {
        return true;
    }

    // top right - bottom left
    if (icons[2].classList.contains(currentPlayer.iconClass) &&
        icons[4].classList.contains(currentPlayer.iconClass) &&
        icons[6].classList.contains(currentPlayer.iconClass)) {
        return true;
    }

    return false;
}

function isATie() {
    const icons = Array.from(document.querySelectorAll('.fa'));

    return icons.every(t => {
        return t.classList.contains(player1.iconClass)
            || t.classList.contains(player2.iconClass);
    });
}

function recordWin() {
    const scoreElement = document.querySelector(currentPlayer.scoreClass);
    const currentScore = scoreElement.innerText;
    scoreElement.innerText = Number.parseInt(currentScore) + 1;
}

function recordTie() {
    const scoreElement = document.querySelector('#score-ties .score-text');
    const currentScore = scoreElement.innerText;
    scoreElement.innerText = Number.parseInt(currentScore) + 1;
}

function switchPlayer() {
    currentPlayer = currentPlayer.id === 1 ? player2 : player1;
    
    const currentPlayerElement = document.getElementById('current-player');
    currentPlayerElement.innerText = currentPlayer.char.toUpperCase();
}


//DOn't forget to code this!!!!!**************************
function addTileClickListeners() {
 
}

//Add the DOM Content Loaded Listener   


