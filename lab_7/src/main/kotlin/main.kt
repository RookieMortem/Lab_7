fun main(args: Array<String>) {
    println(Garmon(12.3,15.4))
    //Вторая часть невыполнима, ибо в этом языке нету указателей, как в низкоуровневых языках
}

private fun Garmon(a:Double, b:Double): Double {
    return 2/((1/a)+(1/b))
}
