import java.util.Scanner

var scan = Scanner(System.`in`)


var v = scan.nextInt()
var u = scan.nextInt()
var t1 = scan.nextInt()
var t2 = scan.nextInt()

var s1 = (u+v)*t1
var s2 = (v-u)*t2

println(s1)
println(s2)