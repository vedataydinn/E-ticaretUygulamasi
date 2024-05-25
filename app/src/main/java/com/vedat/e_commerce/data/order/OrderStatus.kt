package com.vedat.e_commerce.data.order

sealed class OrderStatus(val status: String) {

    object Ordered: OrderStatus("Sipariş edildi")
    object Canceled: OrderStatus("iptal edildi")
    object Confirmed: OrderStatus("Onaylandı")
    object Shipped: OrderStatus("Gönderildi")
    object Delivered: OrderStatus("teslim edildi")
    object Returned: OrderStatus("iade edildi")
}

fun getOrderStatus(status: String): OrderStatus {
    return when (status) {
        "Ordered" -> {
            OrderStatus.Ordered
        }
        "Canceled" -> {
            OrderStatus.Canceled
        }
        "Confirmed" -> {
            OrderStatus.Confirmed
        }
        "Shipped" -> {
            OrderStatus.Shipped
        }
        "Delivered" -> {
            OrderStatus.Delivered
        }
        else -> OrderStatus.Returned
    }
}
