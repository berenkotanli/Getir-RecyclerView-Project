package com.beren.getirrcyclerview

import java.io.Serializable

data class Products(var product_id:Int,
                    var product_name:String,
                    var product_image_name:String,
                    var product_price:Double):Serializable {
}