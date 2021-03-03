/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

data class PupModel(
    val id: String,
    val name: String,
    val breedName: String,
    val age: String,
    val animalType: String,
    val description: String,
    val location: String,
    val weight: Double,
    val owner: String,
    val isFemale: Boolean,
    val picture: String,
    val friendlyLevel: Int,
    val intelligentLevel: Int,
    val isLiked: Boolean
)

val FakePuppies = listOf(
    PupModel(
        id = "1",
        age = "3 year",
        name = "Toshi",
        breedName = "Pug",
        animalType = "Dog",
        picture = "https://images.unsplash.com/photo-1517423738875-5ce310acd3da?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1305&q=80",
        isFemale = true,
        description = "Pugs are one of three types of short-nosed dogs that are known to have been bred by the Chinese: the Lion dog, the Pekingese, and the Lo-sze, which was the ancient Pug. Some think that the famous \"Foo Dogs\" of China are representations of the ancient Pug.",
        location = "FakeLocation",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        isLiked = false,

    ),
    PupModel(
        id = "2",
        isLiked = true,

        age = "2 years",
        name = "Magnus",
        breedName = "Yorkshire terrier",
        picture = "https://images.unsplash.com/photo-1605197161470-d0261cac6767?ixid=MXwxMjA3fDB8MHxzZWFyY2h8N3x8eW9ya3NoaXJlJTIwdGVycmllcnxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "The Yorkshire Terrier (often shortened as Yorkie) is one of the smallest dog breed of terrier type, and of any dog breed. The breed developed during the 19th century in Yorkshire, England. Ideally its maximum size is 7 pounds (3.2 kg).",
        location = "Cleveland, OH, USA",
        weight = 3.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        animalType = "Dog"

    ),

    PupModel(
        id = "3",
        isLiked = false,

        age = "2 years",
        name = "Lobo",
        breedName = "Rottweiler",
        picture = "https://cdn.pixabay.com/photo/2017/03/20/20/57/rottweiler-2160308__480.jpg",
        isFemale = true,
        description = "The Rottweiler was originally dogs bred to drive cattle to market. Later they were used to pull carts for butchers. They were among the earliest police dogs and serve with honor in the military. Most important, they are popular family guardians and friends.",
        location = "Cleveland, OH, USA",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        animalType = "Dog"

    ),
    PupModel(
        id = "4",
        isLiked = true,
        age = "2 years",
        name = "Rusty",
        breedName = "Maltese",
        picture = "https://images.unsplash.com/photo-1604543219730-fa94b8e359e3?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTF8fG1hbHRlc2UlMjBkb2d8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "A gentle and fearless dog breed, the Maltese greets everyone as a friend. Their glamorous white coat gives them a look of haughty nobility, but looks can be deceiving. Even though these are purebred dogs, you may find them in the care of shelters or rescue groups.",
        location = "Cleveland, OH, USA",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        animalType = "Dog"

    ),

    PupModel(
        id = "5",
        isLiked = false,
        age = "2 years",
        name = "Rover",
        breedName = "Maltese",
        picture = "https://images.unsplash.com/photo-1577447310651-8453e529e838?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTd8fG1hbHRlc2UlMjBkb2d8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "A gentle and fearless dog breed, the Maltese greets everyone as a friend. Their glamorous white coat gives them a look of haughty nobility, but looks can be deceiving. Even though these are purebred dogs, you may find them in the care of shelters or rescue groups.",
        location = "Cleveland, OH, USA",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        animalType = "Dog"

    ),

    PupModel(
        id = "6",
        isLiked = false,

        age = "2 years",
        name = "Ollie",
        breedName = "Poodle",
        picture = "https://images.unsplash.com/photo-1604779122531-d68b78f0a076?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=881&q=80",
        isFemale = true,
        description = "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed's origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet.",
        location = "Cleveland, OH, USA",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        animalType = "Dog"

    ),

    PupModel(
        id = "7",
        isLiked = false,

        age = "2 years",
        name = "Thea",
        breedName = "Beagle",
        picture = "https://images.unsplash.com/photo-1605785721885-c8ab2ad9d3f3?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJlYWdsZXN8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "The beagle is a breed of small hound that is similar in appearance to the much larger foxhound. The beagle is a scent hound, developed primarily for hunting hare (beagling).",
        location = "Cleveland, OH, USA",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina",
        animalType = "Dog"

    ),
    PupModel(
        id = "8",
        isLiked = true,

        age = "1 year",
        name = "Resin",
        breedName = "Poodle",
        animalType = "Dog",
        picture = "https://images.unsplash.com/photo-1568106640696-a04935b09b21?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NXx8cG9vZGxlfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed's origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet.",
        location = "FakeLocation",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina"
    ),
    PupModel(
        id = "9",
        age = "1 year",
        name = "Jingle",
        breedName = "Pug",
        animalType = "Dog",
        isLiked = false,

        picture = "https://images.unsplash.com/photo-1523626797181-8c5ae80d40c2?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OHx8cHVnJTIwZG9nfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "Pugs are one of three types of short-nosed dogs that are known to have been bred by the Chinese: the Lion dog, the Pekingese, and the Lo-sze, which was the ancient Pug. Some think that the famous \"Foo Dogs\" of China are representations of the ancient Pug.",
        location = "FakeLocation",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "Ms. Tina"
    ),

    PupModel(
        id = "10",
        age = "1 year",
        name = "Sammy",
        breedName = "Persian Cat",
        animalType = "Cat",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1611660103876-9341366079d9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8cGVyc2lhbiUyMGNhdHxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "The Persian is the most popular pedigreed cat in North America, if not the world. He first came into vogue during the Victorian era, but he existed long before then. Little is known about his early history, though.\u2028\u2028The Persian comes in two types: show and traditional. ",
        location = "Hyderabad",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John"
    ),

    PupModel(
        id = "11",
        age = "1 year",
        name = "Laney",
        breedName = "Persian Cat",
        animalType = "Cat",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1583142551012-ac2bbc1089d4?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MzF8fHBlcnNpYW4lMjBjYXR8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        description = "The Persian is the most popular pedigreed cat in North America, if not the world. He first came into vogue during the Victorian era, but he existed long before then. Little is known about his early history, though.\u2028\u2028The Persian comes in two types: show and traditional. ",
        location = "Hyderabad",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John"
    ),
    PupModel(
        id = "12",
        age = "1 year",
        name = "Soni",
        breedName = "Ragdoll",
        animalType = "Cat",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1585373683920-671438c82bfa?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8cmFnZG9sbCUyMGNhdHxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,

        location = "Hyderabad",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "The Ragdoll is a cat breed with a color point coat and blue eyes. They are large and muscular semi-longhair cats with a soft and silky coat. Developed by American breeder Ann Baker in the 1960s, they are best known for their docile and placid temperament and affectionate nature."
    ),
    PupModel(
        id = "13",
        age = "1 year",
        name = "Stella",
        breedName = "Ragdoll",
        animalType = "Cat",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1558674377-b76fd3961434?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Nnx8cmFnZG9sbCUyMGNhdHxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = 1.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "The Ragdoll is a cat breed with a color point coat and blue eyes. They are large and muscular semi-longhair cats with a soft and silky coat. Developed by American breeder Ann Baker in the 1960s, they are best known for their docile and placid temperament and affectionate nature."
    ),
    PupModel(
        id = "14",
        age = "1 year",
        name = "Juan",
        breedName = "Eclectus",
        animalType = "Parrot",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1544923408-75c5cef46f14?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8cGFycm90fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = .5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "The striking eclectus is a large parrot that offers multiple options. Being a sexually dimorphic species, the male and female eclectus have distinct plumage. Males are vivid green while females are red with bluish-purple accents. There also are three distinct subspecies of eclectus parrots. Like many other large parrots, the eclectus has a long lifespan of over 50 years in captivity with proper care."
    ),
    PupModel(
        id = "15",
        age = "1 year",
        name = "Lobo",
        breedName = "Umbrella Cockatoo",
        animalType = "Parrot",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1552728089-57bdde30beb3?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cGFycm90fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = .5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "With proper care, umbrella cockatoos can live 70 to 80 years or more in captivity. These birds tend to be gentle and sweet, forming strong bonds with their caretakers. Many love to cuddle up to their favorite person (or bird) and can be distraught whenever they are separated. So it’s important to have enough time to spend with these smart, social birds."
    ),
    PupModel(
        id = "16",
        age = "1 year",
        name = "Kiara",
        breedName = "Hyacinth Macaw",
        animalType = "Parrot",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1592089416462-2b0cb7da8379?ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8cGFycm90fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = .5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "With proper care, umbrella cockatoos can live 70 to 80 years or more in captivity. These birds tend to be gentle and sweet, forming strong bonds with their caretakers. Many love to cuddle up to their favorite person (or bird) and can be distraught whenever they are separated. So it’s important to have enough time to spend with these smart, social birds."
    ),
    PupModel(
        id = "126",
        age = "1 year",
        name = "Dutch Rabbit",
        breedName = "Dutch Rabbit",
        animalType = "Bunny",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1591382386627-349b692688ff?ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8cmFiYml0fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = 2.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "Developed in England in the 1830s, the Dutch is one of the most popular breeds. Socializing is key for this energetic rabbit, who can become depressed if it spends too much time in its cage. Thanks to its easygoing attitude, children are more than welcomed to care for it.",
    ),

    PupModel(
        id = "33",
        age = "1 year",
        name = "Blanc de Hotot",
        breedName = "Dutch Rabbit",
        animalType = "Bunny",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1559214369-a6b1d7919865?ixid=MXwxMjA3fDB8MHxzZWFyY2h8N3x8cmFiYml0fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = 3.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "Developed in England in the 1830s, the Dutch is one of the most popular breeds. Socializing is key for this energetic rabbit, who can become depressed if it spends too much time in its cage. Thanks to its easygoing attitude, children are more than welcomed to care for it.",
    ),

    PupModel(
        id = "33",
        age = "1 year",
        name = "Blanc de Hotot",
        breedName = "Laila",
        animalType = "Bunny",
        isLiked = false,
        picture = "https://images.unsplash.com/photo-1585110396000-c9ffd4e4b308?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8cmFiYml0fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
        isFemale = true,
        location = "Hyderabad",
        weight = 2.5,
        friendlyLevel = 8,
        intelligentLevel = 8,
        owner = "John",
        description = "Developed in England in the 1830s, the Dutch is one of the most popular breeds. Socializing is key for this energetic rabbit, who can become depressed if it spends too much time in its cage. Thanks to its easygoing attitude, children are more than welcomed to care for it.",
    )
)
