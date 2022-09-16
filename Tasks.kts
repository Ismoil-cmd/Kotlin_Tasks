import java.util.*
import java.math.*
import kotlin.math.abs

var scan = Scanner(System.`in`);

fun begin33(){
    println("Begin 33")

    print("Input X ")
    var x = scan.nextDouble()
    print("Input A ")
    var a = scan.nextDouble()

    print("Input Y ")
    var y = scan.nextDouble()

    print("1 kg konfet ")
    var p = a/x
    println(p)
    print("Y kg konfet ")
    println(p*y)

}



fun begin34(){

    println("Begin 34")
    print("Input X")
    var x = scan.nextDouble()
    print("Input A")
    var a = scan.nextDouble()

    print("Input Y")
    var y = scan.nextDouble()
    print("Input B")
    var b = scan.nextDouble()

    var p1 = x/a
    var p2 = y/b

    println(p1)
    println(p2)

    println(abs(p1/p2))
}


begin33()
begin34()

