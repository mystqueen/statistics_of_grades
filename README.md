# statistics_of_grades
# Student Grades Analysis Program

## Project Objectives
This project aims to develop a program with the following objectives:
- **Array Manipulation**: Ability to create, initialize, and manipulate arrays to store data.
- **Conditional Statements**: Proficiency in using conditional statements.
- **String Formatting**: Understanding of string formatting techniques to display results clearly and organized.
- **Algorithm Development**: Ability to analyze requirements and develop algorithms to solve the problem efficiently, particularly by generating a dynamic bar chart in the console.

## Project Description
The goal of this program is to read the grades of `N` students in a class for a specific assignment and store them in an array `scores` of size `N`. The program will then analyze and display the following data:
- **Maximum grade** of the class.
- **Minimum grade** of the class.
- **Average grade** of the class.

Additionally, the program categorizes the scores into specific grade ranges and visualizes the results through a dynamic bar chart.

### Grade Categorization
Using the `scores` array, an additional array `stats` of size 5 is created with the following composition:
- `stats[4]`: Number of grades above 80
- `stats[3]`: Number of grades from 61 to 80
- `stats[2]`: Number of grades from 41 to 60
- `stats[1]`: Number of grades from 21 to 40
- `stats[0]`: Number of grades from 0 to 20

### Bar Chart Visualization
The program will generate a bar graph to represent the grades distribution in the `scores` array. Each bar will be made up of the symbols `#######`, with the corresponding grade range displayed below the graph.

## Example Output

### Sample Analysis Results
```plaintext
Maximum Grade: 92
Minimum Grade: 12
Average Grade: 56.4

Graph:

   6  >                                 #######
   5  >                       #######   #######
   4  >             #######   #######   #######
   3  >             #######   #######   #######   #######
   2  >   #######   #######   #######   #######   #######
   1  >   #######   #######   #######   #######   #######
      +-----------+---------+---------+---------+---------+
      I    0-20   I  21-40  I  41-60  I  61-80  I  81-100 I
