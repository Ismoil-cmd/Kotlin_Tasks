import java.sql.Time
import java.util.*
import kotlin.random.Random

var scan = Scanner(System.`in`);

class Tank(model:String, color:String, bullets:Int, orientation:Char){

    var color = color;
    var model = model;
    var orientation = orientation;
    var bullets = bullets;
    var TotalDist = 0

    fun move(d:Int){
        TotalDist += d;
    }

    fun tLeft(){

    }

    fun tRight(){

    }

    fun shot(bul:Int){
        bullets -= bul;
    }
}

var Mytank = Tank("I.S", "Neon", 100, 'R')


while (true){

    if(Mytank.bullets >= 0){
        var d = Random.nextInt(3,10)
        var bul = Random.nextInt(1,5);

        Mytank.move(d)
        Mytank.shot(bul)
        println("I move ${d} total distance is ${Mytank.TotalDist}")
        println("I shot ${bul} bullets I have ${Mytank.bullets}")
        Thread.sleep(3000);
    }
    else{
        break;
    }

}

println("I dont have bullets")
println("I move ${Mytank.TotalDist} meters")