fun main() {
    val amount: Double = 1000.0 // сумма перевода в рублях
    val commissionPercent: Double = 0.0075 // комиссия в процентах
    val commissionMin: Double = 35.0 // минимальная комиссия в рублях

    var commission: Double = amount * commissionPercent
    if (commission < commissionMin) {
        commission = commissionMin
    }

    println("Комиссия за перевод: $commission рублей")
}
