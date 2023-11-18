package com.digi.catsanddogs.data

import com.digi.catsanddogs.R

class FakeRepository {
    fun loadData(): List<Animal> {
        return listOf(
            Animal(R.drawable.cat_and_dog_1, "Mike and Sara", 5, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_2, "Max and Luna", 6, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_3, "Charlie and Bella", 6, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_4, "Milo and Lucy", 7, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_6, "Jack and Daisy", 3, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_6, "Rocky and Lola", 6, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_7, "Oreo and lily", 1, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_8, "Toby and Coco", 1, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_9, "Leo and Molly", 5, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_10, "Simba and Nala", 5, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_11, "Oliver and Sophie", 5, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_12, "Cooper and Ruby", 1, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_14, "Buddy and Zoe", 2, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_15, "Oscar and Rosie", 3, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_16, "Bailey and Sadie", 5, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_17, "Jasper and Chloe", 5, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_18, "Teddy and Stella", 1, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_19, "Loki and Luna", 2, AnimalType.MIXED),
            Animal(R.drawable.cat_and_dog_20, "Finn and Ellie", 3, AnimalType.MIXED),
        )
    }
}