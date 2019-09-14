package com.sebastianlundquist.numbershapes;

class Number {
    public int number;

    boolean isTriangular() {
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < number) {
            x++;
            triangularNumber += x;
        }
        return (triangularNumber == number);
    }

    boolean isSquare() {
        double squareRoot = Math.sqrt(number);
        return Math.sqrt(number) == Math.floor(squareRoot);
    }
}

