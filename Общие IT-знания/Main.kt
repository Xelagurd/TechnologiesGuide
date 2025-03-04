package org.example

import kotlin.math.round

/*
Интернет магазин хочет повысить лояльность покупателей. Для этого начнет давать им персональные скидки.

Нужно сделать простую систему лояльности, которая дает % скидку на корзину.
Процент скидки зависит от пользователя.

Написать класс, который:
- на вход получает id пользователя и корзину
- вычисляет и применяет скидки
- возвращает корзину, в которой учтены скидки
- скидка учитывается в стоимости покупки

Корзина - список покупок пользователя.

Покупка:
- id товара
- цена
- итоговая стоимость c учетом скидки

Скидка. Для пользователя может быть задан % скидки (целое число).
*/

class Service(private val userToDiscount: MutableMap<Int, Int>) {

    suspend fun getDiscounts(): MutableMap<Int, Int> {
        return userToDiscount
    }
}

class Solution(private val service: Service) {

    suspend fun getBucketWithDiscount(id: Int, bucket: Bucket): Bucket {
        val discount = service.getDiscounts()[id]
        val discountBucket = bucket.copy()

        if (discount != null) {
            if (discount < 0 || discount > 100) {
                throw IllegalDiscountException("Wrong discount value: $discount")
            }

            for (item in discountBucket.items) {
                val discountPrice = item.price * (1 - discount.toDouble() / 100)
                item.discountPrice = discountPrice.toInt()
            }
        }

        return discountBucket
    }
}

class IllegalDiscountException(val mes: String) : RuntimeException(mes)

data class Bucket(val items: List<Item>)

data class Item(val id: Int, val price: Int, var discountPrice: Int = price)
