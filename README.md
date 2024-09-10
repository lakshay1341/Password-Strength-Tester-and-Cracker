# Password Strength Tester and Cracker

## Project Overview
This project is a **Password Strength Tester and Cracker** developed using **Java**. It allows users to generate random passwords, check the strength of their passwords, and simulate password cracking using a brute-force approach.

## Features
- **User Input**: Users can input their own passwords for analysis.
- **Random Password Generation**: Generate secure passwords of specified lengths.
- **Strength Analysis**: Evaluate password strength based on length and character variety.
- **Cracking Simulation**: Demonstrates the vulnerability of weak passwords to brute-force attacks.

## Installation
1. **Clone the repository**:
    ```bash
    git clone https://github.com/lakshay1341/password-strength-tester-cracker.git
    cd password-strength-tester-cracker
    ```

2. **Compile the project**:
    ```bash
    javac -d bin src/*.java
    ```

3. **Run the application**:
    ```bash
    java -cp bin PasswordTool
    ```

## Usage
1. **Run the application**.
2. **Choose an option** from the menu:
    - **Check Password Strength**: Enter a password to check its strength.
    - **Crack Password**: Enter a password to simulate cracking.
    - **Generate Random Password**: Specify the length to generate a random password, check its strength, and simulate cracking.

## Code Structure
- **PasswordGenerator.java**: Contains the logic for generating random passwords.
- **PasswordStrengthChecker.java**: Contains the logic for checking the strength of passwords.
- **PasswordCracker.java**: Contains the logic for simulating password cracking.
- **PasswordTool.java**: The main application that integrates all functionalities.

## Contributing
1. **Fork the repository**.
2. **Create a new branch**:
    ```bash
    git checkout -b feature-branch
    ```
3. **Commit your changes**:
    ```bash
    git commit -m "Add new feature"
    ```
4. **Push to the branch**:
    ```bash
    git push origin feature-branch
    ```
5. **Create a Pull Request**.

## License
This project is licensed under the MIT License.

## Acknowledgements
- Thanks to all contributors and the open-source community.

