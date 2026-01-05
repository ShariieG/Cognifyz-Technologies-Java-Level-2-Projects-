# Cognifyz-Technologies-Java-Level-2-Projects-

# 🎮 Java Tic Tac Toe Game

A simple **console-based Tic Tac Toe game** built using **Java**, designed for two players.  
This project was created as part of my **Java programming practice** and shared on LinkedIn as part of my learning journey.

🔗 **Project LinkedIn Post:**  
👉 https://www.linkedin.com/posts/sharon-galela-6998bb265_java-cognifyztechnologies-programmingpractice-activity-7413247663262916608-yvUK

---

## 🧠 Project Overview

This Tic Tac Toe game allows:
- Two players to enter their own symbols
- Players to take turns placing their moves on a 3×3 board
- Automatic detection of:
  - Winning conditions
  - Full board (draw)
- Option to replay the game after completion

---

## 🛠️ Technologies Used

- **Java**
- `Scanner` class for user input
- 2D arrays
- Methods and control structures

---

## ✨ Features

✔ 3×3 game board display  
✔ Turn-based gameplay  
✔ Input validation for rows and columns  
✔ Prevents overwriting occupied positions  
✔ Win detection (rows, columns, diagonals)  
✔ Draw detection when board is full  
✔ Play-again option  

---

## ⚠️ Challenges Faced & Solutions

### 1️⃣ Validating User Input
**Challenge:**  
Ensuring players only enter valid row and column values (0–2).

**Solution:**  
Used `do-while` loops to repeatedly prompt the user until valid input was entered.

---

### 2️⃣ Preventing Overwriting Moves
**Challenge:**  
Players could accidentally select an already occupied position.

**Solution:**  
Added checks to verify whether a board position was already taken before allowing the move.

---

### 3️⃣ Detecting a Draw Situation
**Challenge:**  
Identifying when the board is completely full without a winner.

**Solution:**  
Implemented a `boardStatus()` method to check if all positions are filled.

---

### 4️⃣ Implementing Win Logic
**Challenge:**  
Checking all possible win combinations (rows, columns, diagonals).

**Solution:**  
Created a dedicated `Win()` method that evaluates every possible winning condition.

---

### 5️⃣ Game Restart Logic
**Challenge:**  
Allowing players to restart the game cleanly after it ends.

**Solution:**  
Used a `playAgain()` method that restarts the program when the user selects “Yes”.

---

## 📌 How to Play

1. Player 1 and Player 2 choose their symbols
2. Players take turns selecting:
   - Column (0–2)
   - Row (0–2)
3. The board updates after each move
4. The game ends when:
   - A player wins 🏆
   - The board is full (draw)
5. Choose whether to play again or exit

---

## 📚 Skills Demonstrated

- Java fundamentals
- 2D array manipulation
- Method decomposition
- Input validation
- Game logic implementation
- Console-based UI design
- Problem-solving and debugging

---

## 🚀 Future Improvements

- Replace numeric placeholders with `X` and `O`
- Improve board formatting for better readability
- Add exception handling
- Single-player mode with AI
- GUI version using Java Swing

---

## 👩‍💻 Author

**Sharon Galela**  
Java Learner | IT Student | Programming Practice Enthusiast  

⭐ If you like this project, feel free to star the repository!
