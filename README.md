# Cipher Program

This program implements three different ciphers for encryption and decryption: the Caesar cipher, the Substitution cipher, and the Rail Fence cipher. The program allows users to choose a cipher, enter a phrase, and either encrypt or decrypt the phrase based on their choice.

## Features

- **Caesar Cipher**: 
  - Shifts letters forward or backward by a user-specified amount.
  - Verifies if the shift amount is an integer between 1 and 25.
  - Throws an `IllegalArgumentException` with the message "Invalid Amount" if the shift amount is not valid.

- **Rail Fence Cipher**: 
  - Encrypts or decrypts a phrase using the Rail Fence Cipher technique.
  - Returns an array with the encrypted or decrypted form of the phrase.

- **Substitution Cipher**: 
  - Substitutes letters in the phrase with those in a predefined substitution array.
  - Reverses the substitution if decryption is required.

## How to Use

1. Run the program.
2. The program will display the message: **"Cipher Program - Please choose an option"**.
3. Choose the type of cipher you want to use (Caesar, Substitution, or Rail Fence).
4. Select whether you want to encrypt or decrypt the phrase.
5. Enter the phrase you want to encrypt or decrypt.
6. For the Caesar cipher, you will also be prompted to enter the shift amount (between 1 and 25).
7. The program will output the encrypted or decrypted phrase.
8. The program will keep running until you input "Q" or "q" to quit.

## Example Usage

### Caesar Cipher
- **Encrypt**: 
  - Input: `HELLO` with a shift of `3`.
  - Output: `KHOOR`.
- **Decrypt**: 
  - Input: `KHOOR` with a shift of `3`.
  - Output: `HELLO`.

### Rail Fence Cipher
- **Encrypt**: 
  - Input: `HELLO WORLD`.
  - Output: (Encrypted form).
- **Decrypt**: 
  - Input: (Encrypted form).
  - Output: `HELLO WORLD`.

### Substitution Cipher
- **Encrypt**: 
  - Input: `HELLO`.
  - Output: (Encrypted form based on the substitution array).
- **Decrypt**: 
  - Input: (Encrypted form).
  - Output: `HELLO`.

## Requirements

- Java Development Kit (JDK) version 8 or later.
