# Movie Rental System

A fully object-oriented Java implementation of a video rental system, inspired by the "白仕達錄影帶出租店" scenario. This project replicates the core business logic of a GUI-based rental system using clean and modular class structures.

> Built as a course assignment to demonstrate object-oriented design (OOP) principles such as encapsulation, delegation, and polymorphism.

---

## Project Description

This system allows:
- Creating movie objects of different types (New Release, Regular, Children)
- Registering customers and rental records
- Computing rental prices and frequent renter points based on movie type and rental days
- Printing a complete rental statement for each customer
- Dynamically converting a movie's category (e.g., from new release to regular) — fulfilling extensibility (Use Case E)

All features were implemented in plain Java without GUI. The system simulates data input/output via the `main()` method for clarity and educational value.

---

## Features & Use Cases

| Use Case | Description |
|----------|-------------|
| A        | Create 4 types of `Movie` objects (New Release, Regular, Children) |
| B        | Create 4 `Customer` instances |
| C        | Create 7 rental records via the `Rental` class |
| D        | Print each customer's rental record via `Customer.statement()` |
| D.1      | Calculate rental cost based on movie type and rental days |
| D.2      | Calculate frequent renter points by movie type |
| E        | After two months, convert a new release to regular, and reflect it in future rentals |

---

## Pricing Logic

| Movie Type     | Rental Price                                    | Frequent Renter Points |
|----------------|--------------------------------------------------|--------------------------|
| New Release    | \$3 per day                                      | 2.0 points               |
| Regular        | \$2 for 2 days, then \$1.5 per extra day         | 1.0 point                |
| Children       | \$1.5 for 3 days, then \$1.5 per extra day       | 0.5 point                |

---

## Technologies

- Language: Java 17+
- IDE: IntelliJ IDEA / VS Code
- No external libraries
- No GUI (logic simulated via `main()`)

---

## File Structure

![image](https://github.com/user-attachments/assets/63b78936-23fe-4d6f-b5e9-364148daf119)

---

## How to Run

1. Clone this repo or download the `.java` files
2. Open in any Java IDE (e.g., IntelliJ)
3. Run `Main.java`
4. Output will print all customer rental statements, prices, and points

---

## Output Sample (倫倫)

倫倫
Movie name: GIVEN, Price: 9.000000, Points: 0.500000

Movie name: 我的名字, Price: 21.000000, Points: 2.000000

Spend until now: 30.00

Points until now: 2.50


---

## OOP Design Highlights

- **Encapsulation**: Each class handles its own data & behavior
- **Delegation**: `Rental` delegates charge computation to `Movie`
- **Polymorphism via Enum**: `MovieTypes` controls pricing and points without `if` chains
- **Extensibility**: Can easily support new movie types or pricing rules

---



