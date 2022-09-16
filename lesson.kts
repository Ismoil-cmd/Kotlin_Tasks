import kotlin.math.*;
import java.util.Scanner;

var scan = Scanner(System.`in`);

println("1. Конвертация с двоичной по десятичной системе");
println("2. Конвертация с десятичной по двоичной системе");
print("Выберите вариант конвертации ");
var chooseVr = scan.nextInt();

while(chooseVr != 0){

    if(chooseVr == 1){
        print("Введите двоичное число ")
        var num = scan.nextInt();
        var con = num.toString();
        con = con.reversed();
        var res:Int = 0;

        for(i in 0..con.length-1){
            var pw = 2.0.pow(i) * con[i].toString().toInt();
            res += pw.toInt();
        }

        print("Десятичное число вашего числа ")
        println(res);
    }


    else if(chooseVr == 2){
        print("Введите десятичное число ")
        var num = scan.nextInt();
        var res = "";

        while(num != 1){
            res += (num%2).toString();
            num /= 2;
        }
        res += "1";
        res = res.reversed();
        print("Двоичное число вашего числа ");
        println(res);
    }

    println("1. Конвертация с двоичной по десятичной системе");
    println("2. Конвертация с десятичной по двоичной системе");
    print("Выберите вариант конвертации ");
    chooseVr = scan.nextInt();
}

println("Пока")