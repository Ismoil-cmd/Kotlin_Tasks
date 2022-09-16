import java.util.Scanner;

var scan = Scanner(System.`in`);

for(i in 2..100 step(2)){
    print(i);
    print(" ");
}
println();
println("Next Task");
print("Введите число n: ");
var n = scan.nextInt();

println("Вот те числа которые не делются на n")

for (i in 1..100){
    if(i % n != 0){
        print(i);
        print(" ");
    }
}

println("Done");