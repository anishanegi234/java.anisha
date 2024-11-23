#!/bin/bash

# Update system
echo "Updating system..."
sudo apt update -y

# Install OpenJDK
echo "Installing OpenJDK..."
sudo apt install openjdk-17-jdk -y

# Verify installation
echo "Verifying Java installation..."
java -version
