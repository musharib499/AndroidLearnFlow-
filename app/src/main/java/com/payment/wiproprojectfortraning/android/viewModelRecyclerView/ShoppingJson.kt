package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

val productGson = """
[
  {
    "id": 1,
    "name": "Wireless Headphones #1",
    "price": 2999.0,
    "imageUrl": "https://images.unsplash.com/photo-1506744038136-46273834b3fb",
    "discountPrice": 1999.0,
    "productDescription": "Noise cancelling over-ear headphones with 20h battery life."
  },
  {
  "id": 2,
    "name": "Bluetooth Speaker #2",
    "price": 1499.0,
    "imageUrl": "https://images.unsplash.com/photo-1587574293340-ec180e3101f1",
    "discountPrice": 999.0,
    "productDescription": "Portable waterproof Bluetooth speaker with deep bass."
  },
  {
  "id": 3,
    "name": "Smart Watch #3",
    "price": 4999.0,
    "imageUrl": "https://images.unsplash.com/photo-1600180758890-6c48247d59de",
    "discountPrice": 3799.0,
    "productDescription": "Smartwatch with heart rate monitor, fitness tracking and calls."
  },
  {
  "id": 4,
    "name": "Wireless Headphones #4",
    "price": 2999.0,
    "imageUrl": "https://images.unsplash.com/photo-1585386959984-a4155224cfdc",
    "discountPrice": 1999.0,
    "productDescription": "Noise cancelling over-ear headphones with 20h battery life."
  },
  {
  "id": 5,
    "name": "Bluetooth Speaker #5",
    "price": 1499.0,
    "imageUrl": "https://images.unsplash.com/photo-1587574293340-ec180e3101f1",
    "discountPrice": 999.0,
    "productDescription": "Portable waterproof Bluetooth speaker with deep bass."
  },
  {
  "id": 6,
    "name": "Smart Watch #6",
    "price": 4999.0,
    "imageUrl": "https://images.unsplash.com/photo-1506744038136-46273834b3fb",
    "discountPrice": 3799.0,
    "productDescription": "Smartwatch with heart rate monitor, fitness tracking and calls."
  }
]
"""
val productList: List<Product> =
    Gson().fromJson(productGson, object : TypeToken<List<Product>>() {}.type)


/// ----------------Lunch time -------------------