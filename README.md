# UnitConverter

## Project Description

UnitConverter is a Java desktop application designed to convert values between different length measurement units. The application provides a simple graphical user interface where users can enter a value, select the source unit, select the target unit, and view the converted result.

The project was developed as an educational project to practice Java programming, Object Oriented Programming concepts, graphical user interface development, and program logic.

## Project Objectives

The main objectives of this project are:

* Develop a simple and user friendly unit conversion application.
* Allow users to convert values between different length units.
* Practice Object Oriented Programming concepts.
* Create a graphical user interface using Java Swing.
* Separate the user interface from the conversion logic.
* Handle invalid user input properly.
* Display accurate and formatted conversion results.

## Features

* Simple graphical user interface.
* Easy to use input field.
* Selectable source and target units.
* Supports multiple length units.
* Converts values accurately.
* Displays formatted results.
* Handles invalid input.
* Organized code using separate classes.

## Supported Units

The application supports the following length units:

* Meters
* Feet
* Inches
* Centimeters

## Supported Conversion Method

The application performs conversions using meters as the base unit.

The conversion process follows two steps:

1. Convert the input value into meters.
2. Convert the value from meters into the selected target unit.

This approach keeps the conversion logic simple and organized.

### Example

Input:

```text
10 Meters
```

Convert to:

```text
Feet
```

Output:

```text
10 Meters = 32.81 Feet
```

## Technologies Used

This project uses the following technologies:

* Java
* Java Swing
* Object Oriented Programming
* Java Development Kit, JDK
* IntelliJ IDEA or any compatible Java IDE

### Programming Language

Java is used as the main programming language.

### Framework and Library

Java Swing is used to create the graphical user interface.

## Project Structure

```text
UnitConverter/
│
├── src/
│   └── com/
│       └── lab/
│           └── unitconverter/
│               ├── Main.java
│               ├── ConverterUI.java
│               └── ConverterLogic.java
│
├── out/
│
└── README.md
```

## File Description

### Main.java

This is the main entry point of the application.

It starts the program and launches the graphical user interface.

### ConverterUI.java

This class manages the graphical user interface.

It includes:

* Input field for entering a value.
* Dropdown menu for selecting the source unit.
* Dropdown menu for selecting the target unit.
* Convert button.
* Result display area.
* Error messages for invalid input.

### ConverterLogic.java

This class contains the main conversion logic.

It performs the mathematical calculations required to convert values between different units.

Keeping the conversion logic separate from the user interface makes the project easier to understand and maintain.

## Requirements

Before running the project, make sure you have:

* Java Development Kit, JDK 17 or later recommended.
* A Java IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

## Installation and Setup

### Step 1: Download or Clone the Project

Download the project files or clone the repository.

```bash
git clone <repository-url>
```

### Step 2: Open the Project

Open the project folder using your preferred Java IDE.

For example, you can use:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

### Step 3: Configure Java

Make sure the Java Development Kit is correctly installed and configured in your IDE.

## How to Run the Project

### Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Click Open.
3. Select the UnitConverter project folder.
4. Wait for the project to load.
5. Navigate to the `Main.java` file.
6. Run the `main` method.
7. The UnitConverter application window will open.

### Using the Command Line

Navigate to the project directory.

Compile the Java files:

```bash
javac -d out src/com/lab/unitconverter/*.java
```

Run the application:

```bash
java -cp out com.lab.unitconverter.Main
```

## How to Use the Application

1. Open the application.
2. Enter a numeric value.
3. Select the unit you want to convert from.
4. Select the unit you want to convert to.
5. Click the Convert button.
6. View the converted result.

## Error Handling

The application handles invalid user input.

For example, if a user enters text instead of a number, the program displays an appropriate error message.

Example:

```text
Please enter a valid number!
```

This prevents the application from crashing because of invalid input.

## Challenges Faced

Several challenges were faced during the development of this project.

### User Interface Design

Creating a simple and easy to understand graphical interface required careful organization of components such as text fields, dropdown menus, buttons, and result displays.

### Conversion Logic

The application needed to accurately convert values between multiple units. Using meters as a base unit simplified the conversion process.

### Invalid Input Handling

Users may enter invalid values such as letters or symbols. The project handles these situations and displays an error message instead of causing the application to stop unexpectedly.

### Code Organization

Separating the graphical user interface and conversion logic into different classes helped maintain a clean project structure.

## Lessons Learned

Through this project, the following concepts were practiced:

* Java programming fundamentals.
* Object Oriented Programming.
* Java classes and objects.
* Methods and functions.
* Java Swing components.
* Event handling.
* User input validation.
* Exception handling.
* Code organization.

## Future Improvements

The following features can be added in the future:

* Add weight conversion.
* Add temperature conversion.
* Add volume conversion.
* Add more length units.
* Add a reset button.
* Add conversion history.
* Improve the graphical user interface.
* Add dark mode.
* Add support for more unit categories.

## Contributions

This project was developed for educational purposes.

Contributions and improvements are welcome.

Possible contributions include:

* Adding new unit categories.
* Adding more conversion options.
* Improving the user interface.
* Fixing bugs.
* Improving the project structure.
* Adding new features.

If you want to contribute:

1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Test the application.
5. Submit a pull request.

## Author

Amit Chakrabarty

Computer Engineering Student

## License

This project is created for educational purposes.

## Conclusion

UnitConverter is a simple Java desktop application that demonstrates unit conversion using Java and Java Swing.

The project focuses on creating a user friendly interface, accurate conversion logic, proper input validation, and organized code structure. It provides practical experience with Java programming and Object Oriented Programming concepts.
