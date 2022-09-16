import kotlin.random.Random
import java.util.*

var scan = Scanner(System.`in`)

println("Zdravstvuyte")
println("Vi uchastnik pole chudes")

var letters = "qwertyuiopasdfghjklzxcvbnm"
var ran1 = Random.nextInt(5,15)
var word = emptyArray<Char>()
var us = emptyArray<Char>();
var wd = emptyArray<Char>();
var word1 = ""


for (i in 0..ran1){
    var ran2 = Random.nextInt(0,letters.length)
    word += letters[ran2]
    us += '0'
    wd += '*'
}

for(i in 0..ran1-1){
    print(word[i])
    word1 += word[i]
}

println()

println("Mi zagadali slovo iz ${ran1} bukv")
println("Esli vi ugadayte vi klassniy programmist")
println("Inache vi ploxoy programmist")

var popitki = (word.size/2) + (word.size/4)


var x = 0


while (true){

    println("U vas ${popitki} popitok")
    print("Napiwite bukvu: ")
    var letter = scan.next()

    if(letter.length > 1){
        if(letter == word1){
            println("Pozdravlyayu vi ugadali slovo ")
            println("Vot vawe slovo ")
            println(word1)
            break
        }

        else if(letter != word1){
            println("U vas zakonchilis popitki ")
            println("Vi ne ugadali slovo ")
            println("Vi ploxoy programmist ")
            break
        }


    }

    var let = letter[0]
    if(let in word) {
        for (i in 0..ran1 - 1) {
            if (let == word[i]) {
                if (us[i] == '0'){
                    println("Vi ugadali bukvu ")
                    us[i] = '1'
                    wd[i] = let
                    x += 1
                }
                else{
                    println("Est takaya bukva ")
                    break
                }
            }
        }
        println("Vot ugadanie bukvi")
        for(j in 0..ran1-1){
            print(wd[j])
        }
        println()
    }

    else{
        popitki -= 1
        println("Nevernaya bukva ")
        println("U vas ostalos ${popitki} popitok")
        println("Vot ugadanie bukvi")
        for(j in 0..ran1-1){
            print(wd[j])
        }
        println()
    }
    if(x== word.size-1){
        println("Pozdravlyayu vi ugadali slovo ")
        println("Vot vawe slovo ")
        println(word)
        break
    }

    if(popitki == 0){
        println("U vas zakonchilis popitki ")
        println("Vi ne ugadali slovo ")
        println("Vi ploxoy programmist ")
        break
    }

}




