import java.util.*

var scan = Scanner(System.`in`);

print("Enter first number: ");
var a = scan.nextDouble();

print("Enter second number: ");
var b = scan.nextDouble();

print("Enter operation: ");
var operator = scan.next();

var calc = Calc();

calc.solve(operator,a,b);

class Calc(){
    fun solve(operator:String,a:Double, b:Double){

        if(operator == "+"){
            print(a + b);
        }
        else if(operator == "-"){
            print(a - b);
        }

        else if(operator == "*"){
            print(a * b);
        }

        else if(operator == "/"){
            print(a / b);
        }
    }
}