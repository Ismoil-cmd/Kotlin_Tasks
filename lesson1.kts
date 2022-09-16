import java.util.*;

var scan = Scanner(System.`in`);

print("Enter the number: ")
var num = scan.nextInt()

var i = 0;
while(true){
    if (num -i > 0){
        i += 1;
        num -= i;
    }

    else {
        break;
    }
}

println(i);
