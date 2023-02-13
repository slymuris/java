package linkedList;

public interface BaseInterestRate {

final double BASE_INTEREST_RATE= 2.5;  //BASE_INTEREST_RATE - a constant that represents the the base interest rate for all bank account types set by the Federal Reserve. Must be initialized to 2.5.

static double getBaseInterestRate(){  //getBaseInterestRate() - a default method that returns the BASE_INTEREST_RATE.
return BASE_INTEREST_RATE;
}
void setInterestRate(); //setInterestRate() - an abstract void method that will be implemented by the concrete classes to set the specific interest rate for that account type.

}
