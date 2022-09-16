import java.util.Scanner;
import kotlin.random.Random
//Du$h@nbeB

var scan = Scanner(System.`in`);

var a = Random.nextInt(0, 100);

println("Esli t ugadaew moyo chislo s 5 popitok to ya priznayu wto t luchwi menya");

var life = 5;
var yNum = 0;

while(true){
    print("Skazhi chislo ");
    yNum = scan.nextInt();

    if(life == 0){
        break;
    }

    if(yNum > a){
        life -= 1;
        println("T ne ugadal moyo chislo");
        println("Tvoy chislo bolwe moevo");
        println("U tebya ostalos $life popitok");
    }

    else if(yNum < a){
        life -= 1;
        println("T ne ugadal moyo chislo");
        println("Tvoy chislo menwe moevo");
        println("U tebya ostalos $life popitok");
    }


    else if(yNum == a){
        print("Uraaaaaaaa pozdravlyayu t ugadal moyo chislo i da t luchwe menya ");
        break;

    }
}

print("T loser t ne ugadal moyo chislo t ne luchwe menya idi vibros sebya v musor ")