package com.vedat.e_commerce.data

sealed class Category(val category: String) {

    object Chair: Category("Sandalye")
    object Cupboard: Category("Dolaplar")
    object Table: Category("Masa")
    object Accessory: Category("Aksesuar")
    object Furniture: Category("Mobilya")
}