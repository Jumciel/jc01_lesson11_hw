package com.training.jc.lesson11;

public class Main {

	public static void main(String[] args) {
		ComplexNumber n1 = new ComplexNumber();
		ComplexNumber n2 = new ComplexNumber();
		ComplexNumber sum = new ComplexNumber();

		n1.realNumber = 1;
		n1.imaginaryNumber = 7;

		n2.realNumber = 3;
		n2.imaginaryNumber = 8;

		sum = addComplex(n1, n2);

		dispResult(n1, n2, sum);

	}

	public static ComplexNumber addComplex(ComplexNumber n1, ComplexNumber n2) {
		int realSum;
		int imgSum;

		realSum = n1.realNumber + n2.realNumber;
		imgSum = n1.imaginaryNumber + n2.imaginaryNumber;

		ComplexNumber sum = new ComplexNumber();

		sum.realNumber = realSum;
		sum.imaginaryNumber = imgSum;

		return sum;
	}

	public static void dispResult(ComplexNumber n1, ComplexNumber n2, ComplexNumber sum) {
		System.out.printf("(%s + %s) + (%s + %s)i = %s + %si%n", n1.realNumber, n2.realNumber, n1.imaginaryNumber,
				n2.imaginaryNumber, sum.realNumber, sum.imaginaryNumber);
	}

}
