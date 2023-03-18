package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {
// задоем анатацию тест что бы кампелятор знал что этот метод тестовый
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00 // задоем перменую стоимость
        val tipPercent = 20.00 // задоем переменую проценты чайвых
        val exceptionTip = NumberFormat.getCurrencyInstance().format(2) // задаем пременую которую мы ожидаем с формотированием  валют
        val actualTip = calculateTip(amount,tipPercent,false) // Задаем переменую в которую ложим значение из метода в приложение
        assertEquals(exceptionTip,actualTip) // вызываем метод который сравнивает ожидаемый результат с приложением
    }
}