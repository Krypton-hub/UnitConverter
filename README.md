# UnitConverter

A simple Java desktop application for converting length units. The application provides a graphical user interface built with Java Swing.

## Features

* Convert between different length units
* Supports Meters
* Supports Feet
* Supports Inches
* Supports Centimeters
* Simple and user friendly graphical interface
* Handles invalid input values
* Displays results with two decimal places

## Supported Conversions

The application can convert between the following units:

| Unit        | Conversion Reference      |
| ----------- | ------------------------- |
| Meters      | Base unit                 |
| Feet        | 1 Foot = 0.3048 Meters    |
| Inches      | 1 Inch = 0.0254 Meters    |
| Centimeters | 100 Centimeters = 1 Meter |

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
│   └── production/
│
└── UnitConverter.iml
```

## File Description

### Main.java

This is the entry point of the application.

The program starts the graphical user interface using:

```java
SwingUtilities.invokeLater(ConverterUI::new);
```

### ConverterUI.java

This class creates and manages the graphical user interface.

It contains:

* Input field for entering a value
* Dropdown menu for selecting the source unit
* Dropdown menu for selecting the target unit
* Convert button
* Result display area

The application also checks whether the user entered a valid number.

### ConverterLogic.java

This class contains the main conversion logic.

The conversion process happens in two steps:

1. Convert the input value into meters.
2. Convert the value from meters into the selected target unit.

This approach makes the conversion logic simple and organized.

## How It Works

1. Enter a numeric value.
2. Select the unit you want to convert from.
3. Select the unit you want to convert to.
4. Click the Convert button.
5. The converted result will appear on the screen.

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
10.0 Meters = 32.81 Feet
```

## Requirements

To run this project, you need:

* Java Development Kit, JDK 17 or later recommended
* Java Swing
* An IDE such as IntelliJ IDEA, Eclipse, or VS Code

## How to Run

### Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Select Open Project.
3. Choose the UnitConverter project folder.
4. Open the project.
5. Locate `Main.java`.
6. Run the `main` method.

### Using the Command Line

Navigate to the source directory and compile the Java files.

```bash
javac -d out src/com/lab/unitconverter/*.java
```

Then run the application:

```bash
java -cp out com.lab.unitconverter.Main
```

## Technologies Used

* Java
* Java Swing
* Object Oriented Programming
* IntelliJ IDEA

## Error Handling

The application handles invalid input.

If the user enters text or an invalid number, the program displays an error message:

```text
Please enter a valid number!
```

## Future Improvements

Possible future improvements include:

* Add weight conversion
* Add temperature conversion
* Add volume conversion
* Add more measurement units
* Add conversion history
* Improve the graphical user interface
* Add a reset button
* Add dark mode

## Author

Amit Chakrabarty

## License

This project is created for educational purposes.
