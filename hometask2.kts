import java.util.*
import kotlin.math.*

var scan = Scanner(System.`in`);

var a = scan.nextInt();
var b = scan.nextInt();
var c = scan.nextInt();

var dx = b.toDouble().pow(2) - (4*a.toDouble()*c.toDouble());

var x1 = ((b*(-1)) + sqrt(dx)) /2;
var x2 = ((b*(-1)) - sqrt(dx)) /2;

println(x1)
println(x2)