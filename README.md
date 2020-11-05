#  Using Datasets with Unstructured Textual Data

## ---- Part 1 - using map function and the reduce function
### map function - it takes one element and produces an output of one element - if you want a map for example alphabets from A to Z to their number representation you can have a function that takes a alphabet letter and outputs a number for that alphabet.
### reduce function - takes multiple inputs and produces one output - if you had for example 10 items going into the reduce function it would output just a single item.

## ---- Part 2 - how to use data sets with your own user defined types (POJOs)
### CSV file to dataframe to Dataset<House> and back

## ---- Part 3 - Running WordCount 
### The text file Shakespeare (an unstructured file with all of the text that Shakespeare has ever written) is loaded into a data frame with just one column - the Value column - and we wanted to parse this text and find out the most commonly used word by Shakespeare.
