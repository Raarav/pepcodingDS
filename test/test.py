import sys

"""
* Complete the function below.
* DO NOT MODIFY CODE OUTSIDE THIS FUNCTION!
"""

"""
Consider a string, expression consisting of the characters < and > only. We consider the string to be balanced if each < always appears before (i.e., to the left of) a corresponding > character (they do not need to be adjacent). Moreover, each < and > act as a unique pair of symbols and neither symbol can be considered as part of any other pair of symbols. For example, the strings <<>>, <>, and <><> are all balanced, but the strings >>, <<>, and ><>< are unbalanced.
To balance a string, we can replace only > character with <> at most maxReplacement times. Given an expression and the value of maxReplacement, can you turn an unbalanced string into a balanced one?
Complete the balancedOrNot function in the editor below. It has the following parameters:
An array of n strings, expressions, denoting the list of expressions to check.
An array of n integers, maxReplacements, where maxReplacementsi denotes the maximum number of replacements allowed when attempting to balance expressionsi.
The function must return an array of integers where each index i (0 ≤ i < n) contains a 1 if expressionsi is balanced or a 0 if it is not.
Input Format
A set of internal unit tests will be on the code with input in the following format.
The first line contains an integer, n, denoting the size of expressions.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing expressionsi.
The next line contains an integer, m, denoting the size of maxReplacements.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing maxReplacementsi.
Constraints
1 ≤ n ≤ 10^2
1 ≤ length of expressionsi ≤ 10^5
0 ≤ maxReplacementsi ≤ 10^5
Output Format
The function must return an array of integers where each index i (0 ≤ i < n) contains a 1 if expressionsi is balanced or a 0 if it is not.
Observations
Check that your code runs before submitting it!
Sample Input 0
"""
def balancedOrNot(expressions, maxReplacements):
    return_array = []
    for i in range(0, len(maxReplacements)):
        return_array.append(0)

    for count, each_data in enumerate(expressions):
        check_str = expressions[count]
        replacement_count = 0
    
        continue_loop = True
        while len(check_str) >= 1 and continue_loop:
            opening_count = check_str.count('<')
            closing_count = check_str.count('>')
            
            if opening_count > closing_count:
                replacement_count = maxReplacements[count] + 1
                continue_loop = False
            elif check_str[0] == '>':
                replacement_count += 1
                check_str = check_str[1:]
            else:
                check_str = check_str.replace('<>','')

        if replacement_count <= maxReplacements[count]:
            return_array[count] = 1

    return return_array


print(balancedOrNot(expressions = ["<>", "<<><>>"], maxReplacements=[0,0])) # [1,0]
print(balancedOrNot(expressions = ["<>>>", "<>>>>"], maxReplacements=[2,2])) # [1,0]
print(balancedOrNot(expressions = ["<>", "<>><"] , maxReplacements=[2,2])) # [1, 0]
print(balancedOrNot(expressions = ["<<<>", "<<><><"] , maxReplacements=[2,2])) # [0,0]

print(balancedOrNot(expressions = ["<<<>>>", "<>"] , maxReplacements=[2,2])) # [0,1]
print(balancedOrNot(expressions = ["<<><>>", "<><>"] , maxReplacements=[2,2])) # [0,1]

print(balancedOrNot(expressions = ["<<><>><", "><><><"] , maxReplacements=[2,2])) # [0,0]
