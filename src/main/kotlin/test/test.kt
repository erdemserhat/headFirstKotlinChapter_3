package test

import isPrime
import junit.framework.TestCase.assertEquals
import org.junit.Test


class test {

    @org.junit.Test
    fun testIsPrimeFun() {

        // Test edilecek işlevi çağırın ve sonucu alın
        val result = isPrime(17) // Örnek olarak 17'nin asal olup olmadığını test ediyoruz

        // Beklenen sonucu kontrol edin (true olmalı çünkü 17 bir asal sayıdır)
        assertEquals(true, result)

        // Başka bir örnek (4, asal değil)
        val result2 = isPrime(4)
        assertEquals(false, result2)


    }
}