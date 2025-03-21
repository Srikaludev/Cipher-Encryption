# Cipher Encryption & Decryption Program

A Java-based encryption/decryption program that implements three classical ciphers with a hacker-style animation interface.

## Overview

This program allows users to encrypt and decrypt messages using three different cipher algorithms:
- Caesar Cipher
- Substitution Cipher
- Rail Fence Cipher

The application features a command-line interface with visual feedback that mimics a "encryption" animation during the encryption and decryption processes.

## Features

### Caesar Cipher
- Shifts each letter in the alphabet by a specified amount (1-25)
- Preserves case sensitivity (uppercase/lowercase)
- Non-alphabetic characters remain unchanged
- Customizable shift amount for varying encryption strength

### Substitution Cipher
- Uses predefined substitution arrays where each letter is mapped to another letter
- Separate mapping arrays for encryption and decryption
- Maintains case sensitivity
- Non-alphabetic characters remain unchanged

### Rail Fence Cipher
- A transposition cipher that rearranges letters without changing them
- Encryption separates characters at even positions from those at odd positions
- Maintains all original characters but changes their positions

### Visual Features
- Real-time "hacker-style" character scrambling animation during processing
- Color-coded terminal output with ANSI escape codes
- Visual indicators for encryption and decryption status
- Completion messages ("ENCRYPTION COMPLETE")

## How to Use

1. Compile all Java files:
   ```
   javac Index.java
   ```

2. Run the program:
   ```
   java Index.java
   ```

3. Follow the command-line prompts:
   - Choose a cipher type:
     - `C` for Caesar
     - `R` for Rail Fence
     - `S` for Substitution
     - `Q` to quit
   
   - Choose operation:
     - `E` for encryption
     - `D` for decryption
   
   - Enter the phrase to encrypt/decrypt
   
   - For Caesar cipher only, enter a shift amount (1-25)

## Implementation Details

- The program validates all user inputs
- Case sensitivity is preserved in all ciphers
- The visual feedback system simulates a "encryption" process with randomized character display
- The program runs in a loop until the user explicitly quits

## Author

Created by Srikar.C (GitHub: [Srikaludev](https://github.com/Srikaludev))
