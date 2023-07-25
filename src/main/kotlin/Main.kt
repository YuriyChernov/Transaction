fun main() {

    val money = 100
    val perCommission = 0.0075
    val minCommission = 35

    val commission = money * perCommission
    val totalCommission = if (commission < minCommission) minCommission else commission
    val result = if (commission > minCommission) money + commission else minCommission + money

    println("Сумма перевода $money руб.")
    println("Сумма комиссии $totalCommission руб.")
    println("Сумма перевода с комиссией составила $result руб.")
}