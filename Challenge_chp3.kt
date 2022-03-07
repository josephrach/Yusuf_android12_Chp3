import java.util.Scanner;

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    println("""
    ===========================
    GAME SUIT TERMINAL VERSION
    ===========================
    1. Masukan pemain 1:
    """)
    var pemain1 = input.nextLine()
    println("2. Masukin pemain 2:")
    var pemain2 = input.nextLine()

    // println("$pemain1, $pemain2")
    if (pemain1 == pemain2){
        println("""
        Hasil:
        DRAW!
        """)
    }else if(pemain1 == "gunting" && pemain2 == "kertas"){
        println("""
        Hasil:
        pemain 1 MENANG!
        """)
    }else if(pemain1 == "gunting" && pemain2 == "batu"){
        println("""
        Hasil:
        pemain 2 MENANG!
        """)
    }else if(pemain1 == "kertas" && pemain2 == "gunting"){
        println("""
        Hasil:
        pemain 2 MENANG!
        """)
    }else if(pemain1 == "kertas" && pemain2 == "batu"){
        println("""
        Hasil:
        pemain 1 MENANG!
        """)
    }else if(pemain1 == "batu" && pemain2 == "gunting"){
        println("""
        Hasil:
        pemain 1 MENANG!
        """)
    }else{
        println("""
        Hasil:
        pemain 2 MENANG!
        """)
    }
    
}